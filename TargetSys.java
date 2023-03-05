//Criei uma versão em Java mais simples, porém aconselho a olhar o arquivo .py, o código em Python está muito mais trabalhado e polido
//Peço por favor que dê uma olhada primeiramente no código Python, e caso tenha que escolher um para avaliação, escolha o código em Python
//Mesmo assim, aqui está o código em Java! estou estudando e me aperfeiçoando cada vez mais em Java...

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class TargetSys {
    public static void main(String[] args) {
        problema1();
        problema2();
        problema3();
        problema4();

        Scanner esca = new Scanner(System.in);
        System.out.print("Digite uma frase qualquer: ");
        String frase = "";
        if (esca.hasNextLine()) {
            frase = esca.nextLine();
        }
        String fraseinvertida = problema5(frase);

        System.out.println("Assim fica a frase invertida: " + fraseinvertida);
        esca.close();
    }


    static void problema1() {
        System.out.println("\nBem vindo(a) as respostas do Matheus para o processo seletivo Target!\n");

        System.out.println("int INDICE = 13, SOMA = 0, K = 0;\nenquanto K < INDICE faça\n{\nK = K + 1;\nSOMA = SOMA + K;\n}\nimprimir(SOMA);\n\n");

        int indice = 13;
        int soma = 0;
        int k = 0;
        while (k < indice) {
            k += 1;
            soma += k;
        }
        System.out.println("O valor da variavel soma e " + soma + "\n\n");
    }


    public static List<Integer> problema2() {

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


    static void problema3() {
        ArrayList<ArrayList<Integer>> sequencias = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(1, 3, 5, 7)),
                        new ArrayList<>(Arrays.asList(2, 4, 8, 16, 32, 64)),
                        new ArrayList<>(Arrays.asList(0, 1, 4, 9, 16, 25, 36)),
                        new ArrayList<>(Arrays.asList(4, 16, 36, 64)),
                        new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8)),
                        new ArrayList<>(Arrays.asList(2, 10, 12, 16, 17, 18, 19))
                )
        );

        ArrayList<Integer> valores_certos = new ArrayList<>(Arrays.asList(9, 128, 49, 100, 13, 200));

        for (int i = 0; i < sequencias.size(); i++) {
            ArrayList<Integer> sequencia = sequencias.get(i);
            int valor = valores_certos.get(i);
            sequencia.add(valor);
            System.out.printf("%c) %s, %d%n", 'a' + i, sequencia, valor);
        }
        System.out.println("\n\n");
    }

    static void problema4() {

        System.out.println("Dois veiculos (um carro e um caminhao) saem respectivamente de\n"+
        "cidades opostas pela mesma rodovia. O carro de Ribeirao Preto\n" +
        " em direcao a Franca, a uma velocidade constante de 110 km/h e \n"+
        "o caminhao de Franca em direcao a Ribeirao Preto a uma velocidade\n"+ 
        " constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estara mais proximo a cidade de Ribeirao Preto?\n" +
        "a) Considerar a distancia de 100km entre"+
        " a cidade de Ribeirao Preto <-> Franca.\n"+
        "b) Considerar 2 pedagios como obstaculo e que o caminhao leva 5 minutos"+
        " a mais para passar em cada um deles e o carro possui tag de pedagio (Sem Parar)\n"+
        "c) Explique como chegou no resultado.\n\n");

        System.out.println("Temos como referencia Ribeirao, a equacao do horario do carro e x_1 = v_1.t\n"+
        "O caminhao por sua vez sai de um local 100 km distante do ponto de referencia,"+
        " logo x_2 = 100km -v_2.t\n"+
        "O calculo do tempo sem obstaculos: t = 100/80 = 1,25\n"+
        "Perda de horas com o pedagio: 0,17 horas == 10 minutos\n"+
        "o tempo de viagem do caminhao: 0,17 + 1,25 = 1,42\n"+
        "Logo, v_2 = 100/1,42 = 70,6\n"+
        "110 vezes 100 / (110 + 70,6) = 60.9080841639"+
        "Arredondamos para 60,9km\n"+
        "Essa e a distancia em que os dois se cruzam, ambos na mesma distancia.\n\n");
    }

    static String problema5(String frase) {

        String frase_invertida = "";
        for ( int i = frase.length() -1 ; 0 <= i ; i++) {
            frase_invertida += frase.charAt(i);
        }
        System.out.println(frase_invertida);
        return frase;
    }
    
}