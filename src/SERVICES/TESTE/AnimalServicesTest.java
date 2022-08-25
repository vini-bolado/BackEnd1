package SERVICES.TESTE;

import DAO.ConfiguracaoJDBC;
import DAO.IMPL.AnimalDAO;
import MODEL.Animal;
import SERVICES.AnimalServices;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalServicesTest {

    AnimalServices animalServices = new AnimalServices(new AnimalDAO(new ConfiguracaoJDBC()));

    @Test
    public void salvarAnimal(){
        Animal animal = new Animal("branco","4","2");
        animalServices.salvarAnimal(animal);
    }

    @Test
    public void setAnimal(){
        assertEquals(0,animalServices.animalList().size());
    }
}