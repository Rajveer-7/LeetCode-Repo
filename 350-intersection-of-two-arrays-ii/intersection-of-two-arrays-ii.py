class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        ## two pointer solution 
        nums1, nums2 = sorted(nums1), sorted(nums2)
        p1 = p2 = 0
        n, m = len(nums1), len(nums2)
        ans = []

        while p1 < n and p2<m:
            if nums1[p1] == nums2[p2]:
                ans.append(nums1[p1])
                p1+=1
                p2+=1
                continue
            
            if nums1[p1] > nums2[p2]:
                p2 += 1
            else:
                p1 += 1

        return ans