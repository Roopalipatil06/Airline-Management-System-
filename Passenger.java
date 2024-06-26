package AirlineManagementSystem;
import java.util.Arrays;
public class Passenger {
        private String name;
	    private String passportNumber;
	    private Flight[] bookedFlights;
	    private int bookedFlightCount;
	    public Passenger(String name, String passportNumber, int maxFlights) { //use constructor
	        this.name = name;
	        this.passportNumber = passportNumber;
	        this.bookedFlights = new Flight[maxFlights];
	        this.bookedFlightCount = 0;
	    }
	    public String getName() {  //use getter method
	        return name;
	    }
        public String getPassportNumber() {
	        return passportNumber;
	    }
        public Flight[] getBookedFlights() {
	        return Arrays.copyOf(bookedFlights, bookedFlightCount);
	    }
      public int getBookedFlightCount() {
	        return bookedFlightCount;
	    }
	    public void setName(String name) {    //use setter method
	        this.name = name;
	    }
       public void setPassportNumber(String passportNumber) {
	        this.passportNumber = passportNumber;
	    }
	    @Override
	    public String toString() {
	        return "Passenger{" +
	                "name='" + name + '\'' +
	                ", passportNumber='" + passportNumber + '\'' +
	                ", bookedFlights=" + Arrays.toString(Arrays.copyOf(bookedFlights, bookedFlightCount)) +
	                ", bookedFlightCount=" + bookedFlightCount +
	                '}';
	    }
	    public void bookFlight(Flight flight) {
	        if (bookedFlightCount < bookedFlights.length && flight.isAvailable()) {
	            bookedFlights[bookedFlightCount++] = flight;
	            flight.bookFlight();
	            System.out.println("Flight booked for passenger: " + name);
	        } else {
	            System.out.println("Cannot book flight. Either the flight is not available or the booked flights limit has been reached.");
	        }
	    }
	    public void cancelBooking(Flight flight) {
	        for (int i = 0; i < bookedFlightCount; i++) {
	            if (bookedFlights[i].equals(flight)) {
	                bookedFlights[i] = bookedFlights[--bookedFlightCount];
	                bookedFlights[bookedFlightCount] = null;
	                flight.cancelBooking();
	                System.out.println("Booking cancelled for passenger: " + name);
	                return;
	            }
	        }
	        System.out.println("Flight not found in booked flights.");
	    }
	    public static void main(String[] args) {
	        Flight flight1 = new Flight("AB123", "New York", "Los Angeles", "10:00 AM", "1:00 PM", true);
	        Flight flight2 = new Flight("CD456", "Boston", "Chicago", "2:00 PM", "4:00 PM", true);

	        Passenger passenger = new Passenger("Roopali Patil", "A12345678", 5);

	        System.out.println(passenger.toString());
	        passenger.bookFlight(flight1);
	        System.out.println(passenger.toString());
	        passenger.bookFlight(flight2);
	        System.out.println(passenger.toString());
	        passenger.cancelBooking(flight1);
	        System.out.println(passenger.toString());
	    }
	}

