package foo

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

import static org.junit.Assert.*

@RunWith(JUnit4.class)
class BookTests {

    @Test
    void testCountBooks() {
        assertEquals(0, Book.count())
    }
}
