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
    private Money[] money = new Money[] {
            new Bill200(),
            new Bill100(),
            new Bill50(),
            new Bill20(),
            new Bill10(),
            new Coin5(),
            new Coin2(),
            new Coin1(),
            new Coin0_50(),
            new Coin0_20(),
            new Coin0_10(),
            new Coin0_05(),
            new Coin0_02(),
            new Coin0_01()
    };

    public TicketMachine(String ticketMachineLocation) {
        this.ticketMachineLocation = ticketMachineLocation;
    }
}