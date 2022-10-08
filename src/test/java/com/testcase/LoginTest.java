package com.testcase;

import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void login(){
        dateMap.put("login","登录成功");
        System.out.println(dateMap.get("longin"));

    }
}
