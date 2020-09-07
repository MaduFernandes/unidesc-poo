package br.com.unidesc.revisao;

import br.com.unidesc.revisao.som.Som;

public class Cao extends Animal implements Som {

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
}
