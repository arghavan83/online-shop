package org.example;
import java.util.UUID;

import java.util.Scanner;

public class User {
    private UUID userId;
    private String userName;
    private String password;
    private String emailAddress;
    private String phoneNumber;
    public User(String userName,String password,String emailAddress,String phoneNumber ){
        this.userName=userName;
        this.password=password;
        this.emailAddress=emailAddress;
        this.phoneNumber=phoneNumber;
        this.userId=UUID.randomUUID();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress=emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public UUID getUserId() {
        return userId;
    }
}
