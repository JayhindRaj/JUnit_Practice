package com.jay.junit.helper.suite;

import com.jay.junit.helper.ArrayCompareTest;
import com.jay.junit.helper.ExceptionTest;
import com.jay.junit.helper.PerformanceTest;
import com.jay.junit.helper.QuickBeforeAfterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ExceptionTest.class, ArrayCompareTest.class, PerformanceTest.class, QuickBeforeAfterTest.class})
public class TestSuite2 {
}
