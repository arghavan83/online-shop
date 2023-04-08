package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CategoryService {
    List<Category> categories = new ArrayList<Category>();
    List<SubCategory> subCategories = new ArrayList<SubCategory>();
    public void initialize(){
//        categories.add(new Category("electronic"));
//        categories.add(new Category("home"));
//        categories.add(new Category("beauty"));
//        categories.add(new Category("health"));
//        categories.add(new Category("food"));
//        categories.add(new Category("kids"));
//        categories.add(new Category("sport"));
//        categories.add(new Category("pet"));
//        categories.add(new Category("school"));

        var bookCat = new Category("book");
        categories.add( bookCat );
        subCategories.add( new SubCategory( "Roman" , bookCat ) );
        subCategories.add( new SubCategory( "History" , bookCat ) );

        var electronicsCat = new Category("electronics");
        categories.add( electronicsCat );
        subCategories.add( new SubCategory( "Phone" , electronicsCat ) );
        subCategories.add( new SubCategory( "HeadSet" , electronicsCat ) );
    }

    public List<Category> getAll(){
        return categories;
    }
    public void printAll(){
        for( var category : categories) {
            category.print();
            for( SubCategory sub : subCategories ){
                if( sub.getCategory().getId() == category.getId())
                    sub.print();
            }
        }
    }

}
