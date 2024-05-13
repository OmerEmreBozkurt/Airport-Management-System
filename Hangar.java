public class Hangar extends PlaneManagementSystem{
    private String hangarId;
    private Plane reservedPlane;

    public Hangar(String hangarId) {
        this.hangarId = hangarId;
        this.reservedPlane = null;
    }

    // Getters and setters

    public String getHangarId() {
        return hangarId;
    }

    public void setHangarId(String hangerId) {
        this.hangarId = hangerId;
    }

    public void setReservedPlane(Plane reservedPlane) {
        this.reservedPlane = reservedPlane;
    }

    public Plane getReservedPlane() {
        return reservedPlane;
    }

    public void reserveHangar(Plane plane) {
        reservedPlane = plane;
        reservedPlane.setInHangar(true);
    }

    public void resetHangar() {
        reservedPlane.setInHangar(false);
        reservedPlane = null;
    }

    @Override
    public String toString() {
        if (reservedPlane == null) {
            return "Hangar " + hangarId + " is available.";
        } else {
            return "Hangar " + hangarId + " is reserved by Plane: " + reservedPlane.getPlaneId();
        }
    }
}
