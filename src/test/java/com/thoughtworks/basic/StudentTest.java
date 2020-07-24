package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void test() {
        //given

        //when

        //then
    }

    @Test
    public void should_return_introduction_when_introduce_given_name_is_tom_and_age_is_20_and_class_is_2() {
        //given
        String name = "Tom";
        int age = 20;
        int className= 2;
        Student student = new Student(name,age,className);

        //when
        String introduction = student.introduce();

        //then
        Assert.assertEquals(introduction, "My name is Tom. I am 20 years old. I am a Student of Class 2.");
    }
}
