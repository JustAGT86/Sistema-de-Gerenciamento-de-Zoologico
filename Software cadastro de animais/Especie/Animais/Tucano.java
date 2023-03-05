package Especie.Animais;

import Especie.Aves;


public class Tucano extends Aves{

    String corBico;

    public Tucano(boolean voa, String corPena, String tipoAlimentacao, double distanciaVoo, int numeroIdentificacao,
            int numeroGaiola, boolean estaExtincao, String corBico) {
        super(voa, corPena, tipoAlimentacao, distanciaVoo, numeroIdentificacao, numeroGaiola, estaExtincao);
        setCorBico(corBico);
        
    }
    
    public String getCorBico() {
        return corBico;
    }
    public void setCorBico(String corBico) {
        this.corBico = corBico;
    }

    @Override
    public void alimentar(){
        super.alimentar();
        System.out.println("O tucano pode se alimentar frutas, insetos, ovos e filhotes de outras aves");
    }

    @Override
    public void comunicar() {
        super.comunicar();
        System.out.println("Os tucanos se comunicam atraves de grunhidos");
    }
}



