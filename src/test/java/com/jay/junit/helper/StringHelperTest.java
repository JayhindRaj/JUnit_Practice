package com.jay.junit.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {
    private StringHelper stringHelper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Postions() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirstPostion() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_NoAinString() {
        assertEquals("CDEF", stringHelper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testTruncateAInFirst2Positions_NoAinFirstTwoPositions() {
        assertEquals("CDAA", stringHelper.truncateAInFirst2Positions("CDAA"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_StringLengthIs2() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_StringLengthIsOne() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_FirstAndLastTwoCharSame() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_FirstAndLastTwoCharNotSame() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }
}
