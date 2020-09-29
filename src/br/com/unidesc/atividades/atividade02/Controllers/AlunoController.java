package br.com.unidesc.atividades.atividade02.Controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import br.com.unidesc.atividades.atividade02.Aluno;
import br.com.unidesc.atividades.atividade02.Interfaces.IAluno;

public class AlunoController implements IAluno {
    // Fazer uma injeção de depedencia do AlunoService

    // Colocar o meu Array aluno dentro do AlunoService

    ArrayList<Aluno> alunos = new ArrayList<>();

    private Integer semestre;

    Aluno novoAluno = new Aluno();

    public AlunoController() {

    }

    public void create() {
        novoAluno.setNome("Maria Eduarda");
        novoAluno.setCpf("123456987-40");
        novoAluno.setCurso("Sistemas de Informação");
        novoAluno = geradorMatricula();
        alunos.add(novoAluno);
    }

    public void findAll() {
        alunos.forEach(aluno -> System.out.println("Aluno: " + aluno.getNome() + " \ncpf: " + aluno.getCpf() +
                " \ncurso: " + aluno.getCurso()));
    }

    public void update(Aluno aluno) {
        novoAluno.setNome("Odilon");
        alunos.add(novoAluno);
        System.out.println(novoAluno);
    }

    public void destroy(Aluno aluno) {
        if (alunos.isEmpty()) {
            System.out.println("Não é possível deletar um registro");
        } else {
            alunos.remove(aluno);
            System.out.println("Aluno excluido com sucesso!!");
        }
    }


    public Aluno geradorMatricula() {
        Random valorRandomico = new Random();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar data = Calendar.getInstance();
        if (data.get(Calendar.MONTH) <= 6) {
            semestre = 1;
        } else {
            semestre = 2;
        }

        System.out.println(dataFormatada.format(data.getTime()) + "-" + valorRandomico.nextInt(99) + "-" + semestre);
        return null;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Integer getSemestre() {
        return this.semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
}
