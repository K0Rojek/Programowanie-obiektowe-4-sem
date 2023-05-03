package TicketSeller;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private List<Ticket> soldTickets;
    private double saleValue;
    private LocalDate saleDate;

    public Transaction(List<Ticket> soldTickets, double saleValue) {
        this.soldTickets = soldTickets;
        this.saleValue = saleValue;
        this.saleDate = LocalDate.now(); // sets the current date
    }

    public List<Ticket> getSoldTickets() {
        return soldTickets;
    }

    public double getSaleValue() {
        return saleValue;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }
}