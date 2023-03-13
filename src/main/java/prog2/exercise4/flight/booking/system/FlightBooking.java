package prog2.exercise4.flight.booking.system;
import java.io.File;
import java.time.LocalDate;

public class FlightBooking<BookingLevel, DepartureDate> {

    private static final Object ONE_WAY =null ;
    private String BookingClass;
    private String passengerFullName;
    private String sourceAirport;
    private String FlightCompany;
    private String destinationAirport;
    private static String TripType;
    private LocalDate returnDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double departingTicketPrice;
    private double totalTicketPrice;
    private TripDestination TripDestination;
    private DepartureDate DepartureDate;
    private String ticketNumber;

    // Getter for ticket number

    // Setter for ticket number

    public FlightBooking(String aNull, LocalDate depart, LocalDate returnDate, int i, int i1) {
        this.passengerFullName = aNull;
        this.departureDate = depart;
        this.returnDate = returnDate;
        this.childPassengers =i;
        this.adultPassengers =i1;
    }

    public String getTicketNumber() {
        return null;
    }

    public void setBookingClass(String s) {
    }

    public void setTripType(String s) {
    }

    enum TripType {
        ONE_WAY("One way"),
        RETURN("Return");

        public final String label;
        TripType(String label) {
            this.label = label;}
    }


    private TripSource tripSource;
    private String origin;
    private String destination;
    private LocalDate departureDate;
    private String flightNumber;
    private int passengerCount;
    private BookingLevel bookingLevel;
    private BookingClass bookingClass;
    private TripType tripType; // 修改为 TripType 类型

    // Getters and Setters
    //public void setTripType(String choice) {
       // if (choice.equals("1")) {
          //  this.tripType = TripType.ONE_WAY; // 修改为 ONE_WAY
       // } else if (choice.equals("2")) {
         //   this.tripType = TripType.RETURN;
      //  } else {
         //   throw new IllegalArgumentException("Invalid trip type choice!");
       // }
  //  }

    public TripType getTripType() { // 修改为 TripType 类型
        return this.tripType; // 修改为返回 this.tripType
    }


        private TripSource TripSource;

    



    public FlightBooking.TripSource getTripSource() {
        return TripSource;
    }

    public void setTripSource(String TripSource) {
        TripSource = TripSource;
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

    public TripDestination getTripDestination() {
        return TripDestination;
    }

    public void setTripDestination(String tripDestination) {
        TripDestination = TripDestination;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public DepartureDate getDepartureDate() {
        return DepartureDate;
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
    

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " +
                FlightCompany + ". \nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + ticketNumber + "\n" +
                "From " + TripSource + " to " + TripDestination + "\n" +
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

    

    public void setDepartingTicketPrice(int child, int adults) {
    }

    public void setTotalTicketPrice() {
    }
    


    

    public enum TripDestination {
        NANJING,
        BEIJING,
        Shanghai,
        Oulu,
        Helsinki,
        Paris;

    }
    enum BookingClass { 
        FIRST("First"),
        BUSINESS("Business"),
        ECONOMY("Economy");
        public final String label;
        BookingClass(String label) { 
            this.label = label;
        }     } 
    public static class TripSource {
        public static final FlightBooking.TripSource NANJING = null;
        public static final FlightBooking.TripSource BEIJING = null; 
        public static long valueOf(String nanjing) {  
            return 0;        
        }   
    }        
    // Getters and Setters  
    // public void setBookingClass(String choice)
    // {             if (choice.equals("1")) {  
    // this.bookingClass = BookingClass.FIEST;             }
    // else if (choice.equals("2")) 
    // {
    // this.bookingClass = BookingClass.BUSINESS;
    // } else if (choice.equals("3")) { 
    // this.bookingClass = BookingClass.ECONOMY;
    // } else { 
    // throw new IllegalArgumentException("Invalid booking class choice!");
    // }  
    // }       
    // public BookingClass getBookingClass() { 
    // return bookingClass;   
    // }

}
class Trip {

    private String TicketNumber;

    public enum Location {
        NANJING,
        BEIJING,
        OULU,
        HELSINKI,
        PARIS
    }

    private Location source;
    private Location destination;
    private String sourceAirport;
    private String destinationAirport;
    private LocalDate departureDate;
    private LocalDate returnDate;

    public Location getSource() {
        return source;
    }

    public void setSource(Location source) {
        if (source == destination) {
            throw new IllegalArgumentException("Source and Destination cannot be the same location");
        }
        this.source = source;
        switch (source) {
            case NANJING:
                setSourceAirport("Nanjing Lukou International Airport");
                break;
            case BEIJING:
                setSourceAirport("Beijing Capital International Airport");
                break;
            case OULU:
                setSourceAirport("Oulu Airport");
                break;
            case HELSINKI:
                setSourceAirport("Helsinki Airport");
                break;
        }
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        if (destination == source) {
            throw new IllegalArgumentException("Source and Destination cannot be the same location");
        }
        this.destination = destination;
        switch (destination) {
            case NANJING:
                setDestinationAirport("Nanjing Lukou International Airport");
                break;
            case BEIJING:
                setDestinationAirport("Beijing Capital International Airport");
                break;
            case OULU:
                setDestinationAirport("Oulu Airport");
                break;
            case HELSINKI:
                setDestinationAirport("Helsinki Airport");
                break;
            case PARIS:
                setDestinationAirport("Paris Charles de Gaulle Airport");
                break;
        }
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
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
        validateDates();
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
        validateDates();
    }

    private void validateDates() {
        if (departureDate != null && returnDate != null) {
            LocalDate minReturnDate = departureDate.plusDays(2);
            if (returnDate.isBefore(minReturnDate)) {
                returnDate = minReturnDate;
                System.out.println("Return date was automatically adjusted to " + returnDate.toString());
            }
        }

        if (departureDate != null && returnDate != null && departureDate.equals(returnDate)) {
            returnDate = departureDate.plusDays(2);
            System.out.println("Return date was automatically adjusted to " + returnDate.toString());
        }
    }

    public void setTicketNumber(String ticketNumber) {
        // Validation check for ticket number length
        if (ticketNumber.length() != 10) {
            throw new IllegalArgumentException("Ticket number must be exactly 10 characters long.");
        }

        // Validation check for one-way trip
        if (ticketNumber.startsWith("11")) {
            if (ticketNumber.endsWith("DOM") || ticketNumber.endsWith("INT")) {
                throw new IllegalArgumentException("Invalid ticket number for one-way trip.");
            }
        }

        // Validation check for return trip
        else if (ticketNumber.startsWith("22")) {
            if (ticketNumber.endsWith("DOM") || ticketNumber.endsWith("INT")) {
                throw new IllegalArgumentException("Invalid ticket number for return trip.");
            }
        }

        // Validation check for booking class
        else if (ticketNumber.endsWith("F") || ticketNumber.endsWith("B") || ticketNumber.endsWith("E")) {
            // Validation check for domestic trip
            if (ticketNumber.endsWith("DOM")) {
                if (!ticketNumber.startsWith("11") && !ticketNumber.startsWith("22")) {
                    throw new IllegalArgumentException("Invalid ticket number for domestic trip.");
                }
            }

            // Validation check for international trip
            else if (ticketNumber.endsWith("INT")) {
                if (!ticketNumber.startsWith("11") && !ticketNumber.startsWith("22")) {
                    throw new IllegalArgumentException("Invalid ticket number for international trip.");
                }
            }

            // Validation failed, throw exception
            else {
                throw new IllegalArgumentException("Invalid ticket number format.");
            }
        }

        // Validation failed, throw exception
        else {
            throw new IllegalArgumentException("Invalid ticket number format.");
        }

        // All validation passed, set ticket number
        this.TicketNumber = ticketNumber;
    }
}
class Ticket {
    private String ticketNumber;
    private boolean isReturnTrip;
    private String bookingClass;
    private boolean isDomesticTrip;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;
    private String PassengerFullName;
    private String TripSource;
    private String TripDestination;
    private String departingDate;
    private String returningDate;
    private String oldReturningDate;
    private String totalPassengers;
    private File returnDate;

    public Ticket() {
        // Default constructor
    }

    // Getter for ticket number
    public String getTicketNumber() {
        return ticketNumber;
    }

    // Setter for ticket number (with validation check)
    public void setTicketNumber(String ticketNumber) {
        // Validation check here ...
        this.ticketNumber = ticketNumber;
    }

    // Getter and setter for isReturnTrip
    public boolean isReturnTrip() {
        return isReturnTrip;
    }

    public void setReturnTrip(boolean returnTrip) {
        isReturnTrip = returnTrip;
    }

    // Getter and setter for bookingClass
    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    // Getter and setter for isDomesticTrip
    public boolean isDomesticTrip() {
        return isDomesticTrip;
    }

    public void setDomesticTrip(boolean domesticTrip) {
        isDomesticTrip = domesticTrip;
    }

    // Setter for departing ticket price (with parameters)
    public void setDepartingTicketPrice(int numAdults, int numChildren) {
        double basePrice = 300;
        double taxes = basePrice * 0.1;
        double serviceFees = basePrice * 0.05;
        double bookingClassCharge = 0;

        switch (bookingClass) {
            case "First":
                bookingClassCharge = 250;
                break;
            case "Business":
                bookingClassCharge = 150;
                break;
            case "Economy":
                bookingClassCharge = 50;
                break;
        }

        double totalPrice = basePrice + taxes + serviceFees + bookingClassCharge;
        totalPrice *= (numAdults + 0.5 * numChildren);

        if (isDomesticTrip) {
            totalPrice += 50; // Domestic trip charge
        } else {
            totalPrice += 75; // International trip charge
        }

        departingTicketPrice = totalPrice;
    }

    // Setter for return ticket price (without parameter)
    public void setReturnTicketPrice() {
        if (isReturnTrip) {
            returnTicketPrice = departingTicketPrice * 0.8; // Return trip discount
        }
    }

    // Setter for total ticket price (without parameter)
    public void setTotalTicketPrice() {
        totalTicketPrice = departingTicketPrice + returnTicketPrice;
    }

    // Getter for departing ticket price
    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }

    // Getter for return ticket price
    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }

    // Getter for total ticket price
    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }
    public void displayConfirmationMessage() {
        String message = "Thank you for booking your flight with FLIGHT_COMPANY. Following are the details of your booking and the trip:\n";
        message += "Ticket Number: " + ticketNumber + "\n";
        message += "Passenger Name: " + PassengerFullName + "\n";
        message += "From " + TripSource + " to " + TripDestination + "\n";
        message += "Date of departure: " + departingDate + "\n";

        if (isReturnTrip) {
            message += "Date of return: " + returningDate;
            if (!returningDate.equals(oldReturningDate)) {
                message += " (Changed from " + oldReturningDate + " to " + returningDate + ")";
            }
            message += "\n";
        }

        message += "Total passengers: " + totalPassengers + "\n";
        message += "Total ticket price in Euros: " + totalTicketPrice + "\n";

        if (!isReturnTrip || returnDate.compareTo(new File(departingDate)) >= 2) {
            message += "IMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date.\n";
        }

        System.out.println(message);}}




