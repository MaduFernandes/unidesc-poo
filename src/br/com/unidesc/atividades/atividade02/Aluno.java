package br.com.unidesc.atividades.atividade02;

public class Aluno {

    private String nome;
    private String cpf;
    private String matricula;
    private String curso;

    public Aluno() {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setMatricula(matricula);
        this.setCurso(curso);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula(Aluno aluno) {
        return matricula;
    }
}
