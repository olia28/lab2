package Task030;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketsSales {
    private final List<Ticket> tickets = new ArrayList<>();

    public static void ticketssales() {
        TicketsSales saleSystem = new TicketsSales();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Create Sale");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Calculate Total Income");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    saleSystem.createSale();
                    break;
                case 2:
                    saleSystem.cancelTicket();
                    break;
                case 3:
                    saleSystem.calculateTotalIncome();
                    break;
                case 4:
                    System.out.println("Thank you for using the sale system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void createSale() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ticket ID: ");
        int ticketId = scanner.nextInt();
        System.out.print("Enter the ticket price: ");
        double ticketPrice = scanner.nextDouble();
        System.out.print("Enter the ticket quantity: ");
        int ticketQuantity = scanner.nextInt();

        Ticket ticket = new Ticket(ticketId, ticketPrice, ticketQuantity);
        tickets.add(ticket);

        System.out.println("Sale created successfully!");
    }

    private void cancelTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ticket ID to cancel: ");
        int ticketId = scanner.nextInt();

        for (Ticket ticket : tickets) {
            if (ticket.getTicketId() == ticketId) {
                tickets.remove(ticket);
                System.out.println("Ticket canceled successfully!");
                return;
            }
        }

        System.out.println("Ticket with this ID not found.");
    }

    public void calculateTotalIncome() {
        double totalIncome = 0.0;
        for (Ticket ticket : tickets) {
            totalIncome += ticket.getTicketPrice() * ticket.getTicketQuantity();
        }
        System.out.println("Total Income: $" + totalIncome);
    }
}
