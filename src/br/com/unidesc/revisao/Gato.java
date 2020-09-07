package br.com.unidesc.revisao;

import br.com.unidesc.revisao.som.Som;

public class Gato extends Animal implements Som {

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
