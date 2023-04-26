//PARA AVALIAÇÃO DO PROCESSO SELETIVO, POR FAVOR CONSIDERAR ANALISAR PRIMEIRAMENTE O CÓDIGO EM PYTHON E DEPOIS ANALISAR ESTE EM JAVA

//Criei uma versão em Java mais simples, porém aconselho a olhar o arquivo .py, o código em Python está muito mais trabalhado/explicado e polido
//Caso tenha que escolher um para a avaliação, peço que escolha o código em Python
//Mesmo assim, aqui está o código em Java!...

package targetpack;
import java.util.Scanner;

public class TargetSys {
    public static void main(String[] args) {
        Exercicio ex1 = new Exercicio();
        ex1.primeiroExercicio(0, 13, 0);

        Fibonacci ex2 = new Fibonacci();
        ex2.segundoExercicio();

        ProgressaoMatematica ex3 = new ProgressaoMatematica();
        ex3.terceiroExercicio();

        Exercicio ex4 = new Exercicio();
        ex4.quartoExercicio();

        Scanner esca = new Scanner(System.in);
        System.out.print("Digite uma frase qualquer: ");
        String frase = esca.nextLine();

        String frase_invertida = "";
        for ( int i = frase.length() -1 ; 0 <= i ; i++) {
            frase_invertida += frase.charAt(i);
        }

        System.out.println("Assim fica a frase invertida: " + frase_invertida);
        esca.close();

    }    
}
