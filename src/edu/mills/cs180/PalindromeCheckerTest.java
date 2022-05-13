package edu.mills.cs180;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class PalindromeCheckerTest {

    @Test
    public void isPalindrome_True_EmptyString() {
        String s = "";
        assertEquals(s, PalindromeChecker.isPalindrome(s));
    }

}
