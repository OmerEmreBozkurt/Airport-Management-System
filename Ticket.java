import javax.swing.*;
import java.util.Objects;

public class Ticket extends AirportManagementSystem{
//    Flight details
//    Passenger details
//    Seat allocation
//    Base price calculation
//    Regular ticket and VIP ticket
//    VIP tickets can only be purchased by business class. Please add some
//    discount ratio as well for different categories of class.
    private Passenger passenger;
    private boolean VIP;
    private int price;
    private int seatID;


    public Ticket(boolean isVIP,int seatID) {
        this.passenger = null;
        this.VIP = isVIP;
        this.seatID = seatID;

    }


    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean isVIP) {
        this.VIP = isVIP;
    }

    public int showPrice(Passenger passenger){
        if (VIP && Objects.equals(passenger.getPassengerType(), "Business")){
            return 3150;
        } else if (VIP && !Objects.equals(passenger.getPassengerType(), "Business")) {
            return 0;
        } else if (!VIP && Objects.equals(passenger.getPassengerType(),"Family")) {
            return 900;
        } else {
            return 1250;
        }
    }


    @Override
    public String toString() {
        if (VIP) {
            if (passenger == null) {return "VIP Seat " + seatID + ": Empty";}
            else {return "VIP Seat " + seatID + ": " + passenger.getName() + " " + passenger.getSurname();}
        } else {
            if (passenger == null) {return "Seat " + seatID + ": Empty";}
            else {return "Seat " + seatID + ": " + passenger.getName() + " " + passenger.getSurname();}
        }
    }
}
