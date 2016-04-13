//Jump Game
DP
public boolean canJump(int[] A) {
        if(A == null || A.length == 0) return true;
        boolean[] dp = new boolean[A.length];
        dp[0] = true;
        for(int i = 1; i < A.length; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && j + A[j] >= i){
                    dp[i] = true;
                }
            }
        }
        
        return dp[A.length - 1];
    }
    
//greedy
public boolean canJump(int[] A) {
        if(A == null || A.length == 0) return true;
        int maxCover = 0;
        for(int i = 0; i <= maxCover && i < A.length; i++){
            if(i + A[i] > maxCover){
                maxCover = i + A[i];
            }
            if(maxCover >= A.length - 1){
                return true;
            }
        }
        
        return false;
    }
