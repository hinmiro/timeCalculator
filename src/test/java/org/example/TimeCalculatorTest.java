package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeCalculatorTest {
    TimeCalculator calculator;

    @Before
    public void init() {
        calculator = new TimeCalculator();
    }

    @Test
    public void testCalculateTimeNormal() {
        assertEquals(2.0, calculator.calculateTime(100.0, 50.0), 0.0001);
    }

    @Test
    public void testCalculateZeroSpeed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateTime(100, 0);
        });
    }

    @Test
    public void testCalculateNegativeSpeed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateTime(100, -10);
        });
    }
}