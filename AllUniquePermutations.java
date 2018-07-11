All Unique Permutations
Given a collection of numbers that might contain duplicates, return all possible unique permutations.

Example :
[1,1,2] have the following unique permutations:

[1,1,2]
[1,2,1]
[2,1,1]
 NOTE : No 2 entries in the permutation sequence should be the same. 


 public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        
        for(int i=0;i<A.size();i++) {
            Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
            for(ArrayList<Integer> l : result) {
                for(int j=0 ;j < (l.size()+1); j++) {
                    l.add(j, A.get(i));
                    ArrayList<Integer> t = new ArrayList<>(l);
                    l.remove(j);
                    set.add(t);
                }
            }
            result = new ArrayList<>(set);
        }
        
        return result;
    }
}
