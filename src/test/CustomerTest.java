import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer;
    Rental rental;
    Movie movie;

    @BeforeEach
    void setUp() {
        customer = new Customer("Movie Renter");
        movie = new Movie("Don't watch me", Movie.CHILDRENS);
        rental = new Rental(movie, 7);

        customer.addRental(rental);
    }

    @Test
    void getName() {
        String expected = "Movie Renter";

        assertEquals(expected, customer.getName());
    }

    @Test
    void statement() {
        String expected = "Rental Record for Movie Renter\n";
        expected += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        expected += "\tDon't watch me\t" + "\t7\t7.5\n";
        expected += "Amount owed is 7.5\n";
        expected += "You earned 1 frequent renter points";

        assertEquals(expected, customer.statement());
    }
}