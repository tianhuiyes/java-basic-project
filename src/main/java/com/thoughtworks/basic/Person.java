package com.thoughtworks.basic;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
}
