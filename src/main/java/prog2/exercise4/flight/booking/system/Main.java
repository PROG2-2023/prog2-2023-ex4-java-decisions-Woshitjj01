package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        String TripSource = "NANJING";
        String sdepart = "2023-03-09";
        LocalDate depart = LocalDate.parse(sdepart);
        String sreturn = "2023-03-14";
        LocalDate returnDate = LocalDate.parse(sreturn);
        String random = "FOF"+Math.random();
        String substring = random.substring(random.length()-4);
        String sourceAirport = "NANJING LUKOU \n" +
                "INTERNATIONAL AIRPORT";
        String destinationAirport = "OULU AIRPORT";
        FlightBooking a = new FlightBooking("Kehan", depart, returnDate, 1, 3);
        int expResult = 4;
        a.setTotalPassengers(1,3);
        int result = a.getTotalPassengers();
        FlightBooking fb = new FlightBooking(null, null, null, 0, 0);

        FlightBooking.TripSource source = FlightBooking.TripSource.NANJING;
        FlightBooking.TripDestination destination = FlightBooking.TripDestination.BEIJING;

        FlightBooking.TripType type = FlightBooking.TripType.ONE_WAY;

        FlightBooking.BookingClass bookClass = FlightBooking.BookingClass.FIRST;

        fb.setTripSource("1");
        fb.setTripDestination("1", "2");

        fb.setTripType("1");
        fb.setBookingClass("1");

        String expectedTicketNumber = "11FASDFDOM";

        String expectedSubstring1 = expectedTicketNumber.substring(0,2);
        String expectedSubstring2 = expectedTicketNumber.substring(7, 9);

        String ticketNumber = fb.getTicketNumber();

        String returnedSubstring1 = ticketNumber.substring(0, 2);

        String returnedSubstring2 = ticketNumber.substring(7, 9);

        if(expectedSubstring1.equals(returnedSubstring1) && expectedSubstring2.equals(returnedSubstring2)){
            assertEquals(1,1);
        }
        else {
            assertEquals(1,2);
        }
        a.setPassengerFullName("Kehan");
        a.setTicketNumber("HT2514875");
        a.setTripSource("NanJing") ;
        a.setTripDestination("OULU");
        a.setFlightCompany("Flights-of-Fancy");
        a.setDepartureDate(LocalDate.parse("2023-03-09"));
        a.setReturnDate(LocalDate.parse("2023-03-14"));
        a.setTotalTicketPrice(6666);
        a.setTripSource("NANJING");


        System.out.println("Dear " + a.getPassengerFullName() + ". Thank you for booking your flight with " +
                a.getFlightCompany() + ".\n Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + a.getTicketNumber() + "\n" +
                "From " + a.getTripSource() + " to " + a.getTripDestination() + "\n" +
                "Date of departure: " + a.getDepartureDate() + "\n" +
                "Date of return: " + a.getReturnDate() + "\n" +
                "Total passengers: " + a.getTotalPassengers() + "\n" +
                "Total ticket price in Euros: " + a.getTotalTicketPrice());
    }

    private static void assertEquals(int i, int i1) {
    }



}

