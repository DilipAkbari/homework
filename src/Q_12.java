//12. Write a program that tells us input value is number or an alphabet or symbol

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Any Caractor : ");
        char c = scanner.next().charAt(0);
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " = Is a Alphabet: ");
        } else if (c >= '0' && c <= '9') {
            System.out.println("Input : " + c + " = Is Number: ");
        } else {
            System.out.println("Input : " + c + "   is Symbol");

        }
    }
}



