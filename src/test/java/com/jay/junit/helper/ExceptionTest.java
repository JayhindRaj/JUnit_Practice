package com.jay.junit.helper;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ExceptionTest {

    @Test(expected = NullPointerException.class)
    public void testException_Occured() {
        int[] numbers = null;
        int[] expected = {1, 4, 3, 12};

        Arrays.sort(numbers);
//        Assert.assertArrayEquals(expected, numbers);
    }

//    @Test(expected = NullPointerException.class)
//    public void testException_NotOccured() {
//        int[] numbers = {};
//        int[] expected = {1, 4, 3, 12};
//
//        Arrays.sort(numbers);
////        Assert.assertArrayEquals(expected, numbers);
//    }
}
