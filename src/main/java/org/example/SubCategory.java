package org.example;
import java.util.UUID;

public class SubCategory {
    private UUID subCatid;
    private String name;
    private Category category;
    public SubCategory(String name,Category category){
        this.subCatid=UUID.randomUUID();
        this.name=name;
        this.category=category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public UUID getId() {
        return subCatid;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public void print() {
        System.out.println(" subcategory : UUID = " + subCatid + " Name = " + name + "\n");
    }
}
