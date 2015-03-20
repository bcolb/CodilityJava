/**
 * https://codility.com/programmers/lessons/3
 * This one is a pain in the ass.
 * 
 * The solution below uses a combination of prefix sums and counting
 * to get it done in O(N + M)
 **/
class Solution {
    
    public int[] solution(String S, int[] P, int[] Q) {
        // use a 2D array to store counts of nucleotides in the sequence
        int[][] impact = new int[S.length()][4];
        
        // first row
        if(S.charAt(0)=='A') {
            impact[0][0] = 1;
        } else if(S.charAt(0)=='C') {
            impact[0][1] = 1;   
        } else if(S.charAt(0)=='G') {
            impact[0][2] = 1;   
        } else {
            impact[0][3] = 1;
        }
        
        // all other rows
        for(int i = 1; i < S.length(); i++) {
            impact[i][0] = impact[i-1][0];
            impact[i][1] = impact[i-1][1];
            impact[i][2] = impact[i-1][2];
            impact[i][3] = impact[i-1][3];
            int num = 4;
            if(S.charAt(i)=='A') {
                num = 1;
            } else if(S.charAt(i)=='C') {
                num = 2;
            } else if(S.charAt(i)=='G') {
                num = 3;
            }
            impact[i][num-1]++;
        }
        
        // to store results in
        int[] results = new int[P.length];
                
        for(int i = 0; i < P.length; i++) {
            int start = P[i];
            int end = Q[i];
            // Special case
            if(start == 0) {
                if(impact[end][0] >  0) {
                    results[i] = 1;
                } else if(impact[end][1] > 0) {
                    results[i] = 2;
                } else if(impact[end][2] > 0) {
                    results[i] = 3;
                } else {
                    results[i] = 4;
                }
            } else {
		// Check if there is a 1 in the range, 2, ...
                if(impact[end][0]-impact[start-1][0] > 0) {
                    results[i]=1;
                } else if (impact[end][1]-impact[start-1][1] > 0) {
                    results[i]=2;   
                } else if (impact[end][2]-impact[start-1][2] > 0) {
                    results[i]=3;   
                } else {
                    results[i]=4;   
                }
            }
        }
        return results;
    }
}
