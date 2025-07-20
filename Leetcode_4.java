class Leetcode_4 {
    public int maxProfit(int[] prices) {
        int maxprofit = 0 ;
        int buyprice = Integer.MAX_VALUE;
        for(int i = 0 ; i<prices.length ; i++ ){
            if(buyprice<prices[i]){
                int profit  = prices[i]-buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }
            else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
}