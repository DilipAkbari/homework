import java.util.Scanner;

/*7. WAP input sales id, seller's name, sales amount, and salary
basic and then fined this sales   Commission
Sales amount >= 50,000 35%
 Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
 */
public class Q_7 {

    public static void main(String[] args) {
        int salesid;
        String sellername;
        int salesamount;
        int salarybasic;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sales ID: ");
        salesid = sc.nextInt();
        System.out.print("Seller Name: ");
        sellername = sc.next();
        System.out.print("Sales Amount: ");
        salesamount = sc.nextInt();
        if (salesamount >= 50000) {
            System.out.println("Sales Commission : " + salesamount * 35 / 100);
        } else if (salesamount > 30000) {
            System.out.println("Sales Commission : " + salesamount * 20 / 100);
        } else if (salesamount > 20000) {
            System.out.println("Sales Commission: " + salesamount * 10 / 100);
        } else if (salesamount > 10000) {
            System.out.println("Sales Commission:   " + salesamount * 5 / 100);
        } else if (salesamount < 10000) {
            System.out.println("Sales Commission : " + salesamount * 2 / 100);

        }
    }
}