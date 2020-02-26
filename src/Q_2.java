
// 2 WAP to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Q_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year:");
        int number = sc.nextInt();
        String a = (number % 4 == 0) ? "Leap Year" : "No Leap Year";
        System.out.println(number + "<-----is   " + a);
    }
}

