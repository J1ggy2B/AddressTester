package com.qapackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach; 
 
public class UtilsTest { 
	private Utils myUtils;
    @BeforeEach 
    public  void setUp() { 
          myUtils = new Utils();
      } 
 
    @Test 
    void testIsAlphabetic() { 
        assertTrue(myUtils.isAlphabetic("abc")); 
        assertFalse(myUtils.isAlphabetic("abc123")); 
        assertFalse(myUtils.isAlphabetic("123")); 
    } 
 
    @Test 
    void testIsNumeric() { 
        assertTrue(myUtils.isNumeric("123")); 
        assertFalse(myUtils.isNumeric("abc")); 
        assertFalse(myUtils.isNumeric("abc123")); 
    } 
 
    @Test 
    void testHasIllegalChars() { 
        assertTrue(myUtils.hasIllegalChars("abc@123")); 
        assertFalse(myUtils.hasIllegalChars("abc123")); 
    } 
    public void tearDown() { 
        myUtils = null;
    } 
}
