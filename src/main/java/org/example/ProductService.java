package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    ArrayList<Product>productList=new ArrayList<Product>();
    public void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your product name");
        String newProductName = input.nextLine();
        System.out.println("Enter your product price");
        int newPrice = input.nextInt();
        System.out.println("Enter your product quantity");
        int newQuantity = input.nextInt();
        System.out.println("Enter your company name");
        String newCompany = input.nextLine();
        Product product = new Product(newProductName, newPrice, newQuantity,newCompany);
        productList.add(product);
        sellersProduct(product);

    }
    public void sellersProduct(Product product){
        UserService userService=new UserService();
        ArrayList<Seller> sellersList = userService.getsellersList();
        for (Seller seller1:sellersList){
            if(product.getSellerName().equals(seller1.getUserName())){

            }
        }

    }
}
