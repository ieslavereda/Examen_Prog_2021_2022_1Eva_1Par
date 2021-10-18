package es.ieslavereda.examen;

import java.util.Scanner;

public class E1 {
    public static void main (String[] args){

        int numero = 5;

        switch (numero) {
            case 0:
            case 1:
                System.out.println("Hola");
            case 2:
                System.out.println("Adios");
                break;
            case 3:
                System.out.println("Mi nombre");
                break;
            case 4:
                System.out.println(" es Nelo");
                break;
            default:
                System.out.println("Error");
        }

        if(numero==0 || numero==1) {
            System.out.println("Hola");
            System.out.println("Adios");
        } else if(numero==2)
            System.out.println("Adios");
        else if(numero==3)
            System.out.println("Mi nombre");
        else if(numero==4)
            System.out.println(" es Nelo");
        else
            System.out.println("Error");

    }
}
