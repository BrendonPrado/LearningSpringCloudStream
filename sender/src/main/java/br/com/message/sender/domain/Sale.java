package br.com.message.sender.domain;

import java.io.Serializable;

/**
 * Order
 */
public class Sale implements Serializable {
     static final long serialVersionUID = 1L;

     String saleDetails;
     double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSaleDetails() {
        return saleDetails;
    }

    public void setSaleDetails(String saleDetails) {
        this.saleDetails = saleDetails;
    }



    public Sale(String saleDetails, double price) {
        this.saleDetails = saleDetails;
        this.price = price;
    }

}