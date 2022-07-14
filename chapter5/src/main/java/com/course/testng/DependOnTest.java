package com.course.testng;

import org.testng.annotations.Test;

public class DependOnTest {
    @Test
    public void test1(){
        System.out.println("test1 is running");

    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 is running");
    }
}
