package baseballStatistics;

import java.util.Scanner;

public class BaseballStats {

	public BaseballStats() {

	}

	//query the user to enter player name, H, 2B, 3B, HR, R and BB
	// should be attributes
	
	//
	public void getName(String name){
		System.out.println("Enter your name: ");
		Scanner scan = new Scanner(System.in);
		String Name = scan.nextLine();
		System.out.println("Your name is: "+ Name);
		scan.close();
	}
	
	public void getDoubles (int doubles) {
		System.out.println("Enter in the amount of doubles: ");
		Scanner scan = new Scanner(System.in);
		int Doubles = scan.nextInt();
		System.out.println("Your amount of doubles is: " + Doubles);
		scan.close();
	}
	
	public void getTriples (int triples) {
		System.out.println("Enter in the amount of triples: ");
		Scanner scan = new Scanner (System.in);
		int Triples = scan.nextInt();
		System.out.println("Your number of trips are: " + Triples);
		scan.close();
	}
	
	public void getHomeRuns (int homeRun) {
		System.out.println("Enter in the amount of homeruns: ");
		Scanner scan = new Scanner (System.in);
		int homeruns = scan.nextInt();
		System.out.println ("Your number of homeruns is: " + homeruns);
		scan.close();
	}

	public void getRuns (int runs) {
		System.out.println("Enter in the amount of runs: ");
		Scanner scan = new Scanner(System.in);
		int Runs = scan.nextInt();
		System.out.println("Your amount of runs: "+ Runs);
		scan.close();
	}

	public void getWalks (int walks) {
		System.out.println("Enter in the amount of walks: ");
	}

}