package Task030;
public class FlightSchedule {
    public static void displayFlights() {
        System.out.println("Flight Schedules:");
        for (Flight flight : FlightManager.flights) {
            System.out.println("Flight Number: " + flight.getFlightNumber());
            System.out.println("Destination: " + flight.getDestination());
            System.out.println("Departure Time: " + flight.getDepartureTime());
            System.out.println("-----------------------");
        }
    }
}
