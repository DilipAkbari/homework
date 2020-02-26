/*3. Write a java program to input student Name, roll No, and three subjects Math,
Science and English marks (marks is between 0 to 100 and if it is out of range print
error message “Invalid Input, Marks should between 0 to 100”) and find out total,
percentage and result.  If he is pass or fail on basis of percentage (pass>=35) and
also give them grade  >= 80 A+, >= 60 A, >= 50 B, >= 35 C And print Mark Sheet in
following format
 */

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        String name;
        int rollNo;
        int maths;
        int science;
        int english;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Studnt Name:");
        name = sc.next();
        System.out.print("Roll No:");
        rollNo = sc.nextInt();
        System.out.print("Maths:");
        maths = sc.nextInt();
        if (maths >= 0 && maths <= 100) {
        } else {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("Maths:");
            maths = sc.nextInt();
        }
        System.out.print("Science:");
        science = sc.nextInt();
        if (science >= 0 && science <= 100) {
        } else {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("Science:");
            science = sc.nextInt();
        }
        System.out.print("English:");
        english = sc.nextInt();
        if (english >= 0 && english <= 100) {
        } else {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("English:");
            english = sc.nextInt();
        }
        System.out.print("Total:");
        int total = (maths + science + english);
        System.out.println(total);
        System.out.print("Percentage: ");
        float Percentage = (float) total / 300 * 100;
        System.out.println(Percentage);
        System.out.print("Result:");
        if (Percentage >= 35) {
            System.out.println("Pass");
        } else
            System.out.println("Fail");
        System.out.print("Grade: ");
        if (Percentage >= 80) {
            System.out.println("A+");
        } else if (Percentage < 80 && Percentage >= 60) {
            System.out.println("A");
        } else if (Percentage < 60 && Percentage >= 50) {
            System.out.println("B");
        } else if (Percentage < 50 && Percentage >= 35) {
            System.out.println("C");
        }
        System.out.println(" ____________________________________");
        System.out.println("|            Mark Sheet              |");
        System.out.println("|____________________________________|");
        System.out.println("|    Name         :       "+name+"      |");
        System.out.println("|    Roll No      :       "+rollNo+"          |");
        System.out.println("|____________________________________|");
        System.out.println("|    Subject      :      Marks       |");
        System.out.println("|____________________________________|");
        System.out.println("|    Maths        :      "+maths+"         |");
        System.out.println("|    Science      :      "+science+"         |");
        System.out.println("|    English      :      "+english+"         |");
        System.out.println("|____________________________________|");
        System.out.println("|    Total        :      "+total+"         |");
        System.out.println("|____________________________________|");
        System.out.println("|    Percentage   :      "+Percentage+"       |");
        System.out.println("|    Result       :                  |");
        System.out.println("|    Grade        :                  |");
        System.out.println("|____________________________________|");

    }
}



