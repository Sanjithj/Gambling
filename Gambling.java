package com.bridgelabz;

public class Gambling {
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling");
		int stake = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);
		int trial = Integer.parseInt(args[2]);
		
		int bet = 0;
		int win = 0;
		 
		for(int t=0; t< trial; t++) {
			int cash = stake;
			while(cash>0 && cash < goal) {
				bet++;
				if(Math.random()< 0.5) 
					cash++;
				else 
					cash--;
			}
			if (cash == goal)win++;
		}
		System.out.println(win + "win" + trial);
		System.out.println("game wins by" + 100.0 * win / trial);
		System.out.println("average" + 1.0 * bet / trial);
	}

}
