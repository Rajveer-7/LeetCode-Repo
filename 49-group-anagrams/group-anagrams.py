from typing import List
from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        """
        Groups words that are anagrams of each other.

        Idea:
        - For each string, build a fixed-size frequency array of length 26,
          where each index represents a letter from 'a' to 'z'.
        - Use the frequency array (as a tuple) as a key in a hashmap.
        - All strings that share the same frequency key are anagrams.
        """

        # Map: character count signature -> list of anagrams
        groups = defaultdict(list)

        for s in strs:
            # Character frequency for this string (only lowercase a-z)
            count = [0] * 26

            # Build frequency count for current string
            for c in s:
                # Map 'a'..'z' to 0..25 using ASCII values
                count[ord(c) - ord('a')] += 1

            # Use the frequency tuple as a hashable key
            key = tuple(count)
            groups[key].append(s)

        # We only need the grouped anagrams (values of the dictionary)
        return list(groups.values())
