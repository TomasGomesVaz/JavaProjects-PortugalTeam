package JavaTopic2;
import java.util.Scanner;



public class ReadCharacter2_5 {

    public static void main(String[] args) {

        //Exercise 2.5. Write a program that reads a single character on the keyboard and, by using the switch instruction,
        // prints on the screen if it is a number or not. NOTE: Use the methods next (Scanner) to read a String from the
        // keyboard and charAt (String) to obtain the first character of the String.
        // Extra help: Search in google how it works the method “isNumeric()”.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word");
        String word = scanner.next();
        char insertedLetter = word.charAt(0);
        System.out.println(insertedLetter + " Is the first letter of the name " + word);
        System.out.println(Character.isDigit(insertedLetter));

        //O java.lang.Character.isDigit (char ch) é um método embutido em java que
        // determina se um caractere especificado é um dígito ou não dando o retorno true ou false.
         //O retorno true ou false é equivalente a 0 ou 1


    }



}

