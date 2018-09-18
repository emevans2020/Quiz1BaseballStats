//query the user to enter player name, H, 2B, 3B, HR, R and BB attributes
package baseballStatistics;

import java.util.Scanner;

public class BaseballStats {
	
	//public constructor
		public BaseballStats() {
	}
	
	//Creates scanner to obtain input
	Scanner scan = new Scanner (System.in);
		
	//will prompt the person for name and save to variable Name
	public void getName(String name){
		System.out.println("Enter your name: ");
		name = scan.nextLine();
		System.out.println("Your name is: "+ name);
	}
	
	// Gets how many At Bats
	public void AtBat (int atbats) {
		System.out.println("Enter in the number of At Bat: ");
		int AtBat = scan.nextInt();
		System.out.println("Your amount of at bats is: " + AtBat);
	}
	
	//Will get how many hits and print out amount
	public void Hits (int hits) {
		System.out.println("Enter in the number of hits: ");
		int Hits = scan.nextInt();
		System.out.println("Your amount of hits is: " + Hits);
	}
	
	public void Doubles (int doubles) {
		System.out.println("Enter in the amount of doubles: ");
		int Doubles = scan.nextInt();
		System.out.println("Your amount of doubles is: " + Doubles);
	}

	public void Triples (int triples) {
		System.out.println("Enter in the amount of triples: ");
		int Triples = scan.nextInt();
		System.out.println("Your number of trips are: " + Triples);
	}

	public void HomeRuns (int homeRuns) {
		System.out.println("Enter in the amount of homeruns: ");
		int homeRuns1 = scan.nextInt();
		System.out.println ("Your number of homeruns is: " + homeRuns1);
	}

	public void Runs (int runs) {
		System.out.println("Enter in the amount of runs: ");
		int Runs = scan.nextInt();
		System.out.println("Your amount of runs: "+ Runs);
	}

	public void Walks (int walks) {
		System.out.println("Enter in the amount of walks: ");
		int Walks = scan.nextInt();
		System.out.println("Your amount of walks is: " + Walks);
	}

	public void HitByPitch (int hitsbpitch) {
		System.out.println("Enter in the amount of hits by pitch: ");
		int HitsByPitch = scan.nextInt();
		System.out.println("Your amount of hits by pitch are: " + HitsByPitch);
	}
	
	// will prompt user for sacrifice flies
	public void SacrificeFlies (int sacrificeFlies) {
		System.out.println("Enter in the amount of sacrifice flies: ");
		int SacrificeFlies = scan.nextInt();
		System.out.println("Your amount of sacrifice flies are: " + SacrificeFlies);
	}
	
	public double battingAvg (int Hits, int AtBat) {
		int BattingAverage= (Hits/AtBat);
		return BattingAverage;
	}

	public double onBasePercent (int Hits, int Walks, int HitByPitch, int AtBat,
			int walks, int hitByPitch, int SacrificeFlies) {
		double BasePercent = (Hits + Walks + HitByPitch)/(AtBat + Walks + HitByPitch +
			SacrificeFlies);
		return BasePercent;
	}
	
	public double sluggingPercent (int OneB, int TwoB, int ThreeB, int HomeRuns, int AtBat) {
		int sluggingPercent = ((OneB + (2*TwoB)+ (3*ThreeB) + (4*HomeRuns))/AtBat);
		return sluggingPercent;
	}

	public double OnBaseSlugPercent (double onBasePercent, double sluggingPercent) {
		double onBaseSlugPercent = (onBasePercent + sluggingPercent);
		return onBaseSlugPercent;
	}

}