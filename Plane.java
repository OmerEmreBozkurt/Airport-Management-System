public class Plane extends PlaneManagementSystem{
    private String planeId;
    private int capacity;
    private boolean available;
    private boolean inHangar;
    private boolean inRunway;


    public Plane(String planeId, int capacity) {
        this.planeId = planeId;
        this.capacity = capacity;
        this.available = true;
        this.inHangar = false;
        this.inRunway = false;
    }

    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isInHangar() {
        return inHangar;
    }

    public void setInHangar(boolean inHangar) {
        this.inHangar = inHangar;
    }

    public boolean isInRunway() {
        return inRunway;
    }

    public void setInRunway(boolean inRunway) {
        this.inRunway = inRunway;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return "Plane " + planeId + ", " + " Is Available: " + available + ", Capacity: " + capacity;
    }
}
