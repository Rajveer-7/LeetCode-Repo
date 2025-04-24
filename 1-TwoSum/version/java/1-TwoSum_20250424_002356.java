// Last updated: 4/24/2025, 12:23:56 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // We create a hashmap to store numbers and their indices

        Map<Integer, Integer> map = new HashMap<>();

        // iterate through array 
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // Check if complement is in the map 
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i};
                
            }
            // add current number and index to array
            map.put(nums[i], i);
        }
    // Return empty array if no solution is found
        return new int[] {};

    }
}