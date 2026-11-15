//  Leetcode 26
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        int k=1;
        while(i<j&& j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
                k++;
            }
            j++;
        }
        return k;
        
    }
}
