package Especie;
public abstract class AnimalZoologico {
    private int numeroIdentificacao;
    private int numeroGaiola;
    private boolean estaExtincao;
    
    public AnimalZoologico(int numeroIdentificacao, int numeroGaiola, boolean estaExtincao){
        setNumeroIdentificacao(numeroIdentificacao);
        setNumeroGaiola(numeroGaiola);
        setEstaExtincao(estaExtincao);
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }
    public void setNumeroIdentificacao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public int getNumeroGaiola() {
        return numeroGaiola;
    }
    public void setNumeroGaiola(int numeroGaiola) {
        this.numeroGaiola = numeroGaiola;
    }

    public boolean getEstaExtincao() {
        return estaExtincao;
    }
    public void setEstaExtincao(boolean estaExtincao) {
        this.estaExtincao = estaExtincao;
    }

    public void alimentar(){
        System.out.println("Os animais são alimentados com sua dieta natural todos os dias");
    }
}
