package Interfaces;
public interface AnimalDAO {
    
    public boolean insert(Animal obj);
    public boolean update(Animal obj);
    public boolean delete (int id);
    public Animal select(int id);
    
}
