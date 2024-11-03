import java.util.Scanner;
public class AssignmentNo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ticketPrice = 50000,totalTicketSold = 0;
        double totalSalesPrice= 0;
            while (true) {
                System.out.print("Enter the number of ticket purchased (0 to finish): ");
                int totalPurchased = input.nextInt();
                if (totalPurchased == 0) {
                    break;
                }
                if (totalPurchased < 0) {
                    System.out.println("Invalid input. please enter a positive number.");
                    continue;
                } double price = totalPurchased * ticketPrice;
                if (totalPurchased > 10) {
                    double discount = price * 0.15;
                    price -= discount;
                } else if (totalPurchased > 4) {
                    double discount = price * 0.10;
                    price -= discount;
                }
                totalTicketSold += totalPurchased; 
                totalSalesPrice += price;

                System.out.println("Total ticket is: " + totalPurchased);
                System.out.println("Total price : Rp " + price);
            }
            System.out.println("Final Total ticket sold in one day is: " + totalTicketSold);
            System.out.println("Final total sales price in one day is: Rp " + totalSalesPrice);
    }
}