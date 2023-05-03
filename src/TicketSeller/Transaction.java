package TicketSeller;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    final private List<Ticket> soldTickets;
    final private double saleValue;
    final private LocalDate saleDate;

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