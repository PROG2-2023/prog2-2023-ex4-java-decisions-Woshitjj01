package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
public class FlightBooking {
    private static String TripSource;
    private String BookingClass;
    private String passengerFullName;
    private String sourceAirport;
    private String FlightCompany;
    private String tripDestination;
    private String destinationAirport;
    private String TripType;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double departingTicketPrice;
    private double totalTicketPrice;
    public FlightBooking(String aNull, LocalDate depart, LocalDate returnDate, int i, int i1) {
        this.passengerFullName = aNull;
        this.departureDate = depart;
        this.returnDate = returnDate;
        this.childPassengers =i;
        this.adultPassengers =i1;
    }

    public void setTripType(int b) {
        if (b == 1)
        {
            TripType = "Oneway";
        }
        if (b == 2){
            TripType="return";
        }
    }

    public String getTripType() {
        return TripType;
    }

    public String getBookingClass() {
        return BookingClass;
    }

    public void setBookingClass(int a) {
        if (a == 1){
            BookingClass = "First";
        }
        if (a == 2){
            BookingClass ="Bussiness";
        }
        if (a == 3){
            BookingClass= "Economy";
        }
    }

    public String getTripSource() {
        String tripSource = TripSource;
        return tripSource;
    }

    public void setTripSource(String tripSource) {
        this.TripSource = tripSource;
    }

    public String getFlightCompany() {
        return FlightCompany;
    }

    public String getPassengerFullName() {
        return passengerFullName;
    }

    public void setPassengerFullName(String passengerFullName) {

        this.passengerFullName = passengerFullName;
    }


    public void setFlightCompany(String flightCompany) {
        FlightCompany = flightCompany;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public String getTripDestination() {
        return tripDestination;
    }

    public void setTripDestination(String tripDestination) {
        this.tripDestination = tripDestination;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getChildPassengers() {
        return childPassengers;
    }

    public void setChildPassengers(int childPassengers) {
        this.childPassengers = childPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }

    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }

    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }

    public void setDepartingTicketPrice(double departingTicketPrice) {
        this.departingTicketPrice = departingTicketPrice;
    }

    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public void setTotalTicketPrice(double totalTicketPrice) {
        this.totalTicketPrice = totalTicketPrice;
    }

    private String ticketNumber;
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " +
                FlightCompany + ". \nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + ticketNumber + "\n" +
                "From " + TripSource + " to " + tripDestination + "\n" +
                "Date of departure: " +departureDate + "\n" +
                "Date of return: " + returnDate + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " + totalTicketPrice;
    }

    public void setTotalPassengers(int i, int i1) {
    }


    public void setReturnTicketPrice() {
    }

    public void setTripDestination(String s, String s1) {
    }

    public void setTripType(String s) {
    }

    public void setBookingClass(String s) {
    }

    public void setDepartingTicketPrice(int child, int adults) {
    }

    public void setTotalTicketPrice() {
    }

    public enum TripSource {
        ;

        public static final FlightBooking.TripSource NANJING = null;
        public static final FlightBooking.TripSource BEIJING = null;
        public static final FlightBooking.TripSource SHANGHAI = null;
        public static final FlightBooking.TripSource OULU= null;
        public static final FlightBooking.TripSource HELSINKI = null;
        public static final FlightBooking.TripSource PARIS = null;
        
        
    }

    public enum BookingClass {
        ;

        public static final FlightBooking.BookingClass FIRST = null;
    }

    public interface TripDestination {

        TripDestination BEIJING = null;
    }

    public interface TripType {
        FlightBooking.TripType ONE_WAY = null;

        FlightBooking.TripType RETURN = null;
    }
}

