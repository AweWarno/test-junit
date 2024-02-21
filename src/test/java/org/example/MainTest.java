package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Calculator calc = Calculator.instance.get();

    @Test
    void testMain_functionPlus() {
        assertEquals(3, calc.plus.apply(1, 2));
    }

    @Test
    void testMain_functionMinus() {
        assertEquals(0, calc.minus.apply(1,1));
    }

    @Test
    void testMain_functionDevide() {
        assertEquals(0, calc.devide.apply(10, 0));
    }

}