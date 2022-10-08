package com.testcase;

import org.junit.*;
import org.w3c.dom.ls.LSOutput;

public class Junt4Demo1Test {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after Class");
    }

    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @Test//测试注解，标记一个方法可以作为一个测试用例
    public void fun1(){
        System.out.println("fun1 test1");
    }

    @Test
    public void fun2(){
        System.out.println("fun2 test2");
    }

    @Test
    @Ignore
    public void fun3(){
        System.out.println("fun3 test3");
    }
}
