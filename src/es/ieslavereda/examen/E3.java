package es.ieslavereda.examen;

import java.util.Scanner;

public class E3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.print("Introduce un numero: ");
        size = sc.nextInt();

        System.out.print(identity(size));

    }
    public static String identity(int size){
        String matrix="";

        for(int row=0;row<size;row++) {
            for (int col = 0; col < size; col++)
                // if the row is equal to the column, we concatenate 1 otherwise we concatenate a 0
                matrix += (row == col) ? "1 " : "0 ";

            // We have to concatenate a break line at the end of the row
            matrix += "\n";
        }
        return matrix;
    }
}
