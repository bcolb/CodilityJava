// https://codility.com/programmers/lessons/2

class Solution {
    public int solution(int X, int[] A) {
        if(X <= 0) return 0;
        int[] leaves = new int[X];
        int total = X;
        for(int i = 0; i < A.length; i++) {
            if(leaves[A[i]-1] == 0) {
                leaves[A[i]-1]++;
                total--;
            }
            if(total <= 0) return i;   
        }
        return -1;
    }
}
