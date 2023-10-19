package Task030;

import java.util.ArrayList;
import java.util.Scanner;

public class Airplane {
    public static void manageAircraft() {
        ArrayList<String> aircraftList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. Add an airplane");
                System.out.println("2. Edit an airplane ");
                System.out.println("3. Delete an airplane");
                System.out.println("4. Show the list of airplanes");
                System.out.println("5. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the name of the plane:");
                        String aircraftName = scanner.nextLine();
                        aircraftList.add(aircraftName);
                        System.out.println("Airplane " + aircraftName + " is added to the list.");
                        break;
                    case 2:
                        System.out.println("Enter the number of the plane to edit:");
                        int editIndex = scanner.nextInt();
                        scanner.nextLine();

                        if (editIndex >= 0 && editIndex < aircraftList.size()) {
                            System.out.println("Enter a new name:");
                            String newAircraftName = scanner.nextLine();
                            aircraftList.set(editIndex, newAircraftName);
                            System.out.println("The airplane is edited.");
                        } else {
                            System.out.println("Invalid aircraft number.");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the aircraft number to delete:");
                        int deleteIndex = scanner.nextInt();
                        scanner.nextLine();

                        if (deleteIndex >= 0 && deleteIndex < aircraftList.size()) {
                            String deletedAircraft = aircraftList.remove(deleteIndex);
                            System.out.println("Airplane " + deletedAircraft + " is deleted.");
                        } else {
                            System.out.println("Invalid aircraft number.");
                        }
                        break;
                    case 4:
                        System.out.println("List of airplanes:");
                        for (int i = 0; i < aircraftList.size(); i++) {
                            System.out.println(i + ". " + aircraftList.get(i));
                        }
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
