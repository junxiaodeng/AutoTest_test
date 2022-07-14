package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test(enabled = false)
    public void testCase1(){
        System.out.println("test case1");
    }
    @Test
    public void testCase2(){
        System.out.println("test case2");

    }
}
