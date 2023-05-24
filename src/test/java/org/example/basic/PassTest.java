package org.example.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassTest {

    @Test
    public void testNormalCondition(){
        assertEquals(9,Pass.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    @Test
    public void testEmptyArray(){
        assertEquals(0,Pass.solveSuperMarketQueue(new int[]{},1));
    }
    @Test
    public void testSingleTillManyCustomers(){
        assertEquals(15,Pass.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
    }

}