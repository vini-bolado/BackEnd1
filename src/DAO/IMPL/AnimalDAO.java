package DAO.IMPL;

import DAO.ConfiguracaoJDBC;
import DAO.animalDAO;
import MODEL.Animal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO implements animalDAO<Animal> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public AnimalDAO(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Animal salvarAnimal(Animal animal) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String QUERY = "insert into animal(dente,pelo,olhos) values(? , ?, ?)";
        try{
            connection = configuracaoJDBC.Conex();
            preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setString(1, animal.getDente());
            preparedStatement.setString(2, animal.getPelo());
            preparedStatement.setString(3, animal.getOlhos());

            preparedStatement.execute();

            preparedStatement.close();
            connection.close();
        }catch (SQLException sqlException){

            sqlException.printStackTrace();

        }
        return animal;
    }

    @Override
    public List<Animal> buscarTodosAnimais() {
        Connection connection = null;
        Statement statement = null;
        String QUERY = "select * from animal";
        List<Animal> animalsList = new ArrayList<>();
        try{
            connection = configuracaoJDBC.Conex();
            statement = connection.createStatement();
            statement.execute(QUERY);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()){
                Animal animal = new Animal
                (
                resultSet.getString("dente"),
                resultSet.getString("olhos"),
                resultSet.getString("pelo")
                );
                animalsList.add(animal);
            }
            statement.close();
            connection.close();
        }catch (SQLException sqlException){

            sqlException.printStackTrace();

        }
        return animalsList;
    }


}

