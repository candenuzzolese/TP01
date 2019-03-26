package TP01;


import org.junit.Test;

public class Ejercicio1Test {


    @Test
    public void Search(){

            int []b= {1,3,4,5,6};

            Ejercicio1 search = new Ejercicio1 ();


        System.out.println (search.SeqSearch ( b,6 ));

        System.out.println (search.BinarySearch ( b,3) );

        }

    }



