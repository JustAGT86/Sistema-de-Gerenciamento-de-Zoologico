package DAO;
import java.util.ArrayList;
import java.util.List;

import Especie.Animais.Tucano;
import Interfaces.Animal;
import Interfaces.AnimalDAO;

public class TucanoDAO implements AnimalDAO {

    List<Tucano> listaTucanos=new ArrayList<>();

    @Override
    public boolean insert(Animal obj) {
        return listaTucanos.add((Tucano) obj);
    }

    @Override
    public boolean update(Animal obj) {
        if(listaTucanos.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaTucanos.size(); i++){
                Tucano tucano= listaTucanos.get(i);
                if(tucano.getNumeroIdentificacao()==((Tucano) obj).getNumeroIdentificacao()){
                    tucano.setCorPena(((Tucano) obj).getCorPena());
                    tucano.setDistanciaVoo(((Tucano) obj).getDistanciaVoo());
                    tucano.setNumeroGaiola(((Tucano) obj).getNumeroGaiola());
                    tucano.setEstaExtincao(((Tucano) obj).getEstaExtincao());
                    tucano.setCorBico(((Tucano) obj).getCorBico());
                    return true;
                }
                
            }
        }
        return false;
    }


    @Override
    public boolean delete(int id) {
        if(listaTucanos.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaTucanos.size(); i++){
                Tucano tucano= listaTucanos.get(i);
                if(tucano.getNumeroIdentificacao()==tucano.getNumeroIdentificacao()){
                    listaTucanos.remove(tucano);
                    return true;
                }
                
            }
        }
        return false;
    }

    @Override
    public Animal select(int id) {
        if(listaTucanos.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaTucanos.size(); i++){
                Tucano tucano= listaTucanos.get(i);
                if(tucano.getNumeroIdentificacao()==id){
                    tucano.imprimirMetodos();
                    return tucano;
                }
                
            }
        }
        return null;
    }
    
}
