package ExerciciosDia23Fevereiro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose.ncdantas
 */
public class Exercicio02 {

    public static void main(String[] args) {
        int[][] a = {
            {0, 6},
            {-1, 2},
            {5, 0},};

        System.out.println("-- Matriz A --");
        imprimir(a);
        int[][] t = transposta(a);
        System.out.println("--Matriz At--");
        imprimir(t);

    }

    /**
     * @param args the command line arguments
     */
    public static int[][] transposta(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[j][i] = a[i][j];

            }
        }
        return t;
    }

    public static void imprimir(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[j][i]);
            }

        }
    }

}
