package TicketSeller;
import TicketSeller.Money.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TicketMachine {
    private String ticketMachineLocation;
    //composition
    private Ticket[] tickets = new Ticket[]{
            new Ticket("Reduced", 2.00), new Ticket("Normal", 3.00)
    };
    private ArrayList<Transaction> soldTickets = new ArrayList<>();
    private ;
}