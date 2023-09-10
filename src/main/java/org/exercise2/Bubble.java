/*
 * In this exercise we are going to do a Bubble algorithm to reorder an array
 */
package org.exercise2;

import java.util.*;

public class Bubble {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int maxNumber = random.nextInt(100);
        int sizeArray = 50;
        int aux = 0;
        int iter = 0;
        int cont = 0;

        int[] arrayInt = new int[sizeArray]; // Init array

        for (int i = 0; i < sizeArray-1; i++) { //Filling array
            arrayInt[i] = random.nextInt(maxNumber);
        }

        System.out.print("Unordered array: ");//Show first array
        showArray(arrayInt);
        System.out.println();

        for (int i = 1; i < sizeArray-1; i++) { //Start algorithm
            for (int j = 0; j < sizeArray-i; j++) {
                if (arrayInt[j] > arrayInt[j+1]){
                    aux = arrayInt[j];
                    arrayInt[j] = arrayInt[j+1];
                    arrayInt[j+1] = aux;
                    showArray(arrayInt);
                    cont++;
                }
                iter++;
            }
        }
        System.out.println("\n\nIterations: " + iter + "\nTimes on IF: " + cont);
    }

    public static void showArray(int arrayShow[]) {//Function for show the Array
        System.out.print("\n");
        for (int i = 0; i < arrayShow.length; i++) {
            System.out.print(arrayShow[i] + " ");
        }
    }

}
