class Solution {
    public int countKDifference(int[] nums, int k) {
        int  n = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        
        int count = 0;
        
        for(int i = 0  ; i < n; i++)
        {
            if(map.containsKey(nums[i] - k))
            {
                count += map.get(nums[i] - k);
            }
        }
        
        return count;
    }
}
