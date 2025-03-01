package terminal;

public class tictectoe {

    public static void main(String[] args) {
        char [][] board = new char[3][3];
        for( int row = o ; row <= board.length ; row++){
            for(int col = 0  ; col <=board[row].length ; col++){
                board [row][col] = ' '; 
            }
        }
    }
}