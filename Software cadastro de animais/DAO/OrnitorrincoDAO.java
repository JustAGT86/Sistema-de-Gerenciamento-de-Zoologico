package DAO;
import java.util.ArrayList;
import java.util.List;

import Especie.Animais.Ornitorrinco;
import Interfaces.Animal;
import Interfaces.AnimalDAO;

public class OrnitorrincoDAO implements AnimalDAO  {

    List<Ornitorrinco> listaOrnitorrincos=new ArrayList<>();

    @Override
    public boolean insert(Animal obj) {
        return listaOrnitorrincos.add((Ornitorrinco) obj);
    }

    @Override
    public boolean update(Animal obj) {
        if(listaOrnitorrincos.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaOrnitorrincos.size(); i++){
                Ornitorrinco ornitorrinco= listaOrnitorrincos.get(i);
                if(ornitorrinco.getNumeroIdentificacao()==((Ornitorrinco) obj).getNumeroIdentificacao()){
                    ornitorrinco.setNumeroGaiola(((Ornitorrinco) obj).getNumeroGaiola());
                    ornitorrinco.setEstaExtincao(((Ornitorrinco) obj).getEstaExtincao());
                    return true;
                }
                
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if(listaOrnitorrincos.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaOrnitorrincos.size(); i++){
                Ornitorrinco ornitorrinco= listaOrnitorrincos.get(i);
                if(ornitorrinco.getNumeroIdentificacao()==ornitorrinco.getNumeroIdentificacao()){
                    listaOrnitorrincos.remove(ornitorrinco);
                    return true;
                }
                
            }
        }
        return false;
    }

    @Override
    public Animal select(int id) {
        if(listaOrnitorrincos.size()==0){
            System.out.println("Não ha um animal desse tipo registrado");
        }
        else{
            for(int i=0; i<listaOrnitorrincos.size(); i++){
                Ornitorrinco ornitorrinco= listaOrnitorrincos.get(i);
                if(ornitorrinco.getNumeroIdentificacao()==id){
                    ornitorrinco.imprimirMetodos();
                    return ornitorrinco;
                }
                
            }
        }
        return null;
    }
    
}
