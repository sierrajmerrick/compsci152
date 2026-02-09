package goboardlab;

import java.util.Scanner;

public class go {
    static String[][] board = new String[9][9];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean playing = true;
        boolean player1 = true;

        while(playing) {
            for (int i = 0 ; i < board.length; i ++){
            for(int j = 0 ; j < board.length; j ++){
                if (board[i][j] == null){
                    System.out.print(" + ");
                }else{
                    System.out.print(board[i][j]);    
                }
            }
            System.out.println();
        }  
            System.out.println("Please enter X coord:");
            int x = scn.nextInt();
            System.out.println("Please enter Y coord:");
            int y = scn.nextInt();


            if(x<9 && y<9 && x>-1 && y>-1 && board[x][y]== null){
            board[x][y]=(player1) ? " O ":" X ";
            player1 = !player1;
            }  
        }
    }
}
