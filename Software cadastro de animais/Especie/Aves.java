package Especie;

import Interfaces.Animal;

public class Aves extends AnimalZoologico implements Animal{

    private boolean voa;
    private String corPena;
    private String tipoAlimentacao;
    private Double distanciaVoo;
   
    public Aves(boolean voa, String corPena, String tipoAlimentacao, double distanciaVoo, int numeroIdentificacao, int numeroGaiola, boolean estaExtincao){
        super(numeroIdentificacao, numeroGaiola, estaExtincao);
        setvoa(voa);
        setCorPena(corPena);
        setTipoAlimentacao(tipoAlimentacao);
        setDistanciaVoo(distanciaVoo);
    
    }

   public boolean getvoa(){
        return voa;
   }
   public void setvoa(boolean voa) {
       this.voa = voa;
   }

   public String getCorPena() {
       return corPena;
   }
   public void setCorPena(String corPena) {
       this.corPena = corPena;
   }
   
   public String getTipoAlimentacao() {
       return tipoAlimentacao;
   }
   public void setTipoAlimentacao(String tipoAlimentacao) {
       this.tipoAlimentacao = tipoAlimentacao;
   }

   public Double getDistanciaVoo() {
       return distanciaVoo;
   }
   public void setDistanciaVoo(Double distanciaVoo) {
       this.distanciaVoo = distanciaVoo;
   }

    @Override
    public void comunicar() {
        System.out.println("Aves se comunicam piando");
    }

    @Override
    public void andar() {
        System.out.println("Aves se locomovem  pulando ou voando");
    }

    @Override
    public void reproduzir() {
        System.out.println("Aves se reproduzem botando ovos");
    }

    public void imprimirMetodos(){
        comunicar();
        andar();
        reproduzir();
        alimentar();
    }
}
