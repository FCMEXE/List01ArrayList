
//        3. Crie um programa em Java que receba uma matriz quadrada de inteiros e retorne a
//        soma dos valores da diagonal principal da matriz.

package Exercicio01_Lista01;


import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int line = 0;
        int column = 0;
        int valor = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz quadrada:");
        valor = scanner.nextInt();
        line = valor;
        column = valor;

        int[][] twoDimensionalMatrix = new int[line][column];

        // Preencher a matriz
        System.out.println("Digite os elementos da matriz:");
        for(int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                twoDimensionalMatrix[i][j] = scanner.nextInt();
            }
        }

        int somaDosValoresDiagonalPrincipal = 0;

        // Calcular a soma dos valores da diagonal principal
        for (int i = 0; i < line; i++) {
            somaDosValoresDiagonalPrincipal += twoDimensionalMatrix[i][i];
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + somaDosValoresDiagonalPrincipal);

    }
}
