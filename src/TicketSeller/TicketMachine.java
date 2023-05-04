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

    public Ticket[] getTickets() {
        return tickets;
    }

    public void printTickets() {
        System.out.println("Available tickets:");
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    public void buyTicketWithCash(Ticket ticket, Money[] payment) {
        double totalPrice = ticket.getTicketPrice();
        double sum = 0;
        for (Money cash : payment) {
            sum += cash.getValue();
        }
        if (sum < totalPrice) {
            System.out.println("Insufficient payment.");
            return;
        }

        double change = sum - totalPrice;
        if (change > 0) {
            System.out.println("Change: " + change);
            ArrayList<Money> changeList = new ArrayList<Money>();
            for (Money cash : money) {
                while (change >= cash.getValue()) {
                    changeList.add(cash);
                    change -= cash.getValue();
                }
            }
            System.out.println("Change: " + changeList);
        }

        // Update soldTickets
        List<Ticket> soldTicketList = new ArrayList<Ticket>();
        soldTicketList.add(ticket);
        Transaction transaction = new Transaction(soldTicketList, totalPrice, payment);
        soldTickets.add(transaction);
    }

    public void buyTicketWithCard(Ticket ticket, Card card) {
        double totalPrice = ticket.getTicketPrice();
        if (card.charge(totalPrice)) {
            // Update soldTickets
            List<Ticket> soldTicketList = new ArrayList<Ticket>();
            soldTicketList.add(ticket);
            Transaction transaction = new Transaction(soldTicketList, totalPrice, new Money[]{});
            soldTickets.add(transaction);
            System.out.println("Purchase successful!");
        } else {
            System.out.println("Not enough funds on the card.");
        }
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Sold tickets:\n");
        for (Transaction transaction : soldTickets) {
            output.append(transaction.getSaleDate()).append(" : ")
                    .append(transaction.getSoldTickets().get(0).getTicketType()).append(" : ")
                    .append(transaction.getSoldTickets().size()).append(" : ")
                    .append(transaction.getSaleValue()).append("\n");
        }
        return output.toString();
    }
    public void printTransactions(LocalDate date) {
        System.out.println("Transactions from " + date + ":");
        for (Transaction transaction : soldTickets) {
            if (transaction.getSaleDate().equals(date)) {
                System.out.println(transaction);
            }
        }
    }
    public void printAllTransactions() {
        System.out.println("All transactions:");
        for (Transaction transaction : soldTickets) {
            System.out.println(transaction);
        }
    }




}