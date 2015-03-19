// https://codility.com/programmers/lessons/2

class Solution {
    public int solution(int[] A) {
        int[] B = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            if(!(A[i] < 1 || A[i] > A.length)) {
                B[A[i]-1]++;   
            }
        }
        for(int j = 0; j < B.length; j++) {
            if(B[j] == 0) return j+1;   
        }
        return A.length+1;
    }
}
