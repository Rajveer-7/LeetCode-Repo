class Solution {
    public boolean isAnagram(String s, String t) {
        // checking the lengths of arrays , if they are diff , they cant be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Creating an array to count character frequencies
        int [] charCounts = new int[26];

        // Incrementing count for each character in 's' and decrement for each in 't'
        for (int i=0; i< s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        // check if all cunts are zero
        for (int count: charCounts){
            if (count !=0) {
                return false;

            }
        }

        return true;
    }

}