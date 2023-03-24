package targetpack;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgressaoMatematica extends Exercicio{
    public void terceiroExercicio(){
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
}