package com.example.demo2.model;

public class Circle {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setString(String someString) {
        System.out.println("Circle::setString() was called with: " + someString);
        return someString + " hehehehe";
    }

}