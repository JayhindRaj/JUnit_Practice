package com.jay.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest2 {
    private StringHelper stringHelper = new StringHelper();
    private String input;

    public StringHelperParameterizedTest2(String input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<String> testConditions() {
        return Arrays.asList(new String[]{"AB", "ABAB","JAYHINDJA" });
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_FirstAndLastTwoCharSame() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame(input));
    }
}
