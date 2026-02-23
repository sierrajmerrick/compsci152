import java.util.Scanner;

public class cube {

    static String[][] theCube = { {"r", "r", "r", "r", "r", "r", "r", "r", "r"},
                                  {"b", "b", "b", "b", "b", "b", "b", "b", "b"},
                                  {"o", "o", "o", "o", "o", "o", "o", "o", "o"},
                                  {"g", "g", "g", "g", "g", "g", "g", "g", "g"},
                                  {"y", "y", "y", "y", "y", "y", "y", "y", "y"},
                                  {"w", "w", "w", "w", "w", "w", "w", "w", "w"},
                                };


    
    public static void printCube() {
        RubiksCube Cube = new RubiksCube();
        Cube.show(theCube);
        for (int i = 0; i < theCube.length; i++){
            for(int j = 0; j < theCube[i].length; j++){
                if(j==3 || j == 6){
                    System.out.println();
                }
                System.out.print("|" + theCube[i][j] + "|");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void umove() {
        String temp = new String("");

        //rotate w face to the right
                temp = theCube[5][0];
                theCube[5][0] = theCube[5][2];
                theCube[5][2] = temp;

                temp = theCube[5][1];
                theCube[5][1] = theCube[5][5];
                theCube[5][5] = temp;

                temp = theCube[5][0];
                theCube[5][0] = theCube[5][8];
                theCube[5][8] = temp;

                temp = theCube[5][6];
                theCube[5][6] = theCube[5][0];
                theCube[5][0] = temp;

                temp = theCube[5][3];
                theCube[5][3] = theCube[5][1];
                theCube[5][1] = temp;

                temp = theCube[5][7];
                theCube[5][7] = theCube[5][3];
                theCube[5][3] = temp;

        // swap r to g face 
                temp = theCube[0][0];
                theCube[0][0] = theCube[3][0];
                theCube[3][0] = temp;

                temp = theCube[0][1];
                theCube[0][1] = theCube[3][1];
                theCube[3][1] = temp;

                temp = theCube[0][2];
                theCube[0][2] = theCube[3][2];
                theCube[3][2] = temp;

        // swap b to r face
                temp = theCube[1][0];
                theCube[1][0] = theCube[0][0];
                theCube[0][0] = temp;

                temp = theCube[1][1];
                theCube[1][1] = theCube[0][1];
                theCube[0][1] = temp;

                temp = theCube[1][2];
                theCube[1][2] = theCube[0][2];
                theCube[0][2] = temp;

        // swap o to b face & g to o face
                temp = theCube[2][0];
                theCube[2][0] = theCube[1][0];
                theCube[1][0] = temp;

                temp = theCube[2][1];
                theCube[2][1] = theCube[1][1];
                theCube[1][1] = temp;

                temp = theCube[2][2];
                theCube[2][2] = theCube[1][2];
                theCube[1][2] = temp;
            }

    public static void dmove() {
        String temp = new String("");

        //rotate y face to the right
                temp = theCube[4][0];
                theCube[4][0] = theCube[4][2];
                theCube[4][2] = temp;

                temp = theCube[4][1];
                theCube[4][1] = theCube[4][5];
                theCube[4][5] = temp;

                temp = theCube[4][0];
                theCube[4][0] = theCube[4][8];
                theCube[4][8] = temp;

                temp = theCube[4][6];
                theCube[4][6] = theCube[4][0];
                theCube[4][0] = temp;

                temp = theCube[4][3];
                theCube[4][3] = theCube[4][1];
                theCube[4][1] = temp;

                temp = theCube[4][7];
                theCube[4][7] = theCube[4][3];
                theCube[4][3] = temp;

        // swap r to b face 
                temp = theCube[0][6];
                theCube[0][6] = theCube[1][6];
                theCube[1][6] = temp;

                temp = theCube[0][7];
                theCube[0][7] = theCube[1][7];
                theCube[1][7] = temp;

                temp = theCube[0][8];
                theCube[0][8] = theCube[1][8];
                theCube[1][8] = temp;

        // swap g to r face
                 temp = theCube[3][6];
                 theCube[3][6] = theCube[0][6];
                 theCube[0][6] = temp;

                 temp = theCube[3][7];
                 theCube[3][7] = theCube[0][7];
                 theCube[0][7] = temp;

                 temp = theCube[3][8];
                 theCube[3][8] = theCube[0][8];
                 theCube[0][8] = temp;

        // swap g to o face & o to b face
                temp = theCube[3][6];
                theCube[3][6] = theCube[2][6];
                theCube[2][6] = temp;

                temp = theCube[3][7];
                theCube[3][7] = theCube[2][7];
                theCube[2][7] = temp;

                temp = theCube[3][8];
                theCube[3][8] = theCube[2][8];
                theCube[2][8] = temp;
            }

    public static void rmove() {
        String temp = new String("");

        //rotate b face to the right
                temp = theCube[1][0];
                theCube[1][0] = theCube[1][2];
                theCube[1][2] = temp;

                temp = theCube[1][1];
                theCube[1][1] = theCube[1][5];
                theCube[1][5] = temp;

                temp = theCube[1][0];
                theCube[1][0] = theCube[1][8];
                theCube[1][8] = temp;

                temp = theCube[1][6];
                theCube[1][6] = theCube[1][0];
                theCube[1][0] = temp;

                temp = theCube[1][3];
                theCube[1][3] = theCube[1][1];
                theCube[1][1] = temp;

                temp = theCube[1][7];
                theCube[1][7] = theCube[1][3];
                theCube[1][3] = temp;

        // swap r to w face 
                temp = theCube[0][2];
                theCube[0][2] = theCube[5][2];
                theCube[5][2] = temp;

                temp = theCube[0][5];
                theCube[0][5] = theCube[5][5];
                theCube[5][5] = temp;

                temp = theCube[0][8];
                theCube[0][8] = theCube[5][8];
                theCube[5][8] = temp;

        // swap y to r face
                temp = theCube[4][2];
                theCube[4][2] = theCube[0][2];
                theCube[0][2] = temp;

                temp = theCube[4][5];
                theCube[4][5] = theCube[0][5];
                theCube[0][5] = temp;

                temp = theCube[4][8];
                theCube[4][8] = theCube[0][8];
                theCube[0][8] = temp;

        // swap o to y face & w to o face
                temp = theCube[2][0];
                theCube[2][0] = theCube[4][8];
                theCube[4][8] = temp;

                temp = theCube[2][3];
                theCube[2][3] = theCube[4][5];
                theCube[4][5] = temp;

                temp = theCube[2][6];
                theCube[2][6] = theCube[4][2];
                theCube[4][2] = temp;
            }

    public static void lmove() {
        String temp = new String("");

        //rotate g face to the right
                temp = theCube[3][0];
                theCube[3][0] = theCube[3][2];
                theCube[3][2] = temp;

                temp = theCube[3][1];
                theCube[3][1] = theCube[3][5];
                theCube[3][5] = temp;

                temp = theCube[3][0];
                theCube[3][0] = theCube[3][8];
                theCube[3][8] = temp;

                temp = theCube[3][6];
                theCube[3][6] = theCube[3][0];
                theCube[3][0] = temp;

                temp = theCube[3][3];
                theCube[3][3] = theCube[3][1];
                theCube[3][1] = temp;

                temp = theCube[3][7];
                theCube[3][7] = theCube[3][3];
                theCube[3][3] = temp;

        // swap r to y face 
                temp = theCube[0][0];
                theCube[0][0] = theCube[4][0];
                theCube[4][0] = temp;

                temp = theCube[0][3];
                theCube[0][3] = theCube[4][3];
                theCube[4][3] = temp;

                temp = theCube[0][6];
                theCube[0][6] = theCube[4][6];
                theCube[4][6] = temp;

        // swap w to r face
                temp = theCube[5][0];
                theCube[5][0] = theCube[0][0];
                theCube[0][0] = temp;

                temp = theCube[5][3];
                theCube[5][3] = theCube[0][3];
                theCube[0][3] = temp;

                temp = theCube[5][6];
                theCube[5][6] = theCube[0][6];
                theCube[0][6] = temp;

        // swap o to w face & y to o face
                temp = theCube[2][2];
                theCube[2][2] = theCube[5][6];
                theCube[5][6] = temp;

                temp = theCube[2][5];
                theCube[2][5] = theCube[5][3];
                theCube[5][3] = temp;

                temp = theCube[2][8];
                theCube[2][8] = theCube[5][0];
                theCube[5][0] = temp;
            }
        
    public static void fmove() {
        String temp = new String("");

            //rotate r face to the right
                temp = theCube[0][0];
                theCube[0][0] = theCube[0][2];
                theCube[0][2] = temp;

                temp = theCube[0][1];
                theCube[0][1] = theCube[0][5];
                theCube[0][5] = temp;

                temp = theCube[0][0];
                theCube[0][0] = theCube[0][8];
                theCube[0][8] = temp;

                temp = theCube[0][6];
                theCube[0][6] = theCube[0][0];
                theCube[0][0] = temp;

                temp = theCube[0][3];
                theCube[0][3] = theCube[0][1];
                theCube[0][1] = temp;

                temp = theCube[0][7];
                theCube[0][7] = theCube[0][3];
                theCube[0][3] = temp;

            //swap g right column to w bottom row
                temp = theCube[3][2];
                theCube[3][2] = theCube[5][8];
                theCube[5][8] = temp;

                temp = theCube[3][5];
                theCube[3][5] = theCube[5][7];
                theCube[5][7] = temp;

                temp = theCube[3][8];
                theCube[3][8] = theCube[5][6];
                theCube[5][6] = temp;

            //swap y top row to g right column
                temp = theCube[4][0];
                theCube[4][0] = theCube[3][2];
                theCube[3][2] = temp;

                temp = theCube[4][1];
                theCube[4][1] = theCube[3][5];
                theCube[3][5] = temp;

                temp = theCube[4][2];
                theCube[4][2] = theCube[3][8];
                theCube[3][8] = temp;

            //swap b left column to y top row & w bottom row to b left column
                temp = theCube[1][0];
                theCube[1][0] = theCube[4][0];
                theCube[4][0] = temp;

                temp = theCube[1][3];
                theCube[1][3] = theCube[4][1];
                theCube[4][1] = temp;

                temp = theCube[1][6];
                theCube[1][6] = theCube[4][2];
                theCube[4][2] = temp;       
            }

        public static void bmove() {
            String temp = new String("");

            //rotate o face to the right
                temp = theCube[2][0];
                theCube[2][0] = theCube[2][2];
                theCube[2][2] = temp;

                temp = theCube[2][1];
                theCube[2][1] = theCube[2][5];
                theCube[2][5] = temp;

                temp = theCube[2][0];
                theCube[2][0] = theCube[2][8];
                theCube[2][8] = temp;

                temp = theCube[2][6];
                theCube[2][6] = theCube[2][0];
                theCube[2][0] = temp;

                temp = theCube[2][3];
                theCube[2][3] = theCube[2][1];
                theCube[2][1] = temp;

                temp = theCube[2][7];
                theCube[2][7] = theCube[2][3];
                theCube[2][3] = temp;

            //swap b right column to w top row
                temp = theCube[1][2];
                theCube[1][2] = theCube[5][0];
                theCube[5][0] = temp;

                temp = theCube[1][5];
                theCube[1][5] = theCube[5][1];
                theCube[5][1] = temp;

                temp = theCube[1][8];
                theCube[1][8] = theCube[5][2];
                theCube[5][2] = temp;

            //swap y bottom row to b right column
                temp = theCube[4][6];
                theCube[4][6] = theCube[1][2];
                theCube[1][2] = temp;

                temp = theCube[4][7];
                theCube[4][7] = theCube[1][5];
                theCube[1][5] = temp;

                temp = theCube[4][8];
                theCube[4][8] = theCube[1][8];
                theCube[1][8] = temp;

            //swap g left column to y bottom row & w top row to g left column
                temp = theCube[3][0];
                theCube[3][0] = theCube[4][6];
                theCube[4][6] = temp;

                temp = theCube[3][3];
                theCube[3][3] = theCube[4][7];
                theCube[4][7] = temp;

                temp = theCube[3][6];
                theCube[3][6] = theCube[4][8];
                theCube[4][8] = temp;       
            }
    

    public static void main(String[] args) {
        System.out.println("Welcome to the cube.");
        System.out.println();
        printCube();
        System.out.println("Use commands u, d, r, l, f, & b to make clockwise turns.");
        System.out.println("Use commands u', d', r', l', f', & b' to make counter-clockwise turns.");
        System.out.println("Use command s to reveal the sequence of move required to restore the cube to its solved state.");
        System.out.println("Use command h to view all of your previous moves.");
        Scanner scan= new Scanner(System.in);

        String moves[] = new String[80];
        
        for(int i = 0; i < moves.length; i++) {
            System.out.println("------------------------------");
            System.out.println("Please enter a command:");
            String nextMove = scan.nextLine();
            switch(nextMove) {
                case "u":
                    umove();
                    printCube();
                    break;
                case "u'":
                    umove();
                    umove();
                    umove();
                    printCube();
                    break;
                case "d":
                    dmove();
                    printCube();
                    break;
                case "d'":
                    dmove();
                    dmove();
                    dmove();
                    printCube();
                    break;
                case "r":
                    rmove();
                    printCube();
                    break;
                case "r'":
                    rmove();
                    rmove();
                    rmove();
                    printCube();
                    break;
                case "l":
                    lmove();
                    printCube();
                    break;
                case "l'":
                    lmove();
                    lmove();
                    lmove();
                    printCube();
                    break;
                case "f":
                    fmove();
                    printCube();
                    break;
                case "f'":
                    fmove();
                    fmove();
                    fmove();
                    printCube();
                    break;
                case "b":
                    bmove();
                    printCube();
                    break;
                case "b'":
                    bmove();
                    bmove();
                    bmove();
                    printCube();
                    break;
                case "s": 
                    System.out.println("Use this sequence of moves to solve:");
                    for(int z = (moves.length -1); z >= 0; z--) {
                        if (moves[z] != null) {
                            switch (moves[z]) {
                                case "u":
                                    System.out.println("u'");
                                    break;
                                case "u'":
                                    System.out.println("u");
                                    break;
                                case "d":
                                    System.out.println("d'");
                                    break;
                                case "d'":
                                    System.out.println("d");
                                    break;
                                case "r":
                                    System.out.println("r'");
                                    break;
                                case "r'":
                                    System.out.println("r");
                                    break;
                                case "l":
                                    System.out.println("l'");
                                    break;
                                case "l'":
                                    System.out.println("l");
                                    break;
                                case "f":
                                    System.out.println("f'");
                                    break;
                                case "f'":
                                    System.out.println("f");
                                    break;
                                case "b":
                                    System.out.println("b'");
                                    break;
                                case "b'":
                                    System.out.println("b");
                                    break;
                                default:
                            }
                        }
                    } 
                    break;
                case "h":
                    System.out.println("Move history:");
                    for(int x = 0; x < moves.length; x++) {
                        if (moves[x] != null) {
                            switch (moves[x]) {
                                case "s":
                                    break;
                                case "h":
                                    break;
                                default:
                                    System.out.println(moves[x]);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Please enter a valid move");
                }
            moves[i] = nextMove;
        }
        scan.close();
    }
}
