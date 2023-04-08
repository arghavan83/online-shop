package org.example;

import java.util.Scanner;

public class OptionMenu extends UserService{
public void WelcomeMenu(){

        firstAdmin();
        Scanner welcomeMenuInput = new Scanner(System.in);
        System.out.println("welcome to our shape");
        System.out.println("you are an admin or user?");
        String firstChoice = welcomeMenuInput.nextLine();
        switch (firstChoice) {
            case ("admin"):
                adminLogin();
            case ("user"):
                UserFirstStep();
            default:
                System.out.println("invalid choice please try again");
        }

}
    public void UserFirstStep(){
        Scanner userFirstInput=new Scanner(System.in);
        System.out.println("Do you want to exit?");
        String exitCheck1=userFirstInput.nextLine();
        if(exitCheck1.equals("yes")){
            System.out.println("goodbye");
            WelcomeMenu();
        }

        System.out.println("Do you have an account?");
        String choice=userFirstInput.nextLine();
        switch (choice){
            case ("yes"):
                userLogin();
            case ("no"):
                userSignUp();
            default:
                System.out.println("Choose yes or no please");

            }
    }

}
