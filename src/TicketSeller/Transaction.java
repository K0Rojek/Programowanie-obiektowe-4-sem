package TicketSeller;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import TicketSeller.Money.*;

public class Transaction {
    private List<Ticket> soldTickets;
    private double saleValue;
    private LocalDate saleDate;
    private Money[] payment;

    public Transaction(List<Ticket> soldTickets, double saleValue, Money[] payment) {
        this.soldTickets = soldTickets;
        this.saleValue = saleValue;
        this.saleDate = LocalDate.now(); // sets the current date
        this.payment = payment;
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

    public String toString() {
        return "date: " + saleDate + "\n"
                + soldTickets + "\n"
                + "total price: " + saleValue;
    }
}