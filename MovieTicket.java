import java.util.Scanner;

public class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Parameterized constructor
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Total = ticket price x number of tickets
    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // 10% discount if 5 or more tickets, otherwise no discount
    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    // Final amount = total - discount
    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Display the bill
    public void displayBill() {
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final Amount: %.2f%n", calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String movieName = sc.nextLine();
        double ticketPrice = sc.nextDouble();
        int numberOfTickets = sc.nextInt();

        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        ticket.displayBill();

        sc.close();
    }
}
