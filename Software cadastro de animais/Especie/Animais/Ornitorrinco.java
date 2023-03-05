package Especie.Animais;

import Especie.Mamifero;

public class Ornitorrinco extends Mamifero {

    public Ornitorrinco(String corPelo, int quantidadePatas, String tipoAlimentacao, int numeroIdentificacao,
            int numeroGaiola, boolean estaExtincao) {
        super(corPelo, quantidadePatas, tipoAlimentacao, numeroIdentificacao, numeroGaiola, estaExtincao);
    }
    
    @Override
    public void reproduzir() {
        System.out.println("Por mais do ornitorrinco ser um mamifero ele bota ovos");
    }

    @Override
    public void alimentar(){
        super.alimentar();
        System.out.println("Os ornitorrincos se alimentam com pequenos peixes, camarões, carangueijos e outros insetos aquaticos");
    }
    
    @Override
    public void comunicar() {
        super.comunicar();
        System.out.println("O ornitorrinco rosna quando ameaçados e outras vocalizações");
    }
}
