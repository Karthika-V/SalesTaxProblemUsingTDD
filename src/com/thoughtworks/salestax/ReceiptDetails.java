package com.thoughtworks.salestax;

public class ReceiptDetails {

    private String itemDetails;

    public ReceiptDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }

    public String Bill() {
        return itemDetails;
    }

    public Boolean TaxExemption(String itemDetails) {
        String[] items = itemDetails.split(" ");
        if (items[1] == "book")
            return true;
        return false;
    }
}
