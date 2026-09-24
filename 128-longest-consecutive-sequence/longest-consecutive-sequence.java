import java.util.Arrays;

class Solution { 
    public int longestConsecutive(int[] nums) { 
        int max=1; 

        if(nums.length!=0) { 
            Arrays.sort(nums);

            int count=1; 
         
            for(int i=0;i<nums.length-1;i++) { 
                if(nums[i+1]==nums[i]+1) { 
                    count++; 
                } 
                else if(nums[i+1]==nums[i]) { 
                    continue; 
                } 
                else if(nums[i+1]!=nums[i]+1) { 
                    if(count>max) { 
                        max=count; 
                    } 
                    count=1; 
                } 
            } 

            max=Math.max(max,count); 
            return max; 
        } 
 
        return 0; 
    } 
}