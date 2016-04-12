public int minSubArrayLen(int s, int[] nums) {
        if(nums.length <1) return 0;
        int len = nums.length, rst = len+1, start = 0, end = 0, sum = 0;
        
        while(end <len){
            sum += nums[end];
            
            while(sum>=s){
                rst = Math.min(rst, end-start+1);
                sum -= nums[start++];
            }
            
            end++;
        }
        
        return rst == len+1 ? 0 : rst;
    }
