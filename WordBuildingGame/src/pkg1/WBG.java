package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class WBG {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> words = new ArrayList<>();
		File f1 = new File("dictionary.txt");
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(System.in);
		boolean running = true;
		int score = 0;
		while(sc1.hasNextLine()) {
			words.add(sc1.nextLine());
		}
		
		while(running) {
			Random rand1 = new Random();
			int rand2 = rand1.nextInt(words.size());
			String computerChoice = words.get(rand2);
			System.out.println("Computer's choice : "+computerChoice);
			System.out.print("Your choice: ");
			String userChoice = sc2.nextLine();
			if(userChoice.startsWith(String.valueOf(computerChoice.charAt(computerChoice.length()-1))) & words.contains(userChoice)) {
				running = true;
				score+=5;
			}else {
				System.out.println("-------------- Game over --------------");
				running = false;
			}
		}
	}
}
