package com.jay.junit.helper.suite;

import com.jay.junit.helper.StringHelperParameterizedTest;
import com.jay.junit.helper.StringHelperParameterizedTest2;
import com.jay.junit.helper.StringHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({StringHelperTest.class, StringHelperParameterizedTest.class, StringHelperParameterizedTest2.class})
public class StringHelperTestSuite {
}