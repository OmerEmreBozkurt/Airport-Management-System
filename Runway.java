public class Runway extends PlaneManagementSystem{
    private String runwayId;
    private Plane reservedPlane;

    public Runway(String runwayId) {
        this.runwayId = runwayId;
        reservedPlane = null;
    }

    // Getters and setters

    public String getRunwayId() {
        return runwayId;
    }

    public void setRunwayId(String runwayId) {
        this.runwayId = runwayId;
    }

    public void setReservedPlane(Plane reservedPlane) {
        this.reservedPlane = reservedPlane;
    }

    public Plane getReservedPlane() {
        return reservedPlane;
    }

    public void reserveRunway(Plane plane) {
        reservedPlane = plane;
        reservedPlane.setInRunway(true);
    }

    public void resetRunway() {
        reservedPlane.setInRunway(false);
        reservedPlane = null;
    }


    public String toString() {
        if (reservedPlane == null) {
            return "Runway " + runwayId + " is available.";
        } else {
            return "Runway " + runwayId + " is reserved by Plane: " + reservedPlane.getPlaneId();
        }
    }
}
