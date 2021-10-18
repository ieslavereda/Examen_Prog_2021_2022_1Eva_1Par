package es.ieslavereda.examen;

import java.util.Scanner;

public class E4 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String text;
        int limInf,limSup;

        System.out.println("Introduce una cadena de texto:");
        text = sc.nextLine();
        System.out.println("Introduce el limite inferior:");
        limInf = sc.nextInt();
        System.out.println("Introduce el limite superior:");
        limSup = sc.nextInt();

        System.out.println("La subcadena es: " + subString(text,limInf,limSup));
    }

    /**
     *
     * @param text Original text
     * @param inf Lower limit
     * @param sup Upper limit
     * @return The substring from the inf position to sup position included.
     */
    public static String subString(String text,int inf,int sup){

        String result ="";

        // Check limits
        if(inf<0)
            inf=0;
        if(sup>text.length()-1)
            sup=text.length()-1;

        // We have to copy all characters from inf to sup in result
        for(int i=inf;i<=sup;i++)
            result+=text.charAt(i);

        return result;
    }
}
