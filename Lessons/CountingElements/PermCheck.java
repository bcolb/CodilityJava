// https://codility.com/programmers/lessons/2

class Solution {
    public int solution(int[] A) {
        int[] B = new int[A.length];
        for(int i = 0; i < A.length; i++) {
          if(A[i] > A.length) return 0;
          B[A[i] - 1]++;
        }
        for(int j = 0; j < B.length; j++) {
          if(B[j] != 1) return 0;   
        }
        return 1;
    }
}
