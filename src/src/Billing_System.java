import java.util.Scanner;
public class Billing_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Put the number of items to enter: ");
        int numberOfItems = scanner.nextInt();

        double totalAmount = 0.0;

        for (int i = 1; i <= numberOfItems; i++) {
            scanner.nextLine();
            System.out.println("Enter details for item " + i);

            System.out.print("Item name: ");
            String itemName = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price per unit: Rs.");
            double pricePerUnit = scanner.nextDouble();

            double itemTotal = pricePerUnit * quantity;
            totalAmount += itemTotal;
        }

        double vat = totalAmount * 0.07;

        double discount = totalAmount * 0.10;

        double finalTotal = totalAmount + vat - discount;

        System.out.println("\n===== Bill Summary =====");
        System.out.println("Number of items: " + numberOfItems);
        System.out.println("Total amount: Rs." + totalAmount);
        System.out.println("VAT: Rs." + vat);
        System.out.println("10% Discount: Rs." + discount);
        System.out.println("Final Total: Rs." + finalTotal);

        scanner.close();
    }
}
