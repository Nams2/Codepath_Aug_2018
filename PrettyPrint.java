PRETTYPRINT
Print concentric rectangular pattern in a 2d matrix. 
Let us show you some examples to clarify what we mean.

Example 1:

Input: A = 4.
Output:

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
Example 2:

Input: A = 3.
Output:

3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 
The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.

You will be given A as an argument to the function you need to implement, and you need to return a 2D array.


public class Solution {
    public int[][] prettyPrint(int A) {
        int len = 2*A-1;
        int[][] result = new int[len][len];
        
        for(int i=0;i<A;i++) {
            for(int j=0;j<A;j++) {
                if(i<=j) {
                    result[i][j] = A-i;
                } else {
                    result[i][j] = A-j;
                }
            }
        }
        
        for(int i=0;i<A;i++) {
            for(int j=len-1;j>=A;j--) {
                result[i][j] = result[i][len-1-j];
            }
        }
        
        
        return result;
        
        
    }
}
