import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Flight extends FlightManagementSystem{
    private String departureLocation;
    private String landingLocation;
    private Date departureDate;
    private Plane plane;
    private ArrayList<Ticket> ticketArrayList;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


    public Flight(String departureLocation, String landingLocation, Date departureDate, Plane plane) {
        this.departureLocation = departureLocation;
        this.landingLocation = landingLocation;
        this.departureDate = departureDate;
        this.plane = plane;
        this.ticketArrayList = new ArrayList<Ticket>();
        setTickets();
    }

    public void setTickets(){
        for (int i = 1; i < plane.getCapacity()/2; i++) {
            Ticket ticket = new Ticket(true, i);
            this.ticketArrayList.add(ticket);
        }
        for (int i = plane.getCapacity()/2; i <= plane.getCapacity(); i++) {
            Ticket ticket = new Ticket(false, i);
            this.ticketArrayList.add(ticket);
        }
    }


    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getLandingLocation() {
        return landingLocation;
    }

    public void setLandingLocation(String landingLocation) {
        this.landingLocation = landingLocation;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }


    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setTicketArrayList(ArrayList<Ticket> ticketArrayList) {
        this.ticketArrayList = ticketArrayList;
    }

    public ArrayList<Ticket> getTicketArrayList() {
        return ticketArrayList;
    }

    @Override
    public String toString() {
        return "Flight " + departureLocation + " to " + landingLocation + " on date " + dateFormat.format(departureDate);
    }
}
