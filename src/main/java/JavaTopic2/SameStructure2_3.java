package JavaTopic2;
import java.util.Scanner;
public class SameStructure2_3 {

    public static void main(String args[]){


        //______________________________________________________________
        //Exercise 2.3. Define two String variables, and check if are the same (if structure).
        //Try to use the methods “equals()”, “equalsIgnoreCase()” and “==”. What it happens?


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String Name1 = scanner.next();

        System.out.println("Enter second name:");
        String Name2 = scanner.next();
        scanner.close();

        System.out.println(Name1 + " and " + Name2
                + ": " + Name1.equals(Name2));








    }
}
