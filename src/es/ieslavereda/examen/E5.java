package es.ieslavereda.examen;

import java.util.Scanner;

public class E5 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String text,wordToReplace,substituteWord;

        System.out.println("Introduce una cadena de texto:");
        text = sc.nextLine();
        System.out.println("Introduce la palabra a sustituir:");
        wordToReplace= sc.nextLine();
        System.out.println("Introduce la palabra por la que la quieres sustituir:");
        substituteWord= sc.nextLine();

        System.out.println("Resultado:");
        System.out.println(replace(text,wordToReplace,substituteWord));

    }

    /**
     *
     * @param text Original text
     * @param word Word to be replaced
     * @param substituteWord Word to substitute
     * @return The text without word, and the substituteWord in its place
     */
    public static String replace (String text, String word,String substituteWord){

        String result = "";
        int i=0;

        // We go through the text, checking if the text contains the word
        while(i<text.length()){

            // If the text contains the word, we replace it,
            // and advance the index by the length of the word
            if(contains(text,word,i)) {
                result += substituteWord;
                i+=word.length();
            }else{
                // If the text doesn't contains the word, we only copy the character at position i,
                // and advance the index one step.
                result += text.charAt(i);
                i++;
            }
        };

        return result;
    }

    /**
     *
     * @param text Text to check
     * @param word Word to find
     * @param index Index to start to check
     * @return True if the word is at the index position. False if not.
     */
    private static boolean contains (String text,String word,int index){
        boolean contains = true;

        // Check if the word fits in the text
        if(index+word.length()>text.length())
            return false;

        // Check if all word's characters match in the text
        int i=0;
        while(i<word.length() && contains){

            if(word.charAt(i)!=text.charAt(index))
                contains=false;

            i++;
            index++;
        }

        return contains;
    }
}
