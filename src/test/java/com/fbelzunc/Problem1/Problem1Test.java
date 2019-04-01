package com.fbelzunc.Problem1;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {

    @Test
    public void testNumWaysDecodedMessage() {
        int[] message = new int[]{1,1,1};
        int numSolution = Problem1.getNumWaysDecodedMessage(message);
        Assert.assertEquals(3 ,numSolution);
    }

    @Test
    public void testNumWaysDecodedMessage2() {
        int[] message = new int[]{1,2,3,4};
        int numSolution = Problem1.getNumWaysDecodedMessage(message);
        Assert.assertEquals(3 ,numSolution);
    }

    @Test
    public void testNumWaysDecodedMessage3() {
        int[] message = new int[]{1};
        int numSolution = Problem1.getNumWaysDecodedMessage(message);
        Assert.assertEquals(1 ,numSolution);
    }

    @Test
    public void testNumWaysDecodedMessage4() {
        int[] message = new int[]{1,5,3};
        int numSolution = Problem1.getNumWaysDecodedMessage(message);
        Assert.assertEquals(2 ,numSolution);
    }

    @Test
    public void testNumWaysDecodedMessage5() {
        int[] message = new int[]{1, 2, 2, 4};
        int numSolution = Problem1.getNumWaysDecodedMessage(message);
        Assert.assertEquals(5 ,numSolution);
    }

    @Test
    public void testNumWaysDecodedMessage6() {
        int[] message = new int[]{1,2,1,3,2,2};
        int numSolution = Problem1.getNumWaysDecodedMessage(message);
        Assert.assertEquals(9 ,numSolution);
    }
}
