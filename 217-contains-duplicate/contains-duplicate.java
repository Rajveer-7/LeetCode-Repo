class Solution {
    public boolean containsDuplicate(int[] nums) {
        

 // Create a hashset to store the elements from the array 

        HashSet<Integer> seenNumbers = new HashSet<>();

        // iterating 
        for(int num: nums) {
            
            if(seenNumbers.contains(num)) {
                return true;
            }

            seenNumbers.add(num);
        }
        return false; // No duplicates found
    }
}
