package TP01;

public class Ejercicio1 {

    private int [] a;



    public int SeqSearch(int a[],int k) {

        for (int i = 0; i < a.length; i++)
            if (k == a[i]) {

                return i;

            }

        return -1;


    }



    public int BinarySearch ( int a[], int k) {
        int min = 0;
        int max = a.length-1;
        int middle = (min+max)/2;
        while(min <= max) {

            if (k == a[middle])


                return middle;
            else if (k < a [middle] )
                max = middle-1;
            else
                min = middle +1;
            middle = (min+max)/2;
        }

        throw new RuntimeException ( "the value doesnt exist" );
    }




}
