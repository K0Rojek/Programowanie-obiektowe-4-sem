package TicketSeller;

public class Ticket {
    final private String ticketType;

    final private double ticketPrice;
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
