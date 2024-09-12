package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount of money you are starting with: ");
		int startAmount = in.nextInt();
		System.out.println("Enter the probability that you win a single play: ");
		double winChance = in.nextDouble();
		System.out.println("Enter the amount of money that you would leave from success: ");
		int winLimit = in.nextInt();
		System.out.println("Enter the number of day's you'll simulate: ");
		int simulateddays = in.nextInt();
		int currentMoney = startAmount; 
		int plays = 0; 
		for(int sim = 1; sim < simulateddays; sim++) {
			while (currentMoney > 0 && currentMoney < winLimit) {
				boolean IsWin = true;
				double rand = Math.random() * 1;
				plays++;
				if (rand < winChance) {
					currentMoney++;
					//System.out.println("You won! Your current money is: + " + currentMoney);
				} else { 
					currentMoney--;
					 IsWin = false;
					//System.out.println("You lose. Your current money is: " + currentMoney);
				}
				System.out.println("Simulation " + plays + ": " + currentMoney + " " + IsWin);			
			
		}
		
		}
		
		

	}

}
