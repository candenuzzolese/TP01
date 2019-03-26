package TP01;

public class Ejercicio2G {

    static public int minIndex(int a[], int i, int j) {
        if (i == j)
            return i;


        int k = minIndex(a, i + 1, j);


        return (a[i] < a[k])? i : k;
    }


    static void recurSelectionSort(int a[], int n, int index) {


        if (index == n)
            return;


        int k = minIndex(a, index, n-1);


        if (k != index){

            int temp = a[k];
            a[k] = a[index];
            a[index] = temp;
        }
        recurSelectionSort(a, n, index + 1);
    }
}
