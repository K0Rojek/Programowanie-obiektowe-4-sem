package TicketSeller;

public class Ticket {
    private String ticketType;

    private double ticketPrice;
    public Ticket(String ticketType, double ticketPrice) {
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
    }

    public String toString() {
        return ticketType + "(price: " + ticketPrice + ")";
    }

    public String getTicketType() {
        return ticketType;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
