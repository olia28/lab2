package Task030;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportManager {
    private List<Airport> airports = new ArrayList<>();

    public static void airportmanager() {
        AirportManager system = new AirportManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Create Airport");
            System.out.println("2. Edit Airport");
            System.out.println("3. Delete Airport");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.createAirport();
                    break;
                case 2:
                    system.editAirport();
                    break;
                case 3:
                    system.deleteAirport();
                    break;
                case 4:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void createAirport() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter airport name: ");
        String airportName = scanner.next();
        System.out.print("Enter airport code: ");
        String airportCode = scanner.next();

        Airport airport = new Airport(airportName, airportCode);
        airports.add(airport);

        System.out.println("Airport created successfully!");
    }

    private void editAirport() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter airport code to edit: ");
        String airportCode = scanner.next();

        for (Airport airport : airports) {
            if (airport.getAirportCode().equals(airportCode)) {
                System.out.print("Enter new airport name: ");
                airport.setAirportName(scanner.next());
                System.out.print("Enter new airport code: ");
                airport.setAirportCode(scanner.next());
                System.out.println("Airport edited successfully!");
                return;
            }
        }

        System.out.println("Airport with that code not found.");
    }

    private void deleteAirport() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter airport code to delete: ");
        String airportCode = scanner.next();

        for (Airport airport : airports) {
            if (airport.getAirportCode().equals(airportCode)) {
                airports.remove(airport);
                System.out.println("Airport deleted successfully!");
                return;
            }
        }

        System.out.println("Airport with that code not found.");
    }
}
