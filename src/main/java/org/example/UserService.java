package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class UserService {
    ArrayList<User> usersList = new ArrayList<User>();
    ArrayList<Seller> sellersList = new ArrayList<Seller>();
    ArrayList<Admin> adminsList = new ArrayList<Admin>();
    Admin admin1=new Admin("Arghavan","138316","ar83fadakar@gmail.com");
    public void firstAdmin(){
        adminsList.add(admin1);
    }

    public ArrayList getsellersList() {

        return sellersList;

    }


    public void userSignUp() {
        System.out.println("welcome to user sign in");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String newUserName = input.nextLine();
        System.out.println("Enter your password");
        String newPassword = input.nextLine();
        System.out.println("Enter your emailAddress");
        String newEmailAddress = input.nextLine();
        System.out.println("Enter your phoneNumber");
        String newPhoneNumber = input.nextLine();
        User user = new User(newUserName, newPassword, newEmailAddress, newPhoneNumber);
        for (User user1 : usersList) {
            if (user.getUserName().equals(user1.getUserName())) {
                System.out.println("your intended username is taken please chose another one");
                OptionMenu optionMenu=new OptionMenu();
                optionMenu.UserFirstStep();
                return;
            }
        }
        usersList.add(user);
        System.out.println("********** successful user signUp ***********");
        System.out.println("if  you are a seller type_1 ");
        String sellerCheck = input.nextLine();
        if (sellerCheck.equals("1")) {
            sellerSignUp(newUserName, newPassword, newEmailAddress, newPhoneNumber);
        } else {
            userMenu(user);
        }
    }

    public User userLogin() {
        Scanner usrLoginInput = new Scanner(System.in);
        System.out.println("Enter your username");
        String newUserName = usrLoginInput.nextLine();
        System.out.println("Enter your password");
        String newPassword = usrLoginInput.nextLine();
        for (User user : usersList) {
            if (user.getUserName().equals(newUserName) && user.getPassword().equals(newPassword)) {
                System.out.println("********** successful user login ***********");
                System.out.println("are you a seller?");
                String sellerCheck = usrLoginInput.nextLine();
                switch (sellerCheck) {
                    case "yes":
                        sellerLogin();
                    default:
                        userMenu(user);

                }
            }

        }
        System.out.println("****login failed please try again*****");
        OptionMenu optionMenu=new OptionMenu();
        optionMenu.UserFirstStep();

        return null;
    }

    public boolean sellerSignUp(String newUserName, String newPassword, String newEmailAddress, String newPhoneNumber) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your companyName");
        String newCompanyName = input.nextLine();
        Seller seller = new Seller(newUserName, newPassword, newEmailAddress, newPhoneNumber, newCompanyName);
        sellersList.add(seller);
        System.out.println("seller signed up successfully");
        return true;
    }

    public Seller sellerLogin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your userName");
        String newUserName = input.nextLine();
        System.out.println("Enter your password");
        String newPassword = input.nextLine();
        for (Seller seller1 : sellersList) {
            if (seller1.getUserName().equals(newUserName) && seller1.getPassword().equals(newPassword)) {
                System.out.println("******seller login was successfully*****");
                return seller1;
            }

        }
        System.out.println("****login failed*****");
        return null;
    }

    public boolean adminSignUp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new username");
        String newUserName = input.nextLine();
        System.out.println("Enter new password");
        String newPassword = input.nextLine();
        System.out.println("Enter new emailAddress");
        String newEmailAddress = input.nextLine();
        Admin admin = new Admin(newUserName, newPassword, newEmailAddress);
        for (Admin admin1 : adminsList) {
            if (admin.getUserName().equals(admin1.getUserName())) {
                System.out.println("your intended username is taken please chose another one");
                //user.setUserName(input.nextLine());
                return false;
            }
        }
        adminsList.add(admin);
        System.out.println("********** successful signUp ***********");
        return true;
    }

    public void adminLogin() {
        Scanner input = new Scanner(System.in);
        OptionMenu optionMenu=new OptionMenu();
        System.out.println("Enter your username");
        String newUserName = input.nextLine();
        System.out.println("Enter your password");
        String newPassword = input.nextLine();
        for (Admin admin : adminsList) {
            if (admin.getUserName().equals(newUserName) && admin.getPassword().equals(newPassword)) {
                System.out.println("********** successful admin login ***********");
                adminMenu(admin);
                optionMenu.WelcomeMenu();

            }
        }
        System.out.println("****Admin login failed please try again*****");
        optionMenu.WelcomeMenu();

    }

    public void adminEdit(Admin admin) {
        Scanner input = new Scanner(System.in);

                System.out.println("Type1-change username");
                System.out.println("Type2-change password");
                System.out.println("Type3-change emailAddress");
                String selection = input.nextLine().trim();
                switch (selection) {
                    case "1":
                        System.out.println("enter your new username");
                        String newUserName = input.nextLine();
                        admin.setUserName(newUserName);
                        System.out.println("your username successfully changed to" + admin.getUserName());

                    case "2":
                        System.out.println("enter your new password");
                        admin.setPassword(input.nextLine());
                        System.out.println("your password successfully changed to" + admin.getPassword());

                    case "3":
                        System.out.println("enter your new emailAddress");
                        admin.setEmailAddress(input.nextLine());
                        System.out.println("your emailAddress successfully changed to" + admin.getEmailAddress());
                    default :
                        System.out.println("wrong choice");
                }
                adminMenu(admin);
            }
    public void userEdit(User user) {
        Scanner input=new Scanner(System.in);
                System.out.println("Type1-change username");
                System.out.println("Type2-change password");
                System.out.println("Type3-change emailAddress");
                System.out.println("Type4-change phoneNumber");
                String selection = input.nextLine();
                switch (selection) {
                    case "1":
                        System.out.println("enter your new username");
                        user.setUserName(input.nextLine());
                        System.out.println("your username successfully changed to" + user.getUserName());

                    case "2":
                        System.out.println("enter your new password");
                        user.setPassword(input.nextLine());
                        System.out.println("your password successfully changed to" + user.getPassword());

                    case "3":
                        System.out.println("enter your new emailAddress");
                        user.setEmailAddress(input.nextLine());
                        System.out.println("your emailAddress successfully changed to" + user.getEmailAddress());

                    case "4":
                        System.out.println("enter your new phoneNumber");
                        user.setPhoneNumber(input.nextLine());
                        System.out.println("your emailAddress successfully changed to" + user.getPhoneNumber());
                    default :
                        System.out.println("wrong choice");
                }
        userMenu(user);
        }




    public void sellerEdit(Seller seller) {
        Scanner input=new Scanner(System.in);
        System.out.println("Type1-change username");
        System.out.println("Type2-change password");
        System.out.println("Type3-change emailAddress");
        System.out.println("Type4-change phoneNumber");
        System.out.println("Type5-change companyName");
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                System.out.println("enter your new username");
                seller.setCompanyName(input.next());
                System.out.println("your username successfully changed to" + seller.getCompanyName());

                break;
            case "2":
                System.out.println("enter your new password");
                seller.setPassword(input.nextLine());
                System.out.println("your password successfully changed to" + seller.getPassword());

            case "3":
                System.out.println("enter your new emailAddress");
                seller.setEmailAddress(input.nextLine());
                System.out.println("your emailAddress successfully changed to" + seller.getEmailAddress());

            case "4":
                System.out.println("enter your new phoneNumber");
                seller.setPhoneNumber(input.nextLine());
                System.out.println("your emailAddress successfully changed to" + seller.getPhoneNumber());

            case "5":
                System.out.println("enter your new companyName");
                seller.setCompanyName(input.nextLine());
                System.out.println("your companyName successfully changed to" + seller.getCompanyName());

            default :
                System.out.println("wrong choice");
        }
        for (User user : usersList) {
            if (seller.getUserId().equals(user.getUserId())) {
                user.setUserName(seller.getUserName());
                user.setPassword(seller.getPassword());
                user.setPhoneNumber(seller.getPhoneNumber());
                user.setEmailAddress(seller.getEmailAddress());

                }

            }
        sellerMenu(seller);
        }


    public void userMenu(User user){
        Scanner userMenuInput=new Scanner(System.in);
        System.out.println("welcome to user menu");
        System.out.println("what do ou want to do?");
        System.out.println("Type1-if you want to edit your info");
        System.out.println("Type2-if you want to shop");
        System.out.println("Type3-if you want to exit");
        String choice=userMenuInput.nextLine();
        switch (choice){
            case "1":
                userEdit(user);
            case "2":
                System.out.println("hello");
            case "3":
                System.out.println("goodbye");
                OptionMenu optionMenu=new OptionMenu();
                optionMenu.WelcomeMenu();
        }
    }
    public void sellerMenu(Seller seller){
        System.out.println("welcome to user menu");
        Scanner sellerMenuInput=new Scanner(System.in);
        System.out.println("what do ou want to do?");
        System.out.println("Type1-if you want to edit your info");
        System.out.println("Type2-if you want to add product");
        System.out.println("Type3-if you want to exit");
        String choice=sellerMenuInput.nextLine();
        switch (choice){
            case "1":
                sellerEdit(seller);
            case "2":
                System.out.println("hello");
            case "3":
                System.out.println("goodbye");
                OptionMenu optionMenu=new OptionMenu();
                optionMenu.WelcomeMenu();
        }

    }
    public void adminMenu(Admin admin){
        Scanner adminMenuInput=new Scanner(System.in);
        System.out.println("welcome to user menu");
        System.out.println("what do ou want to do?");
        System.out.println("Type1-if you want to edit your info");
        System.out.println("Type2-if you want to add another admin");
        System.out.println("Type3-if you want to check on activities");
        System.out.println("Type4-if you want to exit");
        String choice=adminMenuInput.nextLine();
        switch (choice){
            case "1":
                adminEdit(admin);
            case "2":
                adminSignUp();
            case "3" :
                System.out.println("hello");
            case "4":
                System.out.println("goodbye");
                OptionMenu optionMenu=new OptionMenu();
                optionMenu.WelcomeMenu();
        }

    }

}









