

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void testAnotherAddition() {
        assertEquals(10, App.add(7, 3));
    }
}