package com.junit.testApp.junitTester.tutorialsPoint;
import static org.junit.Assert.assertEquals;


import com.junit.testApp.service.MessageUtil;
import org.junit.Test;

public class TestJunit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        message = "New Word";
        assertEquals(message,messageUtil.printMessage());
    }
}
