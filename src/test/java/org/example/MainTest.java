package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    public int[] prices = {13, 17, 19, 25, 25, 25, 25, 25, 25, 27, 30};
    @Test
    void countMoreSucces() {
        assertEquals(0, Main.countMore(prices, 31));
        assertEquals(2, Main.countMore(prices, 26));
        assertEquals(2, Main.countMore(prices, 25));
        assertEquals(8, Main.countMore(prices, 20));
    }

    @Test
    void countMoreFail() {
        assertNotEquals(0, Main.countMore(prices, 20));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "31, 0",
            "26, 2",
            "25, 2",
            "20, 8"
    })
    void countMoreParameterized(int money, int result) {
        assertEquals(result, Main.countMore(prices, money));
    }
}