/**
 * Distinct.java
 *
 * https://codility.com/programmers/lessons/4
 */
import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        if(A.length <= 0) return 0;
        if(A.length == 1) return 1;
        // A bit of a cop-out, using Java's built in Quicksort
        Arrays.sort(A);
        int count = 1;
        int lastValue = A[0];
        for(int i = 1; i < A.length; i++) {
            if(A[i] != lastValue) {
                count++;   
            }
            lastValue = A[i];
        }
        return count;
    }
}
