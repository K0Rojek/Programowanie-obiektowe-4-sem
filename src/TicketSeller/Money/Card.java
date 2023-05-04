package TicketSeller.Money;
import java.time.LocalDate;

public class Card extends Money {
    private String cardNumber;
    private String cardHolderName;
    private LocalDate expirationDate;
    private String cvv;

    public Card(double value, String cardNumber, String cardHolderName, LocalDate expirationDate, String cvv) {
        this.value = value;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public boolean charge(double amount) {
        if (getValue() >= amount) {
            this.value = getValue() - amount;
            return true;
        }
        return false;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getCvv() {
        return cvv;
    }
}

