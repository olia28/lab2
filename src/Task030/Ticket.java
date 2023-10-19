package Task030;
class Ticket {
    private final int ticketId;
    private final double ticketPrice;
    private final int ticketQuantity;

    public Ticket(int ticketId, double ticketPrice, int ticketQuantity) {
        this.ticketId = ticketId;
        this.ticketPrice = ticketPrice;
        this.ticketQuantity = ticketQuantity;
    }

    public int getTicketId() {
        return ticketId;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getTicketQuantity() {
        return ticketQuantity;
    }
}
