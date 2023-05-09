package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly person = new RWOnly();
        person.setName("Anuj");
        person.setAge(25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}