
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    
        
        
    }
    public void reverse(int nums[],int p,int q){

        while(p<q){
            int temp=nums[p];
            nums[p]=nums[q];
            nums[q]=temp;
            p++;
            q--;
        }

        
    }
}
