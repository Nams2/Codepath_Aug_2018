NUMRANGE
Given an array of non negative integers A, and a range (B, C), 
find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C

Continuous subsequence is defined as all the numbers A[i], A[i + 1], .... A[j]
where 0 <= i <= j < size(A)

Example :

A : [10, 5, 1, 0, 2]
(B, C) : (6, 8)
ans = 3 
as [5, 1], [5, 1, 0], [5, 1, 0, 2] are the only 3 continuous subsequence with their sum in the range [6, 8]


public class Solution {
    public int numRange(int[] A, int B, int C) {
        int count=0;
        for(int i=0;i<A.length;i++) {
            int max=A[i];
            for(int j=i+1;j<A.length;j++) {
                max = max+A[j];
                if(max >= B && max<=C) {
                    count++;
                } else if(max>C){
                    break;
                }
            }
        }
        
        return count;
    }
}
