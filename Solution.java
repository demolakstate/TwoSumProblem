import java.util.HashMap;
import java.util.Map;
class Solution {

 public static void main(String[] args) {

 // create an object of the class Solution
	Solution s = new Solution();
        int[] s2 = s.twoSum(new int[]{2, 7, 11, 15}, 26);
	
 	// iterate through array
       for (int i = 0; i < s2.length; i++) {
	System.out.println(s2[i]);
	}


} // end main method

    public int[] twoSum(int[] nums, int target) {
             // build the hashmap
 
            boolean stopper = false; // check when solution is found
            int[] no_solution = {};
	    Map<Integer,Integer> map = new HashMap<>(); // create HashMap object
            for (int i = 0; i < nums.length; i++){
		
		map.put(nums[i], i);  // key-value pair corresponds to value and index

		} // end for loop
		
		// now iterate through the array elements again to get the pair

		// for (int i = 0; i < nums.length; i++) {

		int i = 0; 

		while (!stopper && (i < nums.length) ) {
		
		int remainder = target - nums[i];
		if (map.containsKey(remainder) && map.get(remainder) != i) {
		stopper = true; // terminate loop
		
		return new int[] {i, map.get(remainder)}; // return solution

		} // end if

		i++;

		} // end while loop
		
		return no_solution;
        
 }
} // end class Solution
