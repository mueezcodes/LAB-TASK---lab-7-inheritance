public class TransportTicket extends Ticket {

    private String travelRoute;
    private String seatNumber;

    public TransportTicket(String ticketId, String name, double baseFare,
                           String travelRoute, String seatNumber) {

        super(ticketId, name, baseFare); // calling parent constructor
        this.travelRoute = travelRoute;
        this.seatNumber = seatNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // parent info first
        System.out.println("Route: " + travelRoute);
        System.out.println("Seat: " + seatNumber);
    }

    @Override
    public double calculateFare() {
        double extra;

        // simple seat-based logic
        if (seatNumber.startsWith("A")) {
            extra = 100;
        } else {
            extra = 50;
        }

        return super.calculateFare() + extra;
    }

    public void boardVehicle() {
        System.out.println("Boarding done for route: " + travelRoute);
    }

    @Override
    public String toString() {
        return super.toString() + ", Route=" + travelRoute + ", Seat=" + seatNumber;
    }
}