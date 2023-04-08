package org.example;
import java.util.UUID;

public  class Category {
    private UUID catid;
    private String name;
    public Category(String name){
        catid = UUID.randomUUID();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return catid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("UUID = " + catid.toString() + " Name = " + name + "\n");
    }

}
