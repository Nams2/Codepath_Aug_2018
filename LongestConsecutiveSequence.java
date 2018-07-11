Longest Consecutive Sequence
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Example: 
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.



public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        int maxCount = 0;
        Set<Integer> set = new HashSet<>();
        for(int x : A) {
            set.add(x);
        }
        
        for(int x: A) {
            int count=0;
            int prev = x-1;
            int next = x+1;
            
            if(set.contains(x)) {
                count++;
                while(set.contains(prev)) {
                    count++;
                    set.remove(prev);
                    prev--;
                }
                
                while(set.contains(next)) {
                    count++;
                    set.remove(next);
                    next++;
                }
                
                if(count>maxCount) {
                    maxCount = count;
                }

            }
        }
        
        return maxCount;
    }
}
