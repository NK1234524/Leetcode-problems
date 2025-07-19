public class Leetcode_3 {
    //Kadens Algo
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
    //Brute force
    public static void Ap(int num[]){
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
        for(int i =0 ; i<num.length ; i++){
            int start  = i;
            for(int j =i ; j<num.length ; j++){
                int end = j;
                for(int k=start ; k<=end ; k++){
                    currsum = currsum+num[k];
              }
               if(currsum>maxsum){
                    maxsum = currsum;
                }
               
            }
        } 
    }
}