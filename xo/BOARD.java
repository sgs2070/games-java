/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xo;
import java.util.*;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BOARD {
   
	
	static String[] board;
	static String turn;
	
	
	// CheckWinner method will
	// decide the combination
	// of three box given below.
	static String checkWinner()
	{
		for (int a = 0; a < 8; a++) {
			String line = null;

			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			//For X winner
			if (line.equals("XXX")) {
				return "X";
			}
			
			// For O winner
			else if (line.equals("OOO")) {
				return "O";
			}
		}
		
		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(
					String.valueOf(a + 1))) {
				break;
			}
			else if (a == 8) {
				return "draw";
			}
		}

	// To enter the X Or O at the exact place on board.
		System.out.println(
			turn + "'s turn; enter a slot number to place "
			+ turn + " in:");
		return null;
	}
	
	// To print out the board.
	/* |---|---|---|
	| 1 | 2 | 3 |
	|-----------|
	| 4 | 5 | 6 |
	|-----------|
	| 7 | 8 | 9 |
	|---|---|---|*/
	
	static void printBoard()
	{
		System.out.println("|---|---|---|");
		System.out.println("| " + board[0] + " | "
						+ board[1] + " | " + board[2]
						+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | "
						+ board[4] + " | " + board[5]
						+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | "
						+ board[7] + " | " + board[8]
						+ " |");
		System.out.println("|---|---|---|");
	}
//     public int [][]board=new int[3][3];
//     public static void print(char [][]board){
//     for(char [] row :board){
//     for(char c: row){
//     System.out.print(c);
//     }
//          System.out.println();
//
//     }
//     
//     }
//     public  void instructionBoard(){
//    System.out.println("| - | - | - |");
//    System.out.println("| 1 | 2 | 3 |");
//    System.out.println("| - | - | - |");
//    System.out.println("| 4 | 5 | 6 |");
//    System.out.println("| - | - | - |");
//    System.out.println("| 7 | 8 | 9 |");
//    System.out.println("| - | - | - |");
//    
//          Scanner u=new Scanner(System.in);
//        BOARD c=new BOARD();
//        System.out.println("Please enter position");
//        int position=u.nextInt();
//        if(position>9){
//         System.out.println("Please enter tye agian"+position);
//System.exit(0);
//        }else{                System.out.println("you chose  "+position);
//}
//    switch(position){
//        case 1:
//           board[0][0] ='X';
//            case 2:
//           board[0][1] ='X';
//            case 3:
//           board[0][2] ='X';
//            case 4:
//           board[1][0] ='X'; 
//            case 5:
//           board[1][1] ='X'; 
//            case 6:
//           board[1][2] ='X';
//            case 7:
//           board[2][0] ='X';
//           case 8:
//           board[2][1] ='X';
//             case 9:
//           board[2][2] ='X';
//        break;
//    }
//    print(board);
//}
//                public boolean isMatrixFull(){
//for(int row=0;row<3;row++){
//    for(int col=0;col<3;col++){
//        if(board[row][col]==0)return false;
//    }
//}
//return true;
//            }
}