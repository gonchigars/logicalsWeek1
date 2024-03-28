package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumTest {
    @Test
    public void testAddNumbers() {
        // Arrange
        int num1 = 5;
        int num2 = 10;
        int expectedSum = 15;

        // Act
        int actualSum = Sum.addNumbers(num1, num2);

        // Assert
        assertEquals(expectedSum, actualSum);
    }
}