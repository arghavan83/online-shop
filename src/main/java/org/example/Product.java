package org.example;

import java.util.ArrayList;
import java.util.UUID;
public class Product {
    private String sellerName;
    private UUID productId;
    private String name;
    private int price;
    private int quantity;
    private ArrayList<Comments> productComments;
    public void addProductComment(Comments comments){
        productComments.add(comments);
    }

    public ArrayList<Comments> getProductComments() {
        return productComments;
    }

    public Product(String name, int price, int quantity, String sellerName){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.productId=UUID.randomUUID();
        this.sellerName=sellerName;

    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public UUID getProductId() {
        return productId;
    }
}

