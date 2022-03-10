class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
		
        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        
		
        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
		
        int j = 0;
        int[] res = new int[result.size()];
        for(int r : result) {
            res[j++] = r;
        }
        return res;
    }
}


