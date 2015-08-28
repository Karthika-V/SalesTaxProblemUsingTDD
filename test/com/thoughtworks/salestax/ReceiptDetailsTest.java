package com.thoughtworks.salestax;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReceiptDetailsTest {

    @Test
    public void shouldHaveAtleastOneItem() {
        ReceiptDetails item1 = new ReceiptDetails("1 book at 12.49");
        assertEquals(item1.Bill(),"1 book at 12.49");
    }

    @Test
    public void shouldHaveTaxExemptionForBookItems() {
        ReceiptDetails item1 = new ReceiptDetails("1 book at 12.49");
        assertTrue(item1.TaxExemption("book"));
    }

}
