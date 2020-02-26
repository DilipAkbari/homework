//16. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Q_16 {
    public static void main(String[] args) {
        int[] num = {1, 3, 2, 50, 25, 36, 300, 200,};
        Arrays.sort(num);
        System.out.println("Sort Number : " + Arrays.toString(num));
        String[] name = {"Ahmedabad", "Delhi", "Mumbai", "Baroda", "Banglore"};
        Arrays.sort(name);
        System.out.println("Sort City : " + Arrays.toString(name));
    }
}
