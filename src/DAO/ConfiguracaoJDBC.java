package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {

    private String JDBCDriver;
    private String URL;
    private String nome;
    private String senha;

    public ConfiguracaoJDBC(String JDBCDriver, String URL, String nome, String senha) {
        this.JDBCDriver = JDBCDriver;
        this.URL = URL;
        this.nome = nome;
        this.senha = senha;
    }

    public ConfiguracaoJDBC() {
        this.JDBCDriver = "org.h2.Driver";
        this.URL = "jdbc:h2:~/teste;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nome = "";
        this.senha = "";
    }

    public Connection Conex(){
        Connection conexa = null;
        try{
            conexa = DriverManager.getConnection(this.URL,this.nome,this.senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexa;
    }

}
