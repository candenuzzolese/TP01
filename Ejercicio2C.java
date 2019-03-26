package TP01;

import java.util.Random;

public class Ejercicio2C {


        int [] array;

        static void bubbleSort(int arrayLenght) {

            //generate a random array

            int[] array = new int[arrayLenght];

            Random r = new Random ();

            for (int i = 0; i < array.length; i++) {
                array[i] = r.nextInt ();

            }

            //sort

            int temp = 0;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 1; j < (array.length - i); j++) {
                    if (array[j - 1] > array[j]) {
                        //swap elements
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }

                }
            }

            //solo para el test y que se printee ordenado

            for (int i = 0; i <array.length ; i++) {

                System.out.println (array[i]);
            }
        }






        void insertionSort( int arrayLenght) {


            //generate a random array

            int[] array = new int[arrayLenght];

            Random r = new Random ();

            for (int i = 0; i < array.length; i++) {
                array[i] = r.nextInt ();

            }


            //SORT

            for (int j = 1; j < array.length; j++) {
                int key = array[j];
                int i = j-1;
                while ( (i > -1) && ( array [i] > key ) ) {
                    array [i+1] = array [i];
                    i--;
                }
                array[i+1] = key;
            }

            //solo para el test y que se printee ordenado

            for (int i = 0; i <array.length ; i++) {

                System.out.println (array[i]);
            }
        }





            void selectionSort(int arrayLenght) {

                //generate a random array

                int[] array = new int[arrayLenght];

                Random r = new Random ();

                for (int i = 0; i < array.length; i++) {
                    array[i] = r.nextInt ();

                }

                //SELECTION SORT a partir de aca

                for (int i = 0; i < array.length - 1; i++) {
                    int min_idx = i;
                    for (int j = i + 1; j < array.length - 1; j++)
                        if (array[j] < array[min_idx])
                            min_idx = j;

                    //cambia el minimo elemento al primero
                    int temp = array[min_idx];
                    array[min_idx] = array[i];
                    array[i] = temp;
                }

        //solo para el test y que se printee ordenado

                for (int i = 0; i <array.length ; i++) {

                    System.out.println (array[i]);
                }
            }



}




