package Exercicio01_Lista01;
// 1.Escreva um programa em Java que leia uma matriz de inteiros de tamanho NxM (onde N
//e M são definidos pelo usuário) e retorne a posição (linha e coluna) do maior valor
//armazenado na matrix.
import java.util.Scanner;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int line ;
        int column ;

        System.out.println("Digite a linha da matriz: \n");
        line = scanner.nextInt();

        System.out.println("Digite a linha da coluna: \n");
        column = scanner.nextInt();


        int[][] TwoDimentionalArray = new int[line][column]; // not necessary show a name of matriz

        //Preencher a Matriz

        System.out.println("Digite os numeros dentro da linha ");
        for(int i =0; i < line;i++) {
            for(int j = 0;j < column;j++) {
                System.out.printf("Elementos [%d][%d]", i,j);
                TwoDimentionalArray[i][j] = scanner.nextInt();
            }

        }

        // Encontrar o maior valor

        int maiorValor = TwoDimentionalArray[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (TwoDimentionalArray[i][j] > maiorValor) {
                    maiorValor = TwoDimentionalArray[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        // Exibir resultado
        System.out.println("O maior valor na matriz é " + maiorValor + " na posição [" + linhaMaior + "][" + colunaMaior + "]");




    }
}
