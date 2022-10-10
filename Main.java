package miniProjekt1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		

    	Scanner sc = new Scanner (System.in);
    	
    	int playerGuess = 0;
    	int chance = 0;
    	boolean running = true;
    	
    	int randomNumber = (int) Math.round(Math.random()*100);
    	
    	while(running) {
    		if (chance == 0) {
    			System.out.println(randomNumber);
    			System.out.println("Datorn har valt ett nummer mellan 1-100!");
    			System.out.println("Gissa vilket det är: ");
    		}
			chance++;
			playerGuess = sc.nextInt();
			
			boolean rightGuess = isItRightNumber(playerGuess, randomNumber);
			if (rightGuess) {
				System.out.println("Rätt! Du har vunnit!");
				System.out.println("Du klarade de på " + chance + " försök");
				System.out.println("Spelet startas nu om.");
				System.out.println("--------------------------------------");
				chance = 0;
				randomNumber = (int) Math.round(Math.random()*100);
			}
			else {
				if(randomNumber > playerGuess) {
					System.out.println("Fel, gissa högre!");
				}
				else {
					System.out.println("Fel, gissa lägre!");
				}
			}
		}
		
		sc.close();
	}
	
	static boolean isItRightNumber(int playerGuess, int randomNumber) {
		return playerGuess == randomNumber;
		}
}