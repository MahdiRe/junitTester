package com.junit.testApp.junitTester.springboottutorial;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Test
    public void sum_withThreeNumbers(){
        System.out.println("Test1");
        assertEquals(6, myMath.sum(new int[]{1,2,3}));
    }

    @Test
    public void sum_withOneNumber(){
        System.out.println("Test2");
        assertEquals(3, myMath.sum(new int[]{3}));
    }

    @Before
    public void before(){
        System.out.println("Before");
    }

    @After
    public void after(){
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static














    void afterClass(){
        System.out.println("After Class");
    }

}
