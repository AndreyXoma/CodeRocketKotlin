package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author kimetsu - 12.06.2023 - 20:37
 */
@DisplayName("Spin Word")
class ReverseStringTest {

    @Test
    void est() {
        assertEquals("emocleW", new ReverseString().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new ReverseString().spinWords("Hey fellow warriors"));
    }

}