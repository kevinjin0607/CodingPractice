import java.util.*;

public class Solution {
    
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> dict = new HashMap<>();

	    for(int i=0; i<nums.length; i++) {
	        int curr = nums[i];
	        //If can't find the other half in the dict, create new key entry with (expected other val, self idx) 
	        
	        Boolean exist = dict.containsKey(curr);
	        if(exist!=null && exist)
	            return new int[]{dict.get(curr), i};
	            
	        dict.put((target-curr), i);
	    }
	    
	    //if no match found, return empty list
	    throw new IllegalArgumentException("No two sum solution");    
	}
}
