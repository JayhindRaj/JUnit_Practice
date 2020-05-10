package com.jay.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
    private StringHelper stringHelper = new StringHelper();
    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        return Arrays.asList(new String[][]{
                {"AACD", "CD"},
                {"ACD", "CD"},
                {"CDEF", "CDEF"},
                {"BACD", "BCD"}
        });
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Postions() {
        assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
    }
}
