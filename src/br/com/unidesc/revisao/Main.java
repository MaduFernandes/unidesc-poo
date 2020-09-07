package br.com.unidesc.revisao;

public class Main {

    public static void main(String[] args) {
        Cao cao = new Cao();
        cao.setRaca("Lhasa");
        cao.setNome("Ruffus");
        cao.setIdade(3);
        cao.setTamanho("médio");
        System.out.print("O " + cao.getNome() + " tem " + cao.getIdade() + " anos ");
        System.out.print("sua raça é " + cao.getRaca() + " e seu tamanho é " + cao.getTamanho() + " ");
        System.out.println("ele não gosta de latir");

        Cao cao1 = new Cao();
        cao1.setNome("Dom");
        cao1.setIdade(7);
        cao1.setRaca("Puddle");
        cao1.setTamanho("médio");
        System.out.print("O " + cao1.getNome() + " tem " + cao1.getIdade() + " anos ");
        System.out.print("sua raça é " + cao1.getRaca() + " e seu tamanho é " + cao1.getTamanho() + " ");
        System.out.print("ele gosta de latir ");
        cao1.emitirSom();

        Gato gato = new Gato();
        gato.setNome("Jack");
        gato.setIdade(2);
        gato.setRaca("Siamês");
        gato.setTamanho("médio");
        System.out.print("O " + gato.getNome() + " tem " + gato.getIdade() + " anos ");
        System.out.print("sua raça é " + gato.getRaca() + " e seu tamanho é " + gato.getTamanho() + " ");
        gato.emitirSom();
    }
}
