//19. Write a Java program to calculate the average value of array elements.

public class Q_19 {

    public static void  main(String []args){
        double[] numbers = {10.1, 20.2, 30.3, 40.4, 50.5, 60.6, 70.7, 80.8, 90.9, 100};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        double average = sum / numbers.length;
        System.out.println("Average Value of array elements : "+ average);
    }
}
