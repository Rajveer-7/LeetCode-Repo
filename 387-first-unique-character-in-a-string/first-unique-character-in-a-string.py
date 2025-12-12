class Solution:
    def firstUniqChar(self, s: str) -> int:
        # Map the character to its count 
        #L-> 1, e->3, t->1 , - Hashmap , iterate over string  O(n) , then we return the index of the character 
        #We make a Hashmap ,

        count = defaultdict(int) # char -> count

        for c in s:
            count[c] += 1

        for i,c in enumerate(s):
            if count[c] ==1:
                return i
        return -1