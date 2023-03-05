package Especie.Animais;
import Especie.Mamifero;
import Interfaces.Animal;
import Interfaces.AnimalDAO;

public class Girafa extends Mamifero implements AnimalDAO{

    private double altura;
    private double tamanhopescoco;

    public Girafa(String corPelo, int quantidadePatas, String tipoAlimentacao, int numeroIdentificacao, 
                    int numeroGaiola, boolean estaExtincao, double altura, double tamanhopescoco) {

        super(corPelo, quantidadePatas, tipoAlimentacao, numeroIdentificacao, numeroGaiola, estaExtincao);
        setAltura(altura);
        setTamanhopescoco(tamanhopescoco);                
        
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getTamanhopescoco() {
        return tamanhopescoco;
    }
    public void setTamanhopescoco(double tamanhopescoco) {
        this.tamanhopescoco = tamanhopescoco;
    }
    
    @Override
    public void alimentar(){
        super.alimentar();
        System.out.println("As girafas comem folhas de acácias, caules, flores e frutos");
    }

    @Override
    public void comunicar() {
        super.comunicar();
        System.out.println("As girafas se comunicam atraves de zumbidos");
    }

    @Override
    public boolean insert(Animal obj) {
        obj.comunicar();
        return true;
    }

    @Override
    public boolean update(Animal obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Animal select(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'select'");
    }

    
}

