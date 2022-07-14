package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 2000)
    public void timeOutTestFail() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Test(timeOut = 3000)
    public void timeOutTest() throws InterruptedException {
        Thread.sleep(2000);
    }

}
