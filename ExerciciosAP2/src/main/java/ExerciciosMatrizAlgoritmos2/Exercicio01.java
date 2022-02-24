package ExerciciosMatrizAlgoritmos2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose.ncdantas
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Linhas: ");
        int a = entrada.nextInt();
        System.out.println("Colunas: ");
        int b = entrada.nextInt();
        int[][] matriz = gerarMatriz(a, b);
        System.out.println("*--- Matriz Gerada ---*");
        imprimir(matriz);
    }

    /**
     * @param args the command line arguments
     */
    public static int[][] gerarMatriz(int linhas, int colunas) {

        Scanner entrada = new Scanner(System.in);
        int A[][] = new int[linhas][colunas];
        Random r = new Random();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = r.nextInt(101);;

            }

        }
        return A;
    }

    public static void imprimir(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }

        }
    }

}
