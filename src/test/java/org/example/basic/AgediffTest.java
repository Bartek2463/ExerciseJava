package org.example.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgediffTest {

    @Test
    public void testAge(){
        assertEquals("You are 4 years old.", Pass.calculateAge(2012, 2016));
        assertEquals("You are 27 years old.", Pass.calculateAge(1989, 2016));
        assertEquals("You are 90 years old.", Pass.calculateAge(2000, 2090));
        assertEquals("You will be born in 10 years.", Pass.calculateAge(2000, 1990));
        assertEquals("You were born this very year!", Pass.calculateAge(3400, 3400));
        assertEquals("You are 2000 years old.", Pass.calculateAge(900, 2900));
        assertEquals("You will be born in 110 years.", Pass.calculateAge(2010, 1900));
        assertEquals("You will be born in 510 years.", Pass.calculateAge(2010, 1500));
        assertEquals("You are 1 year old.", Pass.calculateAge(2011, 2012));
        assertEquals("You will be born in 1 year.", Pass.calculateAge(2000, 1999));

    }

}