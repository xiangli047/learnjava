public int minimumTotal(int[][] triangle) {
        if(triangle == null || triangle.length == 0) return Integer.MAX_VALUE;
        int rows = triangle.length;
        int[] dp = new int[rows];
        
        //put all elements which in the last row of Triangle into the dp
        for(int i = 0; i < rows; i++){
            dp[i] = triangle[rows - 1][i];
        }
        
        for(int i = rows - 2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle[i][j];
            }
        }
        return dp[0];
        
    }
