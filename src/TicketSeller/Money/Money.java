package TicketSeller.Money;

public abstract class Money {
    protected double value;

    public double getValue() {
        return value;
    }

    public String toString() {
        return Double.toString(value);
    }
}