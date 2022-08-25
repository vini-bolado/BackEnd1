package SERVICES;

import DAO.IMPL.AnimalDAO;
import MODEL.Animal;

import java.util.List;

public class AnimalServices {

    private AnimalDAO animalDAO;


    public AnimalServices(AnimalDAO animalDAO) {
        this.animalDAO = animalDAO;
    }

    public List<Animal> animalList(){
        return animalDAO.buscarTodosAnimais();
    }

    public Animal salvarAnimal(Animal animal){
        return animalDAO.salvarAnimal(animal);
    }
}
