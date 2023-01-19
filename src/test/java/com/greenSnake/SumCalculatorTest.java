package com.greenSnake;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SumCalculatorTest {
    private SumCalculator calc;
    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }
    @Test
    public void testSumForOne(){
        int result = calc.sum(1);
        int expect = 1;
        Assertions.assertEquals(expect, result);
    }
    @Test
    public void testSumForSix(){
        int result = calc.sum(6);
        int expect = 21;
        Assertions.assertEquals(expect, result);
    }
    @Test
    public void testSumForZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }


}