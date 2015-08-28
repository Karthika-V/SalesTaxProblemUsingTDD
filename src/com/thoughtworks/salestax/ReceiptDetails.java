package com.thoughtworks.salestax;

public class ReceiptDetails {

    private String ItemDetails;

    public ReceiptDetails(String ItemDetails) {
        this.ItemDetails = ItemDetails;
    }

    public String Bill()
    {
        return ItemDetails;
    }


}
