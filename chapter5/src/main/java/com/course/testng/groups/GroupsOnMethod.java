package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("Server-11111111111111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("Server-2222222222222");
    }
    @Test(groups="clint")
    public void test3(){
        System.out.println("Clint-33333333333333333");
    }
    @Test(groups="clint")
    public void test4(){
        System.out.println("Clint-44444444444444");
    }
    @BeforeGroups("server")
    public void beforeServerGroups(){
        System.out.println("before server groups");
    }

    @AfterGroups("server")
    public void afterServerGroups(){
        System.out.println("after server groups");
    }
}
