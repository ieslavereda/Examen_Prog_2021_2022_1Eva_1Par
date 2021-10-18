package es.ieslavereda.examen;

import java.util.Scanner;

public class E2 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String text;

        System.out.print("Introduce un texto: ");
        text = sc.nextLine();

        if(palindrome(text))
            System.out.println("La frase es un palindromo.");
        else
            System.out.println("La frase no es un palindromo.");

    }

    /**
     *
     * @param text Text to check if it's a palindrome
     * @return True if the text is a palindrome. False if not.
     */
    public static boolean palindrome (String text){

        // Remove all whitespaces
        text = text.replaceAll(" ","");

        int lower=0;
        int upper=text.length()-1;
        boolean palindrome=true;

        // Check if the letter is the same as the opposite.
        // We stop when we find one that isn't or when the lower index is higher than the upper one
        while(lower<upper && palindrome){

            if(text.charAt(lower)!=text.charAt(upper))
                palindrome=false;

            lower++;
            upper--;
        }

        return palindrome;
    }

}
