// https://codility.com/programmers/lessons/3

class Solution {
    public int solution(int[] A) {
        
        if(A.length <= 1) return 0;
        double lowestAvg = (A[0]+ (double) A[1])/2;
        int index = 0;
        
        for(int i = 0; i < A.length-2; i++) {
            double two = A[i] + A[i+1];
            double currAvg = Math.min((two/2), ((two+A[i+2])/3));
            if(currAvg < lowestAvg) {
                lowestAvg = currAvg;
                index = i;
            }
        }
        int lastAvg = (A[A.length-1] + A[A.length-2]) / 2;
        if(lastAvg < lowestAvg) index = A.length-2;
        return index;
    }
}
