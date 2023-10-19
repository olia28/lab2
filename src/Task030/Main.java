package Task030;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Airport Management System Menu:");
            System.out.println("1. Manage Airplanes");
            System.out.println("2. Manage Airports");
            System.out.println("3. Manage Passengers");
            System.out.println("4. Manage Flights");
            System.out.println("5. View Flight Schedules");
            System.out.println("6. Manage Tickets");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

                switch (choice) {
                    case 1:
                        Airplane.manageAircraft();
                        break;
                    case 2:
                        FlightManager.manageFlights();
                        break;
                    case 3:
                        PassengerManager.passengermanager();
                        break;
                    case 4:
                        AirportManager.airportmanager();
                        break;
                    case 5:
                        FlightSchedule.displayFlights();
                        break;
                    case 6:
                        TicketsSales.ticketssales();
                        break;
                    case 0:
                        System.out.println("Exiting the program.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

