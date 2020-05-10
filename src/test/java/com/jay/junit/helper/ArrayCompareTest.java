package com.jay.junit.helper;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayCompareTest {

    @Test
    public void testArrayComparison_Success() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};

        Arrays.sort(numbers);
        Assert.assertArrayEquals(expected, numbers);
    }

//    @Test
//    public void testArrayComparison_Failed() {
//        int[] numbers = {12, 3, 4, 1};
//        int[] expected = {1, 4, 3, 12};
//
//        Arrays.sort(numbers);
//        Assert.assertArrayEquals(expected, numbers);
//    }
}
