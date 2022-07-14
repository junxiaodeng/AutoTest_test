package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass1 {
    public void student(){
        System.out.println("Class1 student");
    }
}
