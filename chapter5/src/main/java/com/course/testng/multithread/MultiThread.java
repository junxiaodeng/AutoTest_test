package com.course.testng.multithread;

import org.testng.annotations.Test;

public class MultiThread {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void multiThreadTest(){
        System.out.println(1);
        System.out.printf("Thread ID: %s%n",Thread.currentThread().getId());
    }
}
