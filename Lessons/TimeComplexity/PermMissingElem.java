// https://codility.com/programmers/lessons/1

class Solution {
    public int solution(int[] A) {
        int expected = 0;
        int actual = 0;
        for(int i = 0; i < A.length; i++) {
            actual += A[i];
            expected += i + 1;
        }
        expected += A.length + 1;
        return expected-actual;
    }
}
