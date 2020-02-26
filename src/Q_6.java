
//6.WAP to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Q_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = sc.nextInt();
        String a = (number % 2 == 0) ? "You have enter EVEN number" : "You have enter ODD number";
        System.out.println(number + "  is " + a);

    }
}



