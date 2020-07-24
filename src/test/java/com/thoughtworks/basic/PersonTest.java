package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void should_return_introduction_when_introduce_given_name_is_tom_and_age_is_20() {
        //given
        String name = "Tom";
        int age = 20;
        Person person = new Person(name,age);

        //when
        String introduction = person.introduce();

        //then
        Assert.assertEquals(introduction, "My name is Tom. I am 20 years old.");
    }

}
