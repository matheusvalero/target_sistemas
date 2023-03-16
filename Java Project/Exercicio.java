import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    private static int exercicio;

    public Exercicio(){
        Exercicio.exercicio++;
    }

    public void primeiroExercicio(int soma, int indice, int k){
        System.out.println("\nBem vindo(a) as respostas do Matheus para o processo seletivo Target!\n");
        System.out.println("int INDICE = 13, SOMA = 0, K = 0;\nenquanto K < INDICE faca\n{\nK = K + 1;\nSOMA = SOMA + K;\n}\nimprimir(SOMA);\n\n");

        while (k < indice) {
            k += 1;
            soma += k;
        }
        System.out.println("O valor da variavel soma e " + soma);
    }
    public void quartoExercicio(){
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

    public static String problema5(String frase) {

        String frase_invertida = "";
        for ( int i = frase.length() -1 ; 0 <= i ; i++) {
            frase_invertida += frase.charAt(i);
        }
        System.out.println(frase_invertida);
        return frase_invertida;
    }

    public void quintoExercicio(){
        Scanner esca = new Scanner(System.in);
        System.out.print("Digite uma frase qualquer: ");
        String frase = "";
        if (esca.hasNextLine()) {
            frase = esca.nextLine();
        }
        String fraseinvertida = problema5(frase);

        System.out.println("Assim fica a frase invertida: " + fraseinvertida);
        esca.close();

        System.out.println("Todos os " + Exercicio.getExercicio() + " exercicios foram completados.");
    }

    public static int getExercicio(){
        return Exercicio.exercicio;
    }
}
