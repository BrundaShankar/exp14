package com.devops.lab;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testAddition2() {
        assertEquals(10, calc.add(5,5));
    }

    @Test
    public void testAddition3() {
        assertEquals(7, calc.add(3,4));
    }

    @Test
    public void testNegativeAddition() {
        assertEquals(-2, calc.add(-1,-1));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.divide(10,5));
    }

    @Test
    public void testDivisionNegative() {
        assertEquals(-2, calc.divide(-10,5));
    }

    @Test
    public void testDivideByZero() {
        try {
            calc.divide(10,0);
            fail("Expected exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}
