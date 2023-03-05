package DAO;
import java.util.ArrayList;
import java.util.List;

import Especie.Animais.Girafa;
import Interfaces.Animal;
import Interfaces.AnimalDAO;

public class GirafaDAO implements AnimalDAO {

    List<Girafa> listaGirafas=new ArrayList<>();

    @Override
    public boolean insert(Animal obj) {
        return listaGirafas.add((Girafa) obj);
        
    }

    @Override
    public boolean update(Animal obj) {
        if(listaGirafas.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaGirafas.size(); i++){
                Girafa girafa= listaGirafas.get(i);
                if(girafa.getNumeroIdentificacao()==((Girafa) obj).getNumeroIdentificacao()){
                    girafa.setAltura(((Girafa) obj).getAltura());
                    girafa.setTamanhopescoco(((Girafa) obj).getTamanhopescoco());
                    girafa.setNumeroGaiola(((Girafa) obj).getNumeroGaiola());
                    girafa.setEstaExtincao(((Girafa) obj).getEstaExtincao());
                    return true;
                }
                
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if(listaGirafas.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaGirafas.size(); i++){
                Girafa girafa= listaGirafas.get(i);
                if(girafa.getNumeroIdentificacao()==girafa.getNumeroIdentificacao()){
                    listaGirafas.remove(girafa);
                    return true;
                }
                
            }
        }
        return false;
    }

    @Override
    public Animal select(int id) {
        if(listaGirafas.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaGirafas.size() ;i++){
                Girafa girafa= listaGirafas.get(i);
                if(girafa.getNumeroIdentificacao()==id){
                    girafa.imprimirMetodos();
                    return girafa;
                }
                
            }
        }
        return null;
    }
    
}
