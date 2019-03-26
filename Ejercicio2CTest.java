package TP01;

import org.junit.Test;

public class Ejercicio2CTest {

    @Test
   public void test001(){

        Ejercicio2C ej = new Ejercicio2C ();

        ej.selectionSort ( 65 );
        // tardo 2.86 segundos
        System.out.println ();
    ej.insertionSort ( 65 );
      // tardo 4.5 segundos aprox
        System.out.println ();
      ej.bubbleSort ( 65 );
     // tardo 3.6

    }

    @Test
    public void test002(){

       Ejercicio2C ej2 = new Ejercicio2C ();


       ej2.selectionSort (100);
        //tardo 3.51
        System.out.println ();

        ej2.insertionSort ( 100 );
        //3.75

        System.out.println ();
        ej2.bubbleSort ( 100 );
        //3.62

    }
}
