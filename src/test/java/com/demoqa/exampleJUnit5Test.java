package com.demoqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;

public class exampleJUnit5Test {

    @BeforeAll
    static void configur() {
       System.out.println("this is the @Beforeall");
    }

    @Test
    void firstTest0() {
        Assertions.assertTrue ( 3 > 2);
        System.out.println("this is @test 0");

    }
    @Test
    void firstTest1() {
        System.out.println("this is @test 1");
    }
}
