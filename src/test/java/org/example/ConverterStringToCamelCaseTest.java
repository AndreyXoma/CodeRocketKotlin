package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author kimetsu - 08.06.2023 - 23:17
 */
@DisplayName("Convert String to CamelCase")
class ConverterStringToCamelCaseTest {

    @Test
    void testSomeUderscore() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", ConverterStringToCamelCase.convertToCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", ConverterStringToCamelCase.convertToCamelCase(input));
    }

    @Test
    public void test1() {
        String input = "The_Stealth-Warrior";
        System.out.println("input: " + input);
        assertEquals("TheStealthWarrior", ConverterStringToCamelCase.convertToCamelCase(input));
    }

}