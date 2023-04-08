package org.example;

import java.util.List;
import java.util.UUID;


public class Seller extends User {
    private UUID sellerId;
    private String companyName;


    private boolean isConfirmed = false;
    public Seller(String password,String userName, String emailAddress, String phoneNumber,String companyName){
        super(userName, password, emailAddress, phoneNumber);
        this.companyName= companyName;
        this.sellerId=UUID.randomUUID();

    }




    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getCompanyName() {
        return companyName;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public UUID getSellerId() {
        return sellerId;
    }
}
