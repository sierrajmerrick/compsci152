package goboardlab;

import java.util.Scanner;

public class goboard{

   static String[][] goBoard = new String[9][9];
    static boolean[][] beenChecked = new boolean [9][9];

    // static String[][] goBoard = { 

    //     {null,  null, " O ", " O ",  null,  null, null, null, null},
    //     {null, " O ", " X ", " X ", " O ",  null, null, null, null},
    //     {null, " O ", " X ",  null, " X ", " O ", null, null, null},
    //     {null, " O ", " X ", " X ", " X ", " O ", null, null, null},
    //     {null, " O ", " X ",  null, " X ", " O ", null, null, null},
    //     {null,  null, " O ", " X ", " X ", " O ", null, null, null},
    //     {null,  null,  null, " O ", " O ",  null, null, null, null},
    //     {null,  null,  null,  null,  null,  null, null, null, null},
    //     {null,  null,  null,  null,  null,  null, null, null, null}
        
    // };

    static void printBoard() {
        for(int i = 0; i < goBoard.length; i++) {
            for(int j = 0; j < goBoard[i].length; j++) {
                if(goBoard[i][j] == null) {
                    System.out.print(" + ");
                } else {
                    System.out.print(goBoard[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static boolean hasLiberty(int x, int y, String stone) {
        if(x < 0 || x >= goBoard.length || y < 0 || y >= goBoard[0].length || beenChecked[x][y]) {
            return false;
        }
        if(goBoard[x][y] == null) {
            return true;
        }
        if(!stone.equals(goBoard[x][y])) {
            return false;
        }
        beenChecked[x][y] = true;

        return 
        hasLiberty(x + 1, y, stone) ||
        hasLiberty(x - 1, y, stone) ||
        hasLiberty(x, y + 1, stone) ||
        hasLiberty(x, y - 1, stone);
    }

    public static void capture(int x, int y, String stone) {
        if(x < 0 || x >= goBoard.length || y < 0 || y >= goBoard[0].length) {
            return;
        }

        if(goBoard[x][y] != null && goBoard[x][y].equals(stone)) {
            goBoard[x][y] = null;
            capture(x + 1, y, stone);
            capture(x - 1, y, stone);
            capture(x, y + 1, stone);
            capture(x, y - 1, stone);
        }
    }

    public static void score() {
        int scoreO = 0;
        int scoreX = 0;

        for (int i = 0; i < goBoard.length; i++) {
            for (int j = 0; j < goBoard[i].length; j++) {
                if (" O ".equals(goBoard[i][j])) scoreO ++;
                if (" X ".equals(goBoard[i][j])) scoreX ++;

            }
        }

        System.out.println("Scores:");
        System.out.println("X: " + scoreX + "| O: " + scoreO);
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean playing = true;
        boolean player1 = true;

        while(playing) {
            printBoard();
            score();

            System.out.println();
            System.out.println(((player1) ? "O" : "X") + "'s turn.");
            
            System.out.println("Enter row:");
            int row = scn.nextInt();
            scn.nextLine();

            System.out.println("Enter column:");
            int col = scn.nextInt();
            scn.nextLine();


            if(row >= 0 && row < 9 && col >=0  && col < 9 && goBoard[row][col]== null) {
            goBoard[row][col]=(player1) ? " O ":" X ";

            String player2 = (player1) ? " X ":" O ";

            int[][] neighbors = {
                {row + 1, col},
                {row - 1, col},
                {row, col + 1},
                {row, col - 1}
            };

            for(int i = 0; i < neighbors.length; i++) {
                int nrow = neighbors[i][1];
                int ncol = neighbors[i][1];
                if(nrow >= 0 && nrow < 9 && ncol >= 0 && ncol < 9 && player2.equals(goBoard[nrow][ncol])) {
                    for (int j = 0; j < goBoard.length; j++) {
                        for (int k = 0; k < goBoard[j].length; k++) {
                            beenChecked[j][k] = false;
                        }
                    }

                        if (!hasLiberty(nrow, ncol, player2)) {
                            capture(nrow, ncol, player2);
                        }
                }
            }
            

            player1 = !player1;
            }  else {
                System.out.println("Out of bounds");
            }
        }            
    }
}


