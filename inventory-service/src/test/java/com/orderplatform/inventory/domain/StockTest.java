package com.orderplatform.inventory.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StockTest {

    @Test
    void releaseRejectsNonPositiveQuantity() {
        Stock stock = new Stock(1L, 5);
        stock.reserve(2);

        assertThrows(IllegalArgumentException.class, () -> stock.release(0));
    }
}
