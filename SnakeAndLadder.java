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
		int ladder = 2;
		int snake = 2;
		int i = 0;
		

		// ladder //
		int ladderone = 2;
		int ladderTwo = 25;
		int ladderThree = 57;
		int ladderFour = 70;
		
		// Snake //
		int snakeOne = 18;
		int snakeTwo = 50;
		int snakeThree = 68;
		int snakeFour = 99;
		
		if (ladder==ladderone) {
			int position = i+=10;
			System.out.println("First ladder " + position);	
		}else if (i==ladderTwo) {
			int position = i+=20;
			System.out.println("Second ladder " + position);	
		}else if (i==ladderThree) {
			int position = i+=30;
			System.out.println("Third ladder " + position);	
		}else if (i==ladderFour) {
			int position = i+=23;
			System.out.println("Fourth ladder " + position);	
		}else if (i==snakeOne) {
			int position = i-=10;
			System.out.println("First snake " + position);	
		}else if (i==snakeTwo) {
			int position = i-=20;
			System.out.println("Second snake " + position);	
		}else if (i==snakeThree) {
			int position = i-=45;
			System.out.println("Third snake " + position);	
		}else if (i==snakeFour) {
			int position = i-=18;
			System.out.println("Fourth snake " + position);	
		}else if (i>block) {
			
			System.out.println("");
		}
		
	}
	
}
