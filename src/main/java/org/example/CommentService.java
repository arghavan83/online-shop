package org.example;

import java.util.Scanner;

public class CommentService {
    public void AddComment(){
        Scanner CommentInput=new Scanner(System.in);
        System.out.println("please enter your username");
        String newUserName=CommentInput.nextLine();
        System.out.println("please enter your productName");
        String newProductName=CommentInput.nextLine();
        System.out.println("please enter your comment");
        String newComment=CommentInput.nextLine();
        Comments comment=new Comments(newUserName,newProductName,newComment);

    }
    public  void CommentsList(){

    }
}
