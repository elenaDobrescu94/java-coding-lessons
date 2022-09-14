package com.coding.lesson1;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 *  @An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.
 *
 * For example, consider array A such that
 *
 *  A[0] = 3    A[1] = 4    A[2] =  3
 *  A[3] = 2    A[4] = 3    A[5] = -1
 *  A[6] = 3    A[7] = 3
 * The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
 *
 * Write a function
 *
 public int solution(int[] A);
 *
 * that, given an array A consisting of N integers, returns index of the FIRST element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.
 *
 * For example, given array A such that
 *
 *  A[0] = 3    A[1] = 4    A[2] =  3
 *  A[3] = 2    A[4] = 3    A[5] = -1
 *  A[6] = 3    A[7] = 3
 * the function should return 0
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].     }
 */

public class Dominator {

    public int solution(int[] A){

      if (A.length == 1) {
        return 0;
      }

      Map<Integer, Integer> occurrences = new HashMap<>();
      int dominator = Integer.MIN_VALUE;
      for (int i = 0; i < A.length; i++) {
        if (occurrences.containsKey(A[i]) && occurrences.get(A[i]) + 1 > A.length / 2) {
          dominator = A[i];
          break;
        }
        occurrences.put(A[i], occurrences.getOrDefault(A[i], 0) + 1);
      }

      int length = A.length;
      int finalDominator = dominator;
      return IntStream.range(0, length)
          .filter(i -> finalDominator == A[i])
          .findFirst() // first occurrence
          .orElse(-1); // No element found

    }


}
