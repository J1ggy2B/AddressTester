package com.qapackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	public boolean isAlphabetic(String testString) {
		testString = testString.trim();
		      if (testString == null || testString.isEmpty()) {
            return false; 
        }

        return testString.matches("^[a-zA-Z]+$"); // Regular expression checks for upper/lower case chars
    }

	public boolean isNumeric(String testNumber) {
        if (testNumber == null || testNumber.isEmpty()) {
            return false; // Handle null or empty strings 
        }
        return testNumber.matches("^[0-9]+$"); // Regular expression check for only digits 0-9 in testNumber
    }

	public boolean hasIllegalChars(String testString) {
        if (testString == null || testString.isEmpty()) {
            return false; // Consider null or empty strings as valid (no illegal chars)
        }

        return !testString.matches("^[a-zA-Z0-9]+$"); // Regular expression check
    }
    public static boolean isValidUKPostCode(String postcode) {
        if (postcode == null || postcode.trim().isEmpty()) {
            return false;
        }
        // Regular expression for UK postcode format
        Pattern pattern = Pattern.compile("^[A-Z]{1,2}[0-9][A-Z0-9]? ?[0-9][A-Z]{2}$");
        Matcher matcher = pattern.matcher(postcode.toUpperCase());
        return matcher.matches();
    }
}
