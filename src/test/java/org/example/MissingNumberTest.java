package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author kimetsu - 25.05.2023 - 00:26
 */
class MissingNumberTest {

    @Test
    public void getTwoMissingNumberInArray() {
        var missNumber = new MissingNumber();
        assertEquals(2, missNumber.getMissingNumberInArray(new int[]{3, 0, 1}));
    }

    @Test
    public void getNineMissingNumberInArray() {
        var missNumber = new MissingNumber();
        assertEquals(9, missNumber.getMissingNumberInArray(new int[]{0, 3, 4, 1, 2, 5, 6, 7,8}));
    }

    @Test
    public void getOneMissingNumberInArray() {
        var missNumber = new MissingNumber();
        assertEquals(1, missNumber.getMissingNumberInArray(new int[]{0}));
    }

}