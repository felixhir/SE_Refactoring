package main;

import main.Movie;
import main.Rental;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RentalTest {

    Rental rental;
    Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie("Regular Movie", Movie.REGULAR);
        rental = new Rental(movie, 14);
    }

    @Test
    void getDaysRented() {
        int expected = 14;

        assertEquals(expected, rental.getDaysRented());
    }

    @Test
    void getMovie() {
        Movie expected = movie;

        assertEquals(expected, rental.getMovie());
    }
}