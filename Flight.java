package AirlineManagementSystem;
public class Flight {
	    private String flightNumber;
	    private String origin;
	    private String destination;
	    private String departureTime;
	    private String arrivalTime;
	    private boolean isAvailable;

	    // Constructor to initialize flight details
	    public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime, boolean isAvailable) {
	        this.flightNumber = flightNumber;
	        this.origin = origin;
	        this.destination = destination;
	        this.departureTime = departureTime;
	        this.arrivalTime = arrivalTime;
	        this.isAvailable = isAvailable;
	    }
	    public String getFlightNumber() {   //use getter method
	        return flightNumber;
	    }

	    public String getOrigin() {
	        return origin;
	    }

	    public String getDestination() {
	        return destination;
	    }

	    public String getDepartureTime() {
	        return departureTime;
	    }

	    public String getArrivalTime() {
	        return arrivalTime;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }
	    public void setFlightNumber(String flightNumber) {  //use setter method
	        this.flightNumber = flightNumber;
	    }
        public void setOrigin(String origin) {
	        this.origin = origin;
	    }
        public void setDestination(String destination) {
	        this.destination = destination;
	    }
        public void setDepartureTime(String departureTime) {
	        this.departureTime = departureTime;
	    }
        public void setArrivalTime(String arrivalTime) {
	        this.arrivalTime = arrivalTime;
	    }
       public void setAvailable(boolean available) {
	        isAvailable = available;
	    }
	    @Override
	    public String toString() {
	        return "Flight{" +
	                "flightNumber='" + flightNumber + '\'' +
	                ", origin='" + origin + '\'' +
	                ", destination='" + destination + '\'' +
	                ", departureTime='" + departureTime + '\'' +
	                ", arrivalTime='" + arrivalTime + '\'' +
	                ", isAvailable=" + isAvailable +
	                '}';
	    }
         public void bookFlight() {   //use method for book flight
	        if (isAvailable) {
	            isAvailable = false;
	            System.out.println("Flight booked successfully.");
	        } else {
	            System.out.println("Flight is already booked.");
	        }
	    }
	    public void cancelBooking() {   // use method for cancle flight
	        if (!isAvailable) {
	            isAvailable = true;
	            System.out.println("Booking cancelled successfully.");
	        } else {
	            System.out.println("Flight was not booked.");
	        }
	    }
	    public static void main(String[] args) {
	        Flight flight = new Flight("AB123", "New York", "Los Angeles", "10:00 AM", "1:00 PM", true);
	        System.out.println(flight.toString());
	        flight.bookFlight();
	    }
}
