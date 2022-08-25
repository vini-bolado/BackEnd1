package DAO;

import java.util.List;

public interface animalDAO <T> {

    public T salvarAnimal(T t);

    public List<T> buscarTodosAnimais();

}
