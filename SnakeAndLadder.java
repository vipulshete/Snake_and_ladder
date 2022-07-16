package com.bridgelab.sankeandladder;

import com.bridgelab.snakeAndLadder.RollDieOne;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Play Snake and Ladder Game");
		String playerOne = "vipul";
		System.out.println("Name of player is " + playerOne);
		
		
		
		SnakeAndLadder snakeLadder = new SnakeAndLadder();
		snakeLadder.dieOne();
		
	
	}
	
	void dieOne() {
		
		int playerOneDice = (int) Math.floor(Math.random() * 10) % 7; 
		System.out.println("Die number is " + playerOneDice);
		
		int start = 0;
		int block = 100;
		
		for (int i=start; i<block; i++) {
			
			if (i==0) {
				System.out.println("Its starting point");
			}
		}
	}
	
}
