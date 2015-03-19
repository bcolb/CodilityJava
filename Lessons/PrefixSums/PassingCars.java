// https://codility.com/programmers/lessons/3

/**
 * Passing Cars problem solved using prefix sums.
 */
class Solution {
    public int solution(int[] A) {
        if(A.length <= 1) return 0;
        int[] pref = new int[A.length];
        pref[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            if(A[i] == 1) {
                pref[i] += pref[i-1] + 1;   
            } else {
                pref[i] += pref[i-1];
            }
        }
        int count = 0;
        for(int j = 0; j < pref.length; j++) {
            if(A[j] == 0) {
                count += pref[A.length-1] - pref[j];   
                if(count > 1000000000) return -1;
            }
        }
        return count;
    }
}
