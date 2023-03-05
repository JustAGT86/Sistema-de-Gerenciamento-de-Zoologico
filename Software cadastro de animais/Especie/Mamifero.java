package Especie;

import Interfaces.Animal;

public class Mamifero extends AnimalZoologico implements Animal{

    private String corPelo;
    private int quantidadePatas;
    private String tipoAlimentacao;
   
    public Mamifero(String corPelo, int quantidadePatas, String tipoAlimentacao, int numeroIdentificacao, int numeroGaiola, boolean estaExtincao){
        super(numeroIdentificacao, numeroGaiola, estaExtincao);
        setCorPelo(corPelo);
        setQuantidadePatas(quantidadePatas);
        setTipoAlimentacao(tipoAlimentacao);
    }

   public String getCorPelo() {
       return corPelo;
   }
   public void setCorPelo(String corPelo) {
       this.corPelo = corPelo;
   }
   
   public int getQuantidadePatas() {
       return quantidadePatas;
   }
   public void setQuantidadePatas(int quantidadePatas) {
       this.quantidadePatas = quantidadePatas;
   }
   
   public String getTipoAlimentacao() {
       return tipoAlimentacao;
   }
   public void setTipoAlimentacao(String tipoAlimentacao) {
       this.tipoAlimentacao = tipoAlimentacao;
   }

    @Override
    public void comunicar() {
        System.out.println("Os mamiferos se comunicam de diversas formas");
    }

    @Override
    public void andar() {
        System.out.println("Dependendo dos mamiferos é possivel locomover com 2 ou 4 patas");
    }

    @Override
    public void reproduzir() {
        System.out.println("Os mamiferos se reproduzem com o embrião dentro da mãe");
    }

    public void imprimirMetodos(){
        comunicar();
        andar();
        reproduzir();
        alimentar();
    }
}
