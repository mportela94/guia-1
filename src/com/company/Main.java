package com.company;

public class Main {

    public static void main(String[] args) {

        /*1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una
        variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
        A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
        diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
        variable C.*/

        int N = 18;
        double A= 24.5697;
        char C = 'V';

        System.out.println("\nEl entero N es:\t" + N);
        System.out.println("El entero A es:\t" + A);
        System.out.println("El char C es:\t" + C);

        double suma=0;
        double resta=0;
        suma=N+A;
        resta=A-N;

        System.out.println("\nLa suma de N y A es:\t" + suma);
        System.out.println("\nLa diferencia de A y N es:\t" + resta);
        System.out.println("\nEl valor numerico de C es:\t" + (int)C);




    }
}
