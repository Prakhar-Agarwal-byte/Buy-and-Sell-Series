// Method 1
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        if (A.length == 0) return 0;
        int profit = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i-1]) {
                profit += A[i]-A[i-1];
            }
        }
        return profit;
    }
}

// Method 2

class Solution {
  public int maxProfit(int[] prices) {
    int buy = prices[0], profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > buy) {
        profit += prices[i] - buy;
      }
      buy = prices[i];  
    }
    return profit;
  }
}
