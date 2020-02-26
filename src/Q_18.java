/*18. Write a Java program to print the following grid with 10 line using for loop.
//Expected Output:- - - - - - - - -
        - - - - - - - - - - - - - - -
        - - - - - - - - - - - - - - -
        - - - - - - - - - - - - - - - -
        - - - - - - - - - - - - - - -*/

public class Q_18 {
    public static void main(String[] args) {
        System.out.println("Expected Output :  ");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
