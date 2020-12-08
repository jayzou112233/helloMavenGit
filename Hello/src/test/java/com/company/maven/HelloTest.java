package com.company.maven;


import org.junit.Test;

/**
 * @author jayzou
 * @create 2020-12-08 11:14
 */
public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }
}
