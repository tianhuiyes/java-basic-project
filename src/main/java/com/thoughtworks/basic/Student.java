package com.thoughtworks.basic;

public class Student extends Person{
    private int className;

    public Student(String name, int age, int className) {
        super(name,age);
        this.className = className;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student of Class " + className + ".";
    }
}
