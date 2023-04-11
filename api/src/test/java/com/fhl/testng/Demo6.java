package com.fhl.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo6 {
    @Test(dataProvider = "datas")
    public void test1(String fn,String ln){
        System.out.println("Demo6 ... test...");
        System.out.println(fn+"."+ln);
    }
    @DataProvider(name = "datas")
    public Object[][] datas(){
        Object[][] datas ={
                {"尼古拉斯","赵四"},
                {"尼古拉斯","翠花"},
        };
        return datas;
    }
}
