package com.exercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    
    @Test
    public void should_return_zero() {
        Calculator calculator = new Calculator();
        double result = calculator.add("");
        assertEquals(0, result, 0.0);
    }
}
