// https://codility.com/programmers/lessons/2

class Solution {
    
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];
        int currmax = 0;
        int lastmax = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] == N+1) {
              lastmax = currmax;
            } else {
              if(counters[A[i]-1] < lastmax) counters[A[i]-1] = lastmax;
              counters[A[i]-1]++;
              currmax = Math.max(counters[A[i]-1], currmax);
            }
        }
        for(int i = 0; i < counters.length; i++) {
           if(counters[i] < lastmax) counters[i] = lastmax;   
        }
        return counters;
    }
}
