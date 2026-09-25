import java.util.Arrays;

class Solution { 
    public int majorityElement(int[] nums) { 
        Arrays.sort(nums); 
        int count=1; 
        int max=1; 
        int val=nums[0]; 
        
        for(int i=1;i<nums.length;i++) 
        { 
            if(nums[i]!=nums[i-1]) 
            { 
                count=1; 
            } 
            if(nums[i]==nums[i-1]) 
            { 
                count++; 
            } 
            if(count>max) 
            { 
                val=nums[i]; 
                max=count; 
            } 
        } 
        
        return val; 
    } 
}