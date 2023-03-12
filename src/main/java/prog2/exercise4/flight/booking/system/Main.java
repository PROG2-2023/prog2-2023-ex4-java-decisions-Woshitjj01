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
        String random = "FOF"+Math.random();// flightID
        String substring = random.substring(random.length()-4);
        String sourceAirport = "NANJING LUKOU \n" +
                "INTERNATIONAL AIRPORT";
        String destinationAirport = "OULU AIRPORT";
        FlightBooking a = new FlightBooking("Kehan", depart, returnDate, 1, 3);
        int expResult = 4;
        a.setTotalPassengers(1,3);
        int result = a.getTotalPassengers();
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
        
        
    }

