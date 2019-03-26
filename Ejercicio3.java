package TP01;

public class Ejercicio3 {

    public static <T extends Comparable> void merge(T [] arrayA, T [] arrayB) {


        T[] arrayC = (T[]) new Comparable[arrayA.length + arrayB.length];
        int indexA = 0;
        int indexB = 0;
        int indexC = 0;

        while (indexA < arrayA.length && indexB < arrayB.length) {
            if (arrayA[indexA].compareTo ( arrayB[indexB] ) < 0) {

                arrayC[indexC] = arrayA[indexA];
                indexC++;
                indexA++;

            }
            arrayC[indexC] = arrayB[indexB];

            indexC++;
            indexB++;


        }

        while(indexB< arrayB.length){

            arrayC[indexC] = arrayB[indexB];
            indexB++;
            indexC++;

        }

        while(indexA < arrayA.length){


            arrayC[indexC] = arrayA[indexA];
            indexA++;
            indexC++;
        }

    }


}
