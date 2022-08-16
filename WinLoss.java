package com.bridgelabz;

public class WinLoss {
	public static void main(String[] args) {
		
		System.out.println("Gambling");
		
			utility=new Utility();
			System.out.println("Enter stack Price");
			stack=utility.inputDouble();

			System.out.println("Enter stack Goal");
			goal=utility.inputDouble();

			System.out.println("Enter stack bet price");
			betPrice=utility.inputDouble();
		}
		public static void main(String args[]){
			Gambler gambler=new Gambler();
			gambler.playGame();
			gambler.printResult();
		}


		//This function return true(Win) when probability is less then 0.5 else return false(loss)
		public boolean winOrloss(){
			if(Math.random()<0.5)
				return true;
			else
				return false;
		}

		public void playGame(){
			numberOfPlay++;	
			if(winOrloss())
				stack+=betPrice;
			else
				stack -= betPrice;
			if(stack <=0 || stack>=goal)
				return;
			else
				playGame();
		}
		public void printResult(){
			System.out.println("Number of time Game play is:"+ numberOfPlay);
			System.out.println("Stack is:" + stack);
			System.out.println("Goal is:" + goal);
			System.out.println("Bet Price is:" + betPrice);
		}
	}
	}

}
