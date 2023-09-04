package org.saade;


import org.testng.annotations.Test;

public class TestCases {
    @Test(priority = 2) //
    void setup (){
        System.out.println("I am inside setup");
    }
    @Test(priority = 3)
    void testSteps(){
        System.out.println("I am inside testSteps");
    }
    @Test(priority = 1)
    void tearDown(){
        System.out.println("I am inside tearDown");
    }
}
