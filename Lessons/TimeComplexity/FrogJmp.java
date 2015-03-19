//https://codility.com/programmers/lessons/

class Solution {
    public int solution(int X, int Y, int D) {
        if(X >= Y) return 0;
        int jumps = (Y-X)/D;
        if((Y-X)%D != 0) jumps++;
        return jumps;
    }
}
