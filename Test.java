public class Test {

    public static void main(String[] args) {

        Ticket t = new Ticket("T1", "Mueez", 500);
        TransportTicket tt = new TransportTicket("T2", "Ali", 600,
                "Lahore-Karachi", "A1");
        AirlineTicket at = new AirlineTicket("T3", "Ahmed", 1000,
                "Lahore-Dubai", "B2", "PK203", 30);

        System.out.println("===== Basic Ticket =====");
        t.displayInfo();
        System.out.println("Final Fare: " + t.calculateFare());
        System.out.println("Valid: " + t.validateTicket());

        System.out.println("\n===== Transport Ticket =====");
        tt.displayInfo();
        System.out.println("Final Fare: " + tt.calculateFare());
        tt.boardVehicle();

        System.out.println("\n===== Airline Ticket =====");
        at.displayInfo();
        System.out.println("Final Fare: " + at.calculateFare());
        at.boardVehicle();
        at.checkIn();

        // quick validation check
        if (at.validateTicket()) {
            System.out.println("Airline ticket is valid, ready to travel.");
        }
    }
}