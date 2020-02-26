//1. Write a java program that tell us that Input number is odd or even?

import java.util.Scanner;

public class Q_1 {
    //main mathod

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        //int input
        int number = sc.nextInt();
        //use string
        String a = (number % 2 == 0) ? " Even" : "Odd";
        System.out.println(number + "  <----is  " + a);
    }

}

