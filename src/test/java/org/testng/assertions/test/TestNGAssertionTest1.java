package org.testng.assertions.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionTest1 {


    @Test
    public void testAssertEquals() {
        String actualValue = "Hello TestNG";
        Assert.assertEquals(actualValue,"Hello TestNG", "Failed - String Mismatch");
        System.out.println("passing 1");
    }

    @Test
    public void testAsserNotEquals() {
        String actualValue = "Hello TestNG";
        Assert.assertNotEquals(actualValue,"Hello TestNG", "Failed - No mismatch found");
        System.out.println("failing 1 after pass 1");
    }

    @Test
    public void testAssertTrue() {
        boolean actualValue = false;
        Assert.assertTrue(actualValue, "Boolean Actual Value is False");
    }

    @Test
    public void testAssertFalse() {
        boolean actualValue = false;
        Assert.assertFalse(actualValue, "Failed - Boolean Matches");
    }



}
