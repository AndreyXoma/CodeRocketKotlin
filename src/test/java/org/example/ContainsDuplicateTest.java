package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author kimetsu - 24.05.2023 - 23:32
 */
public class ContainsDuplicateTest {


    @Test
    public void notContainsDuplicateInIntegerArray() {
        var containsDuplicate = new ContainsDuplicate();
        assertFalse(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void containsDuplicateInIntegerArray() {
        var containsDuplicate = new ContainsDuplicate();
        assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void containsDuplicateInIntegerArray2() {
        var containsDuplicate = new ContainsDuplicate();
        assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 1, 3, 3, 2, 5, 6, 7, 7}));
    }

    @Test
    public void arrayContainsOneDigit() {
        var containsDuplicate = new ContainsDuplicate();
        assertFalse(containsDuplicate.containsDuplicate(new int[]{0}));
    }
}
