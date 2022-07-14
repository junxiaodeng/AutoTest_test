package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This beforesuite is running");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This aftersuite is running");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("This is running before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("This is running after test");
    }

}
