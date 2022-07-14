package com.course.testng;

import org.testng.annotations.Test;

import java.util.concurrent.ExecutionException;

public class ExceptException {

    @Test(expectedExceptions = RuntimeException.class )
    public void runTimeExceptionFail(){
        System.out.println("failure");
    }

    @Test(expectedExceptions = RuntimeException.class )
    public void runExceptionException(){
        System.out.println("success");
        throw new RuntimeException();
    }
}
