package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    @Test
    public void testAddNumbers() {
        // Test case 1: both numbers are positive
        assertEquals(5, Sum.addNumbers(2, 3));

        // Test case 2: both numbers are negative
        assertEquals(-5, Sum.addNumbers(-2, -3));

        // Test case 3: one positive, one negative number
        assertEquals(0, Sum.addNumbers(2, -2));

        // Test case 4: zero and a positive number
        assertEquals(2, Sum.addNumbers(0, 2));

        // Test case 5: zero and a negative number
        assertEquals(-2, Sum.addNumbers(0, -2));
    }
}
