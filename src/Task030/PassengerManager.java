package Task030;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassengerManager {
    private final List<Passenger> passengers = new ArrayList<>();

    public static void passengermanager() {
        PassengerManager system = new PassengerManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Create a passenger");
            System.out.println("2. Edit a passenger");
            System.out.println("3. Delete a passenger");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.createPassenger();
                    break;
                case 2:
                    system.editPassenger();
                    break;
                case 3:
                    system.deletePassenger();
                    break;
                case 4:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void createPassenger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passenger's name: ");
        String name = scanner.next();
        System.out.print("Enter passenger's age: ");
        int age = scanner.nextInt();
        System.out.print("Enter passenger's email: ");
        String email = scanner.next();

        Passenger passenger = new Passenger(name, age, email);
        passengers.add(passenger);

        System.out.println("Passenger created successfully!");
    }

    private void editPassenger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the passenger you want to edit: ");
        String name = scanner.next();

        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                System.out.print("Enter the new name: ");
                passenger.setName(scanner.next());
                System.out.print("Enter the new age: ");
                passenger.setAge(scanner.nextInt());
                System.out.print("Enter the new email: ");
                passenger.setEmail(scanner.next());
                System.out.println("Passenger edited successfully!");
                return;
            }
        }

        System.out.println("Passenger with that name not found.");
    }

    private void deletePassenger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the passenger you want to delete: ");
        String name = scanner.next();

        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                passengers.remove(passenger);
                System.out.println("Passenger deleted successfully!");
                return;
            }
        }

        System.out.println("Passenger with that name not found.");
    }
}

