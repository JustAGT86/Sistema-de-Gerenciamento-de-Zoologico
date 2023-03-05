package Especie.Animais;

import Especie.Aves;

public class Pavao extends Aves{

    private boolean abrePena;

    public Pavao(boolean voa, String corPena, String tipoAlimentacao, double distanciaVoo, int numeroIdentificacao,
            int numeroGaiola, boolean estaExtincao, boolean abrePena) {
        super(voa, corPena, tipoAlimentacao, distanciaVoo, numeroIdentificacao, numeroGaiola, estaExtincao);
        setAbrePena(abrePena);
        
    }

    public boolean getAbrePena(){
        return abrePena;
    }
    public void setAbrePena(boolean abrePena) {
        this.abrePena = abrePena;
    }
    
    public void abrirPena() {
        if(getAbrePena()==true){
            System.out.println("Pavão abre pena");
        }
        else{
            System.out.println("Apenas pavões machos abrem as penas");
        }
    }

    @Override
    public void andar() {
        System.out.println("O pavão é muito pesado para voar por longos periodos de tempo");
    }

    @Override
    public void alimentar(){
        super.alimentar();
        System.out.println("O pavão prefere comer insetos e pequenos invertebrados, mas tambem come frutas");
    }

    @Override
    public void comunicar() {
        super.comunicar();
        System.out.println("Os pavões se comunicam atraves de gritos");
    }
}
