import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie("A very interesting movie", Movie.NEW_RELEASE);
    }

    @Test
    void getPriceCode() {
        int expected = Movie.NEW_RELEASE;

        assertEquals(expected, movie.getPriceCode());
    }

    @Test
    void setPriceCode() {
        int expected = Movie.REGULAR;
        movie.setPriceCode(Movie.REGULAR);

        assertEquals(expected, movie.getPriceCode());
    }

    @Test
    void getTitle() {
        String expected = "A very interesting movie";

        assertEquals(expected, movie.getTitle());
    }

}