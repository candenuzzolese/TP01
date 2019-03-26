package TP01;

public class Ejercicio2B {


    void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;

                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

    }


    void insertionSort(int array[], int n) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while ((j > -1) && (array[j] > key)) {
                array[j + 1] = array[j];
                j--;


            }

            array[j + 1] = key;
        }
    }

    // BubbleSort

    static void bubbleSort(int[] array) {
        int aux = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j - 1] > array[j]) {
                    //los cambio de lugar
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;

                }
            }
        }


    }
}
