public class Ticket {

    private String ticketId;
    private String name;
    private double baseFare;

    public Ticket(String ticketId, String name, double baseFare) {
        this.ticketId = ticketId;
        this.name = name;
        this.baseFare = baseFare;
    }

    public void displayInfo() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger: " + name);
        System.out.println("Base Fare: " + baseFare);
    }

    public double calculateFare() {
        return baseFare;
    }

    // checking if ticket is valid
    public boolean validateTicket() {
        return ticketId != null && !ticketId.isEmpty() && baseFare > 0;
    }

    @Override
    public String toString() {
        return "Ticket{" + ticketId + ", " + name + ", " + baseFare + "}";
    }
}