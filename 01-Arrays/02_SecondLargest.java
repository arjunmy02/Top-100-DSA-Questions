class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        int larg=-1;
        int slarg=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>larg){
                slarg=larg;
                larg=arr[i];
                
            }
            else if(arr[i]<larg && arr[i]>slarg){
                slarg=arr[i];
            }
        }
        return slarg;
        
    }
}
