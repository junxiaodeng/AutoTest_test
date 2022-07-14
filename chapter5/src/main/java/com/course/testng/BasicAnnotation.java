package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //用来将方法标记为测试的一部分
    @Test
    public void testCaseOne(){
        System.out.println("This is testcase1");
    }
    @Test
    public void testCaseTwo(){
        System.out.println("This is testcase2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is running before test method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("This is running after test method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is running before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("This is running after test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is running before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is running after class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is running before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("This is running after siute");
    }
}
