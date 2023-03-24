package com.fhl.testng;

import org.testng.Assert;
import org.testng.annotations.*;

import javax.swing.plaf.PanelUI;

public class Demo3 {
    @BeforeSuite
    public void f1(){
        System.out.println("@BeforeSuite...");
    }
    @AfterSuite
    public void f2(){
        System.out.println("@AfterSuite...");
    }
    @BeforeTest
    public void f3(){
        System.out.println("@BeforeTest...");
    }
    @AfterTest
    public void f4(){
        System.out.println("@AfterTest...");
    }
    @BeforeClass
    public void f5(){
        System.out.println("@BeforeClass...");
    }
    @AfterClass
    public void f6(){
        System.out.println("@AfterClass...");
    }
    @BeforeMethod
    public void f7(){
        System.out.println("@BeforeMethod...");
    }
    @AfterMethod
    public void f8(){
        System.out.println("@AfterMethod...");
    }
    @Test(dependsOnMethods = "test2",alwaysRun = true,description = "这是一条测试")
    public void test1(){
        System.out.println("Demo3 ... test1....");
 //       Assert.assertEquals(false,true);
    }
    @Test
    public void test2(){
        System.out.println("Demo3 ... test2...");
//        Assert.assertEquals(false,true);
    }
    @Test
    public void test3(){
        System.out.println("Demo3 ... test3...");
    }
}
