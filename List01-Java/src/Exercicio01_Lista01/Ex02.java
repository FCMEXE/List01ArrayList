package Exercicio01_Lista01;

//        2. Crie um programa em Java que implemente a união de dois arrays. O programa deve
//        receber dados para preencher dois arrays de inteiros e criar um novo array contendo a
//        união de v1 e v2. Por exemplo, se v1 = {11, 13, 45, 7} e v2 = {24, 4, 16, 81, 10, 12}, v3 irá
//        conter {11, 13, 45, 7, 24, 4, 16, 81, 10, 12}.

    import java.sql.Array;
    import java.util.ArrayList;
    import java.util.Arrays;
    import  java.util.Scanner;




public class Ex02 {
    public static void main(String[] args) {

        int[] ArrayV1 = {11, 13, 45, 7};
        int[] ArrayV2 = {24, 4, 16, 81, 10, 12};
        ArrayList<Integer> ArrayV3 = new ArrayList<>();
        for(int num : ArrayV1) {
            ArrayV3.add(num);
        }
        for (int num : ArrayV2) {
            ArrayV3.add(num);
        }
        System.out.println(ArrayV3);
    }



}
