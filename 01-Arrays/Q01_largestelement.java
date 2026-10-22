class Solution {
    public static int largest(int[] arr) {
        // code here
        int larg=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                larg=arr[i];
            }
        }
        return larg;
    }
}

