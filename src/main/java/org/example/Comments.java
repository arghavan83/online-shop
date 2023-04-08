package org.example;

import java.util.UUID;

public class Comments {
    private UUID commentId;
    private String userName;
    private String productName;
    private String comment;
    public Comments(String userName,String productName,String comment){
        this.userName=userName;
        this.productName=productName;
        this.comment=comment;
        this.commentId=UUID.randomUUID();
    }


    public String getComment() {
        return comment;
    }

    public UUID commentId() {
        return commentId;
    }

    public String getProduct() {
        return productName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }
}
