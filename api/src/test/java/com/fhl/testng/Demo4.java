package com.fhl.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo4 {
    @Test(dependsOnMethods = "test2",alwaysRun = true,description = "这是一条测试")
    public void test1(){
        System.out.println("Demo4 ... test1....");
 //       Assert.assertEquals(false,true);
    }
    @Test
    public void test2(){
        System.out.println("Demo4 ... test2...");
//        Assert.assertEquals(false,true);
    }
    @Test
    public void test3(){
        System.out.println("Demo4 ... test3...");
    }
}
