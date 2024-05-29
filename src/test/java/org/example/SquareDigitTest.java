package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kimetsu - 11.06.2023 - 22:28
 */
@DisplayName("Square Digit class")
class SquareDigitTest {

    @Test
    @DisplayName("Zero Case")
    void zeroCase() {
        var test = new SquareDigit();
        assertEquals(0, test.digitDigit(0));
    }

    @Test
    @DisplayName("ninetyOneNineteenCase")
    void ninetyOneNineteenCase() {
        var test = new SquareDigit();
        assertEquals(811181, test.digitDigit(9119));
    }


    @Test
    @DisplayName("Four hundred ninety four")
    void fourHundredNinetyFour() {
        var test = new SquareDigit();
        assertEquals(494, test.digitDigit(72));
    }
}