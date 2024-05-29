package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author kimetsu - 31.05.2023 - 22:52
 */
class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    @Test
    public void firstCase() {
        var test = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, test.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 6}));
    }

    @Test
    public void secondCase() {
        var test = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        assertArrayEquals(new int[]{0, 0, 0, 0}, test.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7}));
    }

}