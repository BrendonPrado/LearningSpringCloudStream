package br.com.message.consumer.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sale implements Serializable {
     static final long serialVersionUID = 1L;

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

     String saleDetails;
     double price;

    public Long getId() {
        return id;
    }

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

    public void setId(Long id) {
        this.id = id;
    }


    public Sale(Long id, String saleDetails, double price) {
        this.id = id;
        this.saleDetails = saleDetails;
        this.price = price;
    }


    public Sale() {
        super();
    }
}