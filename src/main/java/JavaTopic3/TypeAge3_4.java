package JavaTopic3;

import java.util.Scanner;

public class TypeAge3_4 {

    public static void main(String args[]) {
        System.out.println("Enter your age and i'll roast you for free!");
        Scanner scanner = new Scanner(System.in);
        double age = scanner.nextDouble();
        scanner.close();
        if (age <= 0) {
            System.out.println(
                    "╭━━╮     ╭╮\n" +
                    "┃╭╮┃     ┃┃\n" +
                    "┃╰╯╰┳━┳╮╭┫╰━╮\n" +
                    "┃╭━╮┃╭┫┃┃┃╭╮┃\n" +
                    "┃╰━╯┃┃┃╰╯┃┃┃┣┳┳╮\n" +
                    "╰━━━┻╯╰━━┻╯╰┻┻┻╯");
        } else if (age < 18) {
            System.out.println("Baby face!");
        } else if (age >= 18 && age <= 35) {
            System.out.println("Looking fresh!");
        } else if (age >= 36 && age <= 60) {
            System.out.println("Well not everything remains new...");
        } else if (age >= 61 && age <= 89) {
            System.out.println("Not gonna lie... you've seen better days.");
        } else {
            System.out.println("DAIM!!! You belong in a museum!");
        }
    }
}
