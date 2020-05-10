package com.jay.junit.helper;

import org.junit.Test;

import java.util.Arrays;

public class PerformanceTest {

    @Test(timeout = 250)
    public void testPerformanceOfArraySorting() {
        int[] expected = {1, 4, 3, 12};
        for (int i = 1; i < 10000000; i++) {
            expected[0] = i;
            Arrays.sort(expected);
        }
    }
}
