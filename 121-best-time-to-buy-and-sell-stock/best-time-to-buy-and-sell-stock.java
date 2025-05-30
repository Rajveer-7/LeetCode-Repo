class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit =0;

        for (int i=0; i<prices.length;i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

// You compare the current profit (best so far) with the new possible profit (prices[i] - min) and keep the higher one.
            profit = Math.max(profit, prices[i] - min );
        }

        return profit;
    }
}