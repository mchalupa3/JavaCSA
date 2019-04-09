package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    String[][] board = new String[8][8];
	    for(int b = 0; b < 8; b++){
	        if(b % 2 == 0){
	            for(int c = 0; c < 8; c++){
	                if(c % 2 == 0){
	                	if(b == 0 || b == 6)
	                		board[b][c] ="BC";
	                	else
	                    board[b][c] = "B ";
                    }
	                else{
	                    board[b][c] = "W ";
                    }
                }
            }

	        else{
	            for (int d =0; d < 8; d++){
	                if(d % 2 == 0){
	                    board[b][d] ="W ";
                    }

	                else{
	                	if(b == 1 || b == 7)
	                		board[b][d] = "BC";
	                	else
	                    board[b][d] = "B ";
                    }
                }
            }
        }

	    for(int i = 0; i < 8; i++){
	        System.out.println( Arrays.deepToString( board[i] ) );
        }
    }
}
