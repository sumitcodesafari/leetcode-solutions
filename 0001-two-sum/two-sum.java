class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int num : nums){
            int complete = target - num;
            if(map.containsKey(complete)){
                return new int[]{map.get(complete), index};
            }
            map.put(num, index);
            index++;
        }
        return null;
    }
}