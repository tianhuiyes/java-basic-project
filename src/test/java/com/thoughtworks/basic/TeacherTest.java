package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void should_return_introduction_when_introduce_given_name_is_Matt_and_age_is_30_and_job_is_teacher() {
        //given
        String name = "Matt";
        int age = 30;
        String job = "Teacher";
        Teacher teacher = new Teacher(name,age,job);

        //when
        String introduction = teacher.introduce();

        //then
        Assert.assertEquals(introduction, "My name is Matt. I am 30 years old. I am a Teacher.");

    }

}
