package DAO;
import java.util.ArrayList;
import java.util.List;

import Especie.Animais.Pavao;
import Interfaces.Animal;
import Interfaces.AnimalDAO;

public class PavaoDAO implements AnimalDAO {

    List<Pavao> listaPavoes=new ArrayList<>();

    @Override
    public boolean insert(Animal obj) {
        return listaPavoes.add((Pavao) obj);
    }

    @Override
    public boolean update(Animal obj) {
        if(listaPavoes.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaPavoes.size(); i++){
                Pavao pavao= listaPavoes.get(i);
                if(pavao.getNumeroIdentificacao()==((Pavao) obj).getNumeroIdentificacao()){
                    pavao.setCorPena(((Pavao) obj).getCorPena());
                    pavao.setDistanciaVoo(((Pavao) obj).getDistanciaVoo());
                    pavao.setNumeroGaiola(((Pavao) obj).getNumeroGaiola());
                    pavao.setEstaExtincao(((Pavao) obj).getEstaExtincao());
                    pavao.setAbrePena(((Pavao)obj).getAbrePena());
                    return true;
                }
                
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if(listaPavoes.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaPavoes.size(); i++){
                Pavao pavao= listaPavoes.get(i);
                if(pavao.getNumeroIdentificacao()==pavao.getNumeroIdentificacao()){
                    listaPavoes.remove(pavao);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Animal select(int id) {
        if(listaPavoes.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaPavoes.size(); i++){
                Pavao pavao= listaPavoes.get(i);
                if(pavao.getNumeroIdentificacao()==id){
                    pavao.imprimirMetodos();
                    return pavao;
                }
                
            }
        }
        return null;
    }
    
}
