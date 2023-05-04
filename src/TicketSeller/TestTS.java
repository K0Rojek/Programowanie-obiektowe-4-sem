package TicketSeller;
import TicketSeller.Money.*;
import java.time.LocalDate;

public class TestTS {
    public static void main(String[] args) {
        // utworzenie obiektu biletomatu
        TicketMachine ticketMachine = new TicketMachine("Stacja Główna");

        // wyświetlenie dostępnych biletów
        ticketMachine.printTickets();

        // kupno biletu gotówką
        Ticket ticket = ticketMachine.getTickets()[1];
        Money[] payment = {new Bill10(), new Coin2()};
        ticketMachine.buyTicketWithCash(ticket, payment);

        // kupno biletu kartą
        Ticket ticket2 = ticketMachine.getTickets()[0];
        Card card = new Card(200.00, "12345", "Jan Kowalski", LocalDate.of(2025, 12, 31), "123");
        ticketMachine.buyTicketWithCard(ticket2, card);

        // wyświetlenie wszystkich transakcji
        ticketMachine.printAllTransactions();

        // wyświetlenie transakcji z określonej daty
        LocalDate date = LocalDate.now();
        ticketMachine.printTransactions(date);
    }

}
