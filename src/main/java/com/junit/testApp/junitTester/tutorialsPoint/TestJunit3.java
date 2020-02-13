package com.junit.testApp.junitTester.tutorialsPoint;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

import static org.junit.Assert.*;

public class TestJunit3 extends TestResult {
    // add the error
    public synchronized void addError(Test test, Throwable t) {
        super.addError((junit.framework.Test) test, t);
    }

    // add the failure
    public synchronized void addFailure(Test test, AssertionFailedError t) {
        super.addFailure((junit.framework.Test) test, t);
    }

    @Test
    public void testAdd() {
        // add any test
        //test data
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fine", str);

        //check for false condition
        assertFalse(num > 6);

        //check for not null value
        assertNotNull(temp);
    }

    // Marks that the test run should stop.
    public synchronized void stop() {
        //stop the test here
    }
}
