package br.com.unidesc;

public class Multiplo {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++)
        {
            if (i%5==0)
            {
                System.out.println("Buzz ");
            } else if (i%3==0)
            {
                System.out.println("FIZZ ");
            } else if (i%3==0 && i%5==0)
            {
                System.out.println("FIZZBUZZ ");
            } else {
                System.out.println(i);
            }
        }
    }
}