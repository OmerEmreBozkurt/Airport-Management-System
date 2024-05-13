import java.util.ArrayList;
import java.util.UUID;

public class Passenger extends PassengerManagementSystem{
    private int id;
    private String name;
    private String surname;
    private String passengerType;
    private int luggageCount;
    private int yearOfBirth;

    public Passenger(String name, String surname, String passengerType, int luggageCount, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.passengerType = passengerType;
        this.luggageCount = luggageCount;
        this.yearOfBirth = yearOfBirth;
    }

    public void addPassenger(Passenger passenger, ArrayList<Passenger> passengerArrayList){
        passengerArrayList.add(passenger);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public int getLuggageCount() {
        return luggageCount;
    }

    public void setLuggageCount(int luggageCount) {
        this.luggageCount = luggageCount;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return passengerType + " Passenger: " + id + ": "  + name + " " + surname + ", " + + yearOfBirth;
    }
    }


