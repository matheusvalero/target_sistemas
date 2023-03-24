package targetpack;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci extends Exercicio{
    private List<Integer> fibonacci;

    public List<Integer> segundoExercicio(){
        Scanner inputando = new Scanner(System.in);
        System.out.print("Escolha um numero para verificar se e fibonacci ou nao: ");
        int numero_escolhido = inputando.nextInt();

        //criando uma lista que receba os dois primeiros numeros da sequencia fibonacci (0,1)
        //depois criei um loop que sempre fará a adição do ultmo e penultimo numero da lista "sequencia_fibo"
        List<Integer> sequencia_fibo = new ArrayList<Integer>();
        sequencia_fibo.add(0);
        sequencia_fibo.add(1);
        while (sequencia_fibo.get(sequencia_fibo.size() - 1) < numero_escolhido) {
            int novo_elemento = sequencia_fibo.get(sequencia_fibo.size() - 1) + sequencia_fibo.get(sequencia_fibo.size() - 2);
            sequencia_fibo.add(novo_elemento);
        }
        //verificando se o numero selecionado está na sequencia fibonacci
        if (sequencia_fibo.contains(numero_escolhido)) {
            System.out.println("O numero " + numero_escolhido + " pertence a sequencia fibonacci\n\n");
        } else {
            System.out.println("O numero " + numero_escolhido + " nao pertence a sequencia fibonacci\n\n");
        }  
        inputando.close();                                                                                                                    
        return sequencia_fibo;
    }

    public List<Integer> getFibonacci(){
        return this.fibonacci;
    }

    public void setFibonacci(List<Integer> fibonacci) {
        this.fibonacci = fibonacci;
    }
}