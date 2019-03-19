package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*- создать два массива array1, array2 размером [10][20]
          - заполнить эти массивы случайными значениями от 0 до 100
          - перемножить значение елементов массива array1 на array2, результат сохранить в массив array3*/

        byte[][] array1 = new byte[10][20];
        byte[][] array2 = new byte[10][20];
        int[][] array3 = new int[10][20];
        Random random = new Random();

        int minInt = 0;
        int maxInt = 100;
        System.out.println("It is array 1");
        System.out.println(" ");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (byte) (Math.random() * (maxInt - minInt) + minInt);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("It is array 2");

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = (byte) (Math.random() * (maxInt - minInt) + minInt);
                System.out.print(array2[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("It is array 3");

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = array1[i][j] * array2[i][j];
                System.out.print(array3[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
