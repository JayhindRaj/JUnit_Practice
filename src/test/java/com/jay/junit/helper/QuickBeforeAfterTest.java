package com.jay.junit.helper;

import org.junit.*;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass Test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass Test");
    }

    @Before
    public void setup() {
        System.out.println("Before Test");
    }

    @Test
    public void test1() {
        System.out.println("test1 executed");
    }

    @Test
    public void test2() {
        System.out.println("test2 executed");
    }

    @After
    public void teardown() {
        System.out.println("After test executed");
    }
}
