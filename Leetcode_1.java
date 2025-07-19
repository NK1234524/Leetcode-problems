//Boyer-Moore Majority Vote Algorithm 

class Leetcode_1 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int req_num = 0;
        
        for (int num : nums) {
            if (count == 0) {
                req_num = num;
            }
            
            if (num == req_num) {
                count++;
            } 
            else {
                count--;
            }
        }        
        return req_num;
    }
}