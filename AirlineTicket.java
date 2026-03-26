public class AirlineTicket extends TransportTicket {

    private String flightNo;
    private double maxBaggage;

    public AirlineTicket(String ticketId, String name, double baseFare,
                         String travelRoute, String seatNumber,
                         String flightNo, double maxBaggage) {

        super(ticketId, name, baseFare, travelRoute, seatNumber);
        this.flightNo = flightNo;
        this.maxBaggage = maxBaggage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Flight No: " + flightNo);
        System.out.println("Baggage Limit: " + maxBaggage + "kg");
    }

    @Override
    public double calculateFare() {
        double baggageFee = 0;

        if (maxBaggage > 25) {
            baggageFee = 150;
        }

        return super.calculateFare() + baggageFee + 300;
    }

    public void checkIn() {
        System.out.println("Check-in completed for flight: " + flightNo);
    }

    @Override
    public String toString() {
        return super.toString() + ", Flight=" + flightNo + ", Baggage=" + maxBaggage;
    }
}