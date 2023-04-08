package org.example;
import java.util.UUID;
import java.util.Scanner;

public class Admin {
    private String userName;
    private String password;
    private String emailAddress;
    private UUID adminId;
    public Admin(String userName,String password,String emailAddress ){
        this.userName= userName;
        this.password=password;
        this.emailAddress=emailAddress;
        this.adminId=UUID.randomUUID();
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public UUID getAdminId() {
        return adminId;
    }
}
