
//PARA AVALIAÇÃO DO PROCESSO SELETIVO, POR FAVOR CONSIDERAR ANALISAR PRIMEIRAMENTE O CÓDIGO EM PYTHON

//Criei uma versão em Java mais simples, porém aconselho a olhar o arquivo .py, o código em Python está muito mais trabalhado e polido
//O código em Python está bem mais explicado e com menos bugs, caso tenha que escolher um para a avaliação, peço que escolha o código em Python
//Mesmo assim, aqui está o código em Java!...

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.print.event.PrintJobListener;

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

        Exercicio ex5 = new Exercicio();
        ex5.quintoExercicio();

    }    
}