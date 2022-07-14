package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups="student")
public class GroupsOnClass2 {
    public void student(){
        System.out.println("Class2 student");
    }
}
