public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> a = new ArrayList<>();
         int n=nums.length;
         for(int i=0;i< nums.length; i++) nums[(nums[i]-1)%n]+=n;
         for(int i=0;i< nums.length; i++) if(nums[i]<=n) a.add(i+1);
         return a;
    } 
}