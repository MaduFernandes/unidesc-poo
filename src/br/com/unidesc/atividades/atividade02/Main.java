package br.com.unidesc.atividades.atividade02;

import br.com.unidesc.atividades.atividade02.Controllers.AlunoController;

public class Main {

    public static void main(String[] args) {

        AlunoController novoAluno = new AlunoController();

        novoAluno.create();
        novoAluno.findAll();
        novoAluno.update();
        novoAluno.destroy();

    }
}
