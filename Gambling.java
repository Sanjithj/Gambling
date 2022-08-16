package com.bridgelabz;

public class Gambling {
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling");
		int stake = 0;
		int goal = 0;
		
		
		int bet = 0;
		int win = 0;
		int trail = 0;
		
		for(int t=0; t< trail; t++) {
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
		int trial = 0;
		System.out.println(win + "win" + trial);
		System.out.println("game wins by" + 100.0 * win / trial);
		System.out.println("average" + 1.0 * bet / trial);
	
	
	//UC3 Calculative won or lost
	
	 for(int i=1; i<=stake; i++){
         int check = check();
         if(check == 1){
             int win;
			win++;
             if(win == 50){
                 boolean postion = true;
                 System.out.println("Player win 50% and resigned...");
                 break;
             }
         }else {
             int loss;
			loss++;
             if (loss == 50){
                 boolean status = false;
                 System.out.println("Player lose by 50% and resigned...");
                 break;
             }
         }
     }
     if (status)
     {
         int stake;
		int win;
		System.out.println("Stake is: "+(stake+win));
     }
     else
     {
         int stake;
		int loss;
		System.out.println("Stake is: "+(stake-loss));
     }
	
 }

	private static int check() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}


