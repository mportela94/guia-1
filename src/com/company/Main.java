package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int N=105;

        ej1();
        ej2();
        ej3(N);
        ej4();
        ej5(N);
        ej6(N);
        ej7(N);
        /*ej8();
        ej9();
        ej10();
        ej11();
        ej12();*/
        ej13();
        ej14();
        ej16();
        ej17();
    }

    public static void ej1 (){
        /*1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una
        variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
        A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
        diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
        variable C.*/
        System.out.println("\nEjercicio 1:");
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
        System.out.println("La diferencia de A y N es:\t" + resta);
        System.out.println("El valor numerico de C es:\t" + (int)C);
    }

    public static void ej2 (){
        /*2. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos
        variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar
        por pantalla una serie de operaciones entre ellas.*/
        System.out.println("\nEjercicio 2:");

        int X = 24;
        int Y = 5;
        double O = 5.9478;
        double M = 27.1298;

        double suma, resta, division, multiplicacion=0;

        suma= X+M;
        resta=Y-O;
        division= X/O;
        multiplicacion=Y*M;

        System.out.println("\nLa suma de X y M es:\t" + suma);
        System.out.println("La diferencia de Y y O es:\t" + resta);
        System.out.println("La division de X por O es:\t" + division);
        System.out.println("La multiplicacion de Y por M es:\t" + multiplicacion);

    }

    public static void ej3(int numero){
        /*3. Programa Java que declare una variable entera N, asignarle un valor. A continuación
        escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su
        valor a 3, duplicar su valor.*/
        System.out.println("\nEjercicio 3:");

        int N=numero;
        int X=0;
        System.out.println("\nN es:\t" + N);

        N=numero+77;
        System.out.println("N es:\t" + N);

        X=numero-3;
        N=numero-X;
        System.out.println("N es:\t" + N);

        N=numero*2;
        System.out.println("N es:\t" + N);
    }

    public static void ej4(){
        /*4. Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
        cada una. A continuación realiza las instrucciones necesarias para que: B tome el
        valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.*/
        System.out.println("\nEjercicio 4:");

        int A=5;
        int B=8;
        int C=17;
        int D=1;
        int aux=0;
        int aux2=0;

        System.out.println("\nA es:\t" + A);
        System.out.println("B es:\t" + B);
        System.out.println("C es:\t" + C);
        System.out.println("D es:\t" + D);

        aux=B;
        aux2=D;
        B=C;
        D=aux;
        aux=A;
        A=aux2;
        C=aux;

        System.out.println("\nA es:\t" + A);
        System.out.println("B es:\t" + B);
        System.out.println("C es:\t" + C);
        System.out.println("D es:\t" + D);
    }

    public static void ej5 (int numero){
        /*5. Programa Java que declare una variable A de tipo entero, asignarle un valor. A
        continuación mostrar un mensaje indicando si A es par o impar.*/

        System.out.println("\nEjercicio 5:");
        if (numero%2==0){
            System.out.println("\nEl numero es par.");
        }
        else
        {
            System.out.println("\nEl numero es impar.");
        }
    }

    public static void ej6(int numero){
        /*6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A
        continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.*/


        System.out.println("\nEjercicio 6:");
        if (numero>=0){
            System.out.println("\nEl numero es positivo");
        }else{
            System.out.println("\nEl numero es negativo");
        }
    }

    public static void ej7 (int numero){
        /*7. Programa Java que declare una variable C de tipo entero y asignarle un valor. A
        continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,
        si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
        100.*/

        ej6(numero);
        ej5(numero);

        if (numero%5==0){
            System.out.println("El numero es multiplo de 5");
        }else {
            System.out.println("No es multiplo de 5");
        }

        if (numero%10==0){
            System.out.println("El numero es multiplo de 10");
        }else {
            System.out.println("No es multiplo de 10");
        }

        if (numero<100){
            System.out.println("El numero es menor que 100");
        }else if (numero>100){
            System.out.println("El numero es mayor que 100");
        }else {
            System.out.println("El numero es igual a 100");
        }
    }

    public static void ej8(){
        /*8. Programa Java que lea un nombre y muestre por pantalla: “Buenos días, {NOMBRE}”.*/
        String nombre;
        Scanner aux;

        System.out.println("\nEjercicio 8:");
        System.out.println("\nIngrese su nombre:\t");
        aux=new Scanner(System.in);
        nombre=aux.nextLine();

        System.out.println("Buenos dias, " + nombre + ".");
    }

    public static void ej9(){
        /*9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de
        ese número y lo muestre por pantalla.*/

        int numero, doble, triple=0;
        Scanner aux;

        System.out.println("\nEjercicio 9:");
        System.out.println("Ingrese un numero:\t");
        aux= new Scanner(System.in);
        numero=aux.nextInt();

        doble=numero*2;
        triple=numero*3;

        System.out.println("Numero ingresado:" + numero);
        System.out.println("Doble:" + doble);
        System.out.println("Triple:" + triple);
    }

    public static void ej10 (){
        /*10. Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
        centígrados.*/

        int fahr, cent=0;
        Scanner aux;

        System.out.println("\nEjercicio 10:");
        System.out.println("Ingrese los grados Fahrenheit:\t");
        aux= new Scanner(System.in);
        fahr=aux.nextInt();

        cent=((fahr-32)*5/9);

        System.out.println(fahr + "°F son " + cent + "°C");

    }

    public static void ej11 (){
        /*11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y
        muestra por pantalla la longitud y el área de la circunferencia.*/

        double radio, longitud, area;
        double pi=3.1416;
        Scanner aux;

        System.out.println("\nEjercicio 11:");
        System.out.println("Ingrese el radio del circulo");
        aux=new Scanner(System.in);
        radio=aux.nextDouble();

        longitud= 2 * radio * pi;
        area= pi * (radio*radio);

        System.out.println("El radio es: "+radio+", la longitud es: "+longitud+", el area es: "+ area+".");

    }

    public static void ej12(){
        /*12. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.*/
        int kms, ms;
        Scanner aux;

        System.out.println("\nEjercicio 12:");
        System.out.println("Ingrese la velocidad en kms/h:\t");
        aux= new Scanner(System.in);
        kms=aux.nextInt();

        ms=kms*1000/3600;

        System.out.println(kms + "km/h son:" + ms +"m/s.");

    }

    public static void ej13(){
        /*13. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
        longitud de la hipotenusa según el teorema de Pitágoras.*/

        double cat1, cat2, hipo;
        Scanner aux;

        System.out.println("\nEjercicio 13:");
        System.out.println("Ingrese la longitud del primer cateto:\t");
        aux= new Scanner(System.in);
        cat1=aux.nextDouble();
        System.out.println("Ingrese la longitud del segundo cateto:\t");
        aux= new Scanner(System.in);
        cat2=aux.nextDouble();

        hipo=Math.sqrt((cat1*cat1)+(cat2*cat2));

        System.out.println("La hipotenusa es igual a:" + hipo);
    }

    public static void ej14(){
        /*14. Programa que calcula el volumen de una esfera.*/
        double radio = 1.98;
        double pi= 3.1416;
        double vol;

        vol= (Math.pow(radio,3))*pi*4/3;
        System.out.println("El volumen de una esfera de radio " + radio + "cm es de:"+ vol + "cm3");
    }

    public static void ej16(){
       /*16. Programa que lee un número de 3 cifras y muestra sus cifras por separado.*/

        int numero;
        Scanner aux;

        System.out.println("\nEjercicio 16:");
        System.out.println("Ingrese un numero de tres cifras:\t");
        aux=new Scanner(System.in);
        numero=aux.nextInt();
        String cadena=String.valueOf(numero);

        for (int i=0; i<3; i++){
            System.out.print(cadena.charAt(i) + " ");
        }
    }

    public static void ej17(){
        /*17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
        posiciones impares.*/

        int numero;
        Scanner aux;

        System.out.println("\nEjercicio 17:");
        System.out.println("Ingrese un numero de 5 cifras:\t");
        aux= new Scanner(System.in);
        numero=aux.nextInt();
        String cadena = String.valueOf(numero);

        for (int i=0; i<5; i++){
            if (i%2 != 0)
                System.out.print(cadena.charAt(i) + " ");
        }

    }

}
