class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int d=0;
        for(int i=0;i<n;i++){
            d+=nums[i]*i;
        }
        int sol=d;
        for(int i=n-1;i>=0;i--){
            d+=sum-n*nums[i];
            sol=Math.max(sol,d);
        }
        return sol;
    }
}
