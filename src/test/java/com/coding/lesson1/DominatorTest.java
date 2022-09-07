package com.coding.lesson1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DominatorTest {
    Dominator dominator = new Dominator();
    final static int MID_RANGE = 50000;

    @Test
    public void solutionTest1() {
        int[] A = new int[]{5,3,44,5,5};
        assertEquals(0, dominator.solution(A));
    }


    @Test
    public void solutionTest2() {
        int[] A = new int[]{1, 3, 4, 5, 5, 5,5};
        assertNotEquals(0, dominator.solution(A));
    }

    @Test
    public void solutionTest3() {
        int[] A = new int[]{1, 3, 4, 5, 5, 5};
        assertEquals(-1, dominator.solution(A));
    }

    @Test
    public void solutionTest4() {
        int[] A = new int[]{};
        assertEquals(-1, dominator.solution(A));
    }

    @Test
    public void solutionTest5() {
        int[] A = new int[]{1,Integer.MAX_VALUE,Integer.MAX_VALUE};
        assertEquals(1, dominator.solution(A));
    }

    @Test
    public void solutionTest6() {
        int[] A = new int[]{-1,-1,Integer.MIN_VALUE,4,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
        assertEquals(2, dominator.solution(A));
    }

    @Test
    public void solutionTest7() {
        int[] A = new int[100001];

        for(int i=0;i<MID_RANGE;i++){
            A[i] = i;
        }
        for(int i=MID_RANGE;i<100001;i++){
            A[i] = Integer.MIN_VALUE;
        }

        assertEquals(MID_RANGE, dominator.solution(A));
    }
}