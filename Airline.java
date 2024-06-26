package AirlineManagementSystem;
import java.util.Arrays;
public class Airline {
	    private Flight[] flights;
	    private Passenger[] passengers;
	    private int flightCount;
	    private int passengerCount;

	    // Constructor to initialize the airline with maximum flights and passengers
	    public Airline(int maxFlights, int maxPassengers) {
	        this.flights = new Flight[maxFlights];
	        this.passengers = new Passenger[maxPassengers];
	        this.flightCount = 0;
	        this.passengerCount = 0;
	    }

	    // Method to add a new flight to the flights array
	    public void addFlight(Flight flight) {
	        if (flightCount < flights.length) {
	            flights[flightCount++] = flight;
	            System.out.println("Flight added: " + flight);
	        } else {
	            System.out.println("Cannot add more flights.");
	        }
	    }

	    // Method to remove a flight from the flights array based on the flight number
	    public void removeFlight(String flightNumber) {
	        for (int i = 0; i < flightCount; i++) {
	            if (flights[i].getFlightNumber().equals(flightNumber)) {
	                flights[i] = flights[--flightCount];
	                flights[flightCount] = null;
	                System.out.println("Flight removed: " + flightNumber);
	                return;
	            }
	        }
	        System.out.println("Flight not found: " + flightNumber);
	    }

	    // Method to register a new passenger in the system
	    public void registerPassenger(Passenger passenger) {
	        if (passengerCount < passengers.length) {
	            passengers[passengerCount++] = passenger;
	            System.out.println("Passenger registered: " + passenger);
	        } else {
	            System.out.println("Cannot register more passengers.");
	        }
	    }

	    // Method to unregister a passenger from the system based on passport number
	    public void unregisterPassenger(String passportNumber) {
	        for (int i = 0; i < passengerCount; i++) {
	            if (passengers[i].getPassportNumber().equals(passportNumber)) {
	                passengers[i] = passengers[--passengerCount];
	                passengers[passengerCount] = null;
	                System.out.println("Passenger unregistered: " + passportNumber);
	                return;
	            }
	        }
	        System.out.println("Passenger not found: " + passportNumber);
	    }

	    // Method to book a flight for a passenger based on passport number and flight number
	    public void bookFlight(String passportNumber, String flightNumber) {
	        Passenger passenger = findPassengerByPassportNumber(passportNumber);
	        Flight flight = findFlightByFlightNumber(flightNumber);
	        if (passenger != null && flight != null) {
	            passenger.bookFlight(flight);
	        } else {
	            System.out.println("Booking failed. Either the passenger or the flight was not found.");
	        }
	    }

	    // Method to cancel a booked flight for a passenger based on passport number and flight number
	    public void cancelBooking(String passportNumber, String flightNumber) {
	        Passenger passenger = findPassengerByPassportNumber(passportNumber);
	        Flight flight = findFlightByFlightNumber(flightNumber);
	        if (passenger != null && flight != null) {
	            passenger.cancelBooking(flight);
	        } else {
	            System.out.println("Cancellation failed. Either the passenger or the flight was not found.");
	        }
	    }

	    // Method to list all available flights in the system
	    public void listAvailableFlights() {
	        System.out.println("Available flights:");
	        for (int i = 0; i < flightCount; i++) {
	            if (flights[i].isAvailable()) {
	                System.out.println(flights[i]);
	            }
	        }
	    }

	    // Method to list all booked flights in the system
	    public void listBookedFlights() {
	        System.out.println("Booked flights:");
	        for (int i = 0; i < flightCount; i++) {
	            if (!flights[i].isAvailable()) {
	                System.out.println(flights[i]);
	            }
	        }
	    }

	    // Helper method to find a passenger by passport number
	    private Passenger findPassengerByPassportNumber(String passportNumber) {
	        for (int i = 0; i < passengerCount; i++) {
	            if (passengers[i].getPassportNumber().equals(passportNumber)) {
	                return passengers[i];
	            }
	        }
	        return null;
	    }

	    // Helper method to find a flight by flight number
	    private Flight findFlightByFlightNumber(String flightNumber) {
	        for (int i = 0; i < flightCount; i++) {
	            if (flights[i].getFlightNumber().equals(flightNumber)) {
	                return flights[i];
	            }
	        }
	        return null;
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        Airline airline = new Airline(10, 10);

	        Flight flight1 = new Flight("AB123", "New York", "Los Angeles", "10:00 AM", "1:00 PM", true);
	        Flight flight2 = new Flight("CD456", "Boston", "Chicago", "2:00 PM", "4:00 PM", true);
	        Passenger passenger1 = new Passenger("Shivansh", "A12345678", 5);
	        Passenger passenger2 = new Passenger("Jay", "B87654321", 5);
             airline.addFlight(flight1);
	        airline.addFlight(flight2);
	        airline.registerPassenger(passenger1);
	        airline.registerPassenger(passenger2);
             airline.bookFlight("A12345678", "AB123");
	        airline.bookFlight("B87654321", "CD456");
             airline.listAvailableFlights();
	        airline.listBookedFlights();
	        airline.cancelBooking("A12345678", "AB123");
            airline.listAvailableFlights();
	        airline.listBookedFlights();
             airline.removeFlight("CD456");
	        airline.unregisterPassenger("B87654321");
             airline.listAvailableFlights();
	        airline.listBookedFlights();
	    }
	}

