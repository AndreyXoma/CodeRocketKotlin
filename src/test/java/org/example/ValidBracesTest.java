package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author kimetsu - 28.06.2023 - 23:28
 */
class ValidBracesTest {

    @Test
    void isValid() {
        var braces = new ValidBraces();

        assertTrue(braces.isValid("(){}[]"));
        assertTrue(braces.isValid("([{}])"));
        assertFalse(braces.isValid("(}"));
        assertFalse(braces.isValid("[(])"));
        assertFalse(braces.isValid("[({})](]"));
    }
}