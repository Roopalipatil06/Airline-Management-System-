package AirlineManagementSystem;
import java.util.Arrays;
public class Main {
	    public static void main(String[] args) {
	        // Instantiate flights
	        Flight flight1 = new Flight("AB123", "New York", "Los Angeles", "10:00 AM", "1:00 PM", true);
	        Flight flight2 = new Flight("CD456", "Boston", "Chicago", "2:00 PM", "4:00 PM", true);

	        // Instantiate passengers
	        Passenger passenger1 = new Passenger("Sai", "A12345678", 5);
	        Passenger passenger2 = new Passenger("Smith", "B87654321", 5);

	        // Instantiate the airline
	        Airline airline = new Airline(10, 10);

	        // Add flights to the airline
	        airline.addFlight(flight1);
	        airline.addFlight(flight2);

	        // Register passengers to the airline
	        airline.registerPassenger(passenger1);
	        airline.registerPassenger(passenger2);

	        // Perform bookings
	        airline.bookFlight("A12345678", "AB123");
	        airline.bookFlight("B87654321", "CD456");

	        // List available and booked flights
	        airline.listAvailableFlights();
	        airline.listBookedFlights();

	        // Perform cancellations
	        airline.cancelBooking("A12345678", "AB123");

	        // List available and booked flights after cancellation
	        airline.listAvailableFlights();
	        airline.listBookedFlights();

	        // Remove a flight and unregister a passenger
	        airline.removeFlight("CD456");
	        airline.unregisterPassenger("B87654321");

	        // List available and booked flights after removal and unregistration
	        airline.listAvailableFlights();
	        airline.listBookedFlights();

	        // Test StringUtil class methods
	        String testString = "hello world";
	        char testChar = 'o';

	        System.out.println("Count occurrences of '" + testChar + "': " + Stringutil.countOccurrences(testString, testChar));
	        System.out.println("Reversed string: " + Stringutil.reverseString(testString));
	        System.out.println("Is palindrome: " + Stringutil.isPalindrome(testString));
	        System.out.println("Capitalized words: " + Stringutil.capitalizeWords(testString));

	        String palindromeTest = "madam";
	        System.out.println("Is '" + palindromeTest + "' a palindrome: " + Stringutil.isPalindrome(palindromeTest));

	        // Test WrapperUtil class methods
	        Integer[] intArray = {3, 5, 7, 2, 8};
	        Double[] doubleArray = {2.5, 3.5, 4.0, 1.0};
	        String binaryString = "1101";

	        System.out.println("Max value: " + Wrapperutil.findMax(intArray));
	        System.out.println("Average value: " + Wrapperutil.calculateAverage(doubleArray));
	        System.out.println("Boolean array from binary string: " + Arrays.toString(Wrapperutil.convertToBooleanArray(binaryString)));

	        Boolean[] booleanArray = {true, false, true, true};
	        System.out.println("Binary string from Boolean array: " + Wrapperutil.convertToBinaryString(booleanArray));
	    }
	}

