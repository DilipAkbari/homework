/*10. WAP to input any two number and ask user to enter
 their symbol (+, -, /, *) find addition, Subtraction, multiplication and division according to their symbol (using if else)
*/

import java.util.Scanner;

public class Q_10 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number :");
        num2 = sc.nextInt();
        System.out.print("Apply any Arithmetic Operatiors: +,-,/,*: ");
        char c = sc.next().charAt(0);
        if (c == '+') {
            System.out.println("Addition= " + (num1 + num2));
        } else {
            if (c == '-') {
                System.out.println("Subtraction =" + (num1 - num2));
            } else if (c == '*') {
                System.out.println("Multiplication = " + (num1 * num2));
            } else if (c == '/') {
                System.out.println("Division =" + (float) (num1 / (float) num2));
            }
        }

    }

}
