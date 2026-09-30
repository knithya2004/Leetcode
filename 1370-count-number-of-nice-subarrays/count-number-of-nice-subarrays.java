class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return Atmost(nums,k)-Atmost(nums,k-1);
    }
    int Atmost(int[] nums,int k){
        int left=0;
        int odd=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[left]%2!=0){
                    odd--;
                }
                left++;
            }
            sum+=right-left+1;
        }
        return sum;
    }
}