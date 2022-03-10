class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] change = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int a = getLivingNeighbours(board, i, j, false);
                if(board[i][j] == 1){
                    if(a < 2 || a > 3){
                        change[i][j] = true;
                    }
                } else {
                    if (a == 3){
                        change[i][j] = true;
                    }
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(change[i][j]){
                    board[i][j] = (board[i][j] == 1) ? 0 : 1;
                }
            }
        }
    }
    
    public int getLivingNeighbours(int[][] board, int i, int j, boolean val){
        if(i < 0 || j < 0 || i == board.length || j == board[i].length){
            return 0;
        }
        
        if(val){
            return board[i][j];
        }
        
        int l = getLivingNeighbours(board, i, j-1, true);
        int r = getLivingNeighbours(board, i, j+1, true);
        int t = getLivingNeighbours(board, i-1, j, true);
        int b = getLivingNeighbours(board, i+1, j, true);
        int tl = getLivingNeighbours(board, i-1, j-1, true);
        int tr = getLivingNeighbours(board, i-1, j+1, true);
        int bl = getLivingNeighbours(board, i+1, j-1, true);
        int br = getLivingNeighbours(board, i+1, j+1, true);
        
        return l + r + t + b + tl + tr + bl + br;
    }
}