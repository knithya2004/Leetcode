class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return sum(nums,goal)-sum(nums,goal-1);
    }
    int sum(int nums[],int goal)
    {
        if(goal<0)
        {
            return 0;
        }
        int start=0;
        int count=0;
        int sum=0;
        for(int end=0;end<nums.length;end++)
        {
            sum+=nums[end];
            while(sum>goal)
            {
                sum-=nums[start];
                start++;
            }
            count+=end-start+1;
        }
        return count;
    }
}