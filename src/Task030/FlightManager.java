package Task030;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightManager {
    public static final ArrayList<Flight> flights = new ArrayList<>();

    public static void manageFlights() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a flight");
            System.out.println("2. Edit a flight");
            System.out.println("3. Delete a flight");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the flight number:");
                    String flightNumber = scanner.nextLine();
                    System.out.println("Enter the destination:");
                    String destination = scanner.nextLine();
                    System.out.println("Enter the departure time:");
                    String departureTime = scanner.nextLine();
                    Flight flight = new Flight(flightNumber, destination, departureTime);
                    flights.add(flight);
                    System.out.println("Flight " + flightNumber + " is added to the list.");
                    break;
                case 2:
                    System.out.println("Enter the flight number to edit:");
                    String editFlightNumber = scanner.nextLine();

                    for (Flight f : flights) {
                        if (f.getFlightNumber().equals(editFlightNumber)) {
                            System.out.println("Enter the new flight number:");
                            String newFlightNumber = scanner.nextLine();
                            System.out.println("Enter the new destination:");
                            String newDestination = scanner.nextLine();
                            System.out.println("Enter the new departure time:");
                            String newDepartureTime = scanner.nextLine();
                            f.setFlightNumber(newFlightNumber);
                            f.setDestination(newDestination);
                            f.setDepartureTime(newDepartureTime);
                            System.out.println("The flight is edited.");
                            return;
                        }
                    }

                    System.out.println("Flight with number " + editFlightNumber + " not found.");
                    break;
                case 3:
                    System.out.println("Enter the flight number to delete:");
                    String deleteFlightNumber = scanner.nextLine();

                    for (Flight f : flights) {
                        if (f.getFlightNumber().equals(deleteFlightNumber)) {
                            flights.remove(f);
                            System.out.println("Flight " + deleteFlightNumber + " is deleted.");
                            return;
                        }
                    }

                    System.out.println("Flight with number " + deleteFlightNumber + " not found.");
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid operation choice.");
            }
        }
    }
}
