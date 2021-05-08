package main;

import main.Customer;
import main.Movie;
import main.Rental;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    private Customer customer;
    private Rental rental;
    private Movie movie;

    @BeforeEach
    void setUp() {
        customer = new Customer("main.Movie Renter");
        movie = new Movie("Don't watch me", Movie.CHILDREN);
        rental = new Rental(movie, 7);

        customer.addRental(rental);
    }

    @Test
    void getName() {
        String expected = "main.Movie Renter";

        assertEquals(expected, customer.getName());
    }

    @Test
    void statement() {
        String expected = "Rental Record for main.Movie Renter\n";
        expected += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        expected += "\tDon't watch me\t" + "\t7\t7.5\n";
        expected += "Amount owed is 7.5\n";
        expected += "You earned 1 frequent renter points";

        assertEquals(expected, customer.statement());
    }

    @Test
    void htmlStatement() {
        String expected = "<H1>Rentals for <EM>main.Movie Renter</EM></H1><P>\n" +
                "Don't watch me: 7.5<BR>\n" +
                "<P>You owe <EM>7.5</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>";

        assertEquals(expected, customer.htmlStatement());
    }
}