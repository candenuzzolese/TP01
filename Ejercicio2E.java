package TP01;

import java.util.Comparator;

public class Ejercicio2E {

    public static <T extends Comparable> void selectionSort(T[] array) {

        T min;
        int index = 0;

        for (int i = 0; i < array.length - 1; i++) {

            min = array[i];
            index = i;
            for (int j = i + 1; j < array.length; j++) {

                if (min.compareTo ( array[j] ) > 0) {

                    min = array[j];
                    index = j;


                }

            }

            array[index] = array[i];
            array[i] = min;

        }


    }


    public static <T extends Comparable> void bubbleSort(T[] array) {

        T aux;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j + 1].compareTo ( array[j] ) < 0) {
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;

                }

            }

        }

    }


    public static <T extends Comparable> void insertionSort(T[] array) {


        for (int i = 0; i < array.length; i++) {
            T key = array[i];
            int n = i - 1;

            while ((i > -1) && key.compareTo ( array[i] ) < 0) {


                i--;
            }

            array[i + 1] = key;


        }

    }

}
