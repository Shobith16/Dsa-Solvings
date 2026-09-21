class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> duplist = new ArrayList<Integer>();
        //int length = nums.length;
        for(int i=0;i<nums.length;i++){
            if(duplist.size()>0 && duplist.contains(nums[i])){
                return true;
            }
            duplist.add(nums[i]);
            
        }
        return false;
        
    }
}