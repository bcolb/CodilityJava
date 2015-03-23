// https://codility.com/programmers/lessons/4

import java.util.Arrays;

/**
 * The correct answer will be either the two most negative numbers multiplied
 * by the largest positive number, or the product of the three largest
 * positive numbers.
 */
class Solution {
    public int solution(int[] A) {
	// Uses Java's built-in quicksort O(nlog(n))
        Arrays.sort(A);
	// get two possible answers
        int poss1 = A[0] * A[1] * A[A.length-1];
        int poss2 = A[A.length-1] * A[A.length-2] * A[A.length-3];
	// return the max of those two answers
        return Math.max(poss1, poss2);
    }
}
