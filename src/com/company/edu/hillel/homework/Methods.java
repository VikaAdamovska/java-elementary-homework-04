package com.company.edu.hillel.homework;

import java.util.Random;

public class Methods {

    public static void arrayFill(Random random, int[][] newArray, String arrayName, int minValue, int maxValue) {
        System.out.println("This is our " + arrayName);
        System.out.println(" ");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = (createRandomNumber(random, minValue, maxValue));
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static int createRandomNumber(Random randomGenerator, int minValue, int maxValue) {
        if (randomGenerator == null) {
            return 0;
        }
        return (int) (Math.random() * (maxValue - minValue) + minValue);
    }

    public static void multiplArrays(int[][] firstArrayFactor, int[][] secondArrayFactor, int firstSize, int secondSize) {
        System.out.println("The result of multiplying arrays: ");
        int[][] multiplResult = new int[firstSize][secondSize];
        for (int i = 0; i < multiplResult.length; i++) {
            for (int j = 0; j < multiplResult[i].length; j++) {
                multiplResult[i][j] = firstArrayFactor[i][j] * secondArrayFactor[i][j];
                System.out.print(multiplResult[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
