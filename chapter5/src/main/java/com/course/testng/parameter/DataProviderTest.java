package com.course.testng.parameter;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void dataProviderTest(String name,int age){
        System.out.println("姓名："+name+";年龄："+age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"Molly",6},
        {"Sarah",8},
        {"duck",1}
        };
        return o;
    }
    @Test(dataProvider="methodData")
    public void test1(String name,int age){
        System.out.println("test1:姓名："+name+";年龄："+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2:姓名："+name+";年龄："+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"Molly",60},
                    {"Sarah",100}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"duck",100},
                    {"zebra",3}
            };
        }
        return result;

    }
}
