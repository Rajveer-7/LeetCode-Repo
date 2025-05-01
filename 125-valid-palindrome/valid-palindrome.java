class Solution {
    public boolean isPalindrome(String s) {
        
        // Initialize two pointers: one at the start, one at the end
        int left = 0;
        int right = s.length() - 1;

        // Keep moving inward while the pointers haven't crossed
        while (left < right) {

            // Skip any non-alphanumeric character from the left side
            if (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue; // Go to the next loop iteration without comparing
            }

            // Skip any non-alphanumeric character from the right side
            if (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue; // Go to the next loop iteration without comparing
            }

            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // Characters don't match → not a palindrome
            }

            // Move both pointers inward
            left++;
            right--;
        }

        // All valid characters matched → it's a palindrome
        return true;
    }
}
