package Week4.soal3;
import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many salespeople do you have? ");
        int num = scan.nextInt();
        Salesperson[] salesStaff = new Salesperson[num];
            for (int i = 0; i < num; i++) {
                System.out.println("Enter the name of salesperson " + (i+1) + ": ");
                String firstName = scan.next();
                String lastName = scan.next();
                System.out.println("Enter the total sales for salesperson " + (i+1) + ": ");
                int totalSales = scan.nextInt();
                salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
            }
        Sorting.insertionSort(salesStaff);
        System.out.println ("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
            System.out.println (s);
    }
}
