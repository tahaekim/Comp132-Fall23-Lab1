/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted at the course website and (3) any study notes handwritten by myself.
I have not used, accessed or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: <Ahmet Taha Ekim, 79234>
********************************************************************************/

public class Game {
	private Player player1;
	private Player player2;
	private Dice dice;
	private int numRounds;
	
	public Game(String name1, String name2, int numSides, int numRounds) {
		this.player1 = new Player(name1);
        this.player2 = new Player(name2);
        this.dice = new Dice(numSides);
        this.numRounds = numRounds;
	}
	
	public void runGame() {
		
		for (int round = 1; round <= numRounds; round++) {
			int score1 = dice.rollDice();
			int score2 = dice.rollDice();
			
			player1.increaseScore(score1);
			player2.increaseScore(score2);
			
			System.out.println(player1.getName() + " rolled a " + score1);
			
			System.out.println(player2.getName() + " rolled a " + score2);
			
			if (score1 > score2) {
				System.out.println(player1.getName() + " won the round" + "/n");
				player1.wonRound();
			}
			else if (score1 < score2) {
				System.out.println(player2.getName() + " won the round" + "/n");
				player2.wonRound();
			}
			else {
				System.out.println(player1.getName() + " won the round" +"/n");
				System.out.println(player2.getName() + " won the round" +"/n");
				player1.wonRound();
				player2.wonRound();
			}
			
			System.out.println(player1.getName() + " has a score of " + player1.getScore());
			System.out.println(player2.getName() + " has a score of " + player2.getScore());
			
		}
	}
	
	public void runGame2() {
		int threshold = 3;
		
		for (int round = 1; round <= numRounds; round++) {
			int score1 = dice.rollDice();
			int score2 = dice.rollDice();
			
			
			
			System.out.println(player1.getName() + " rolled a " + score1);
			
			System.out.println(player2.getName() + " rolled a " + score2);
			
			if (score1 > score2) {
				System.out.println(player1.getName() + " won the round");
				player1.wonRound();
				if ((score1 - score2) > threshold) {
					player1.increaseScore(2);
				}
				else {
					player1.increaseScore(1);
				}
			}
			else if (score1 < score2) {
				System.out.println(player2.getName() + " won the round");
				player2.wonRound();
				if ((score2 - score1) > threshold) {
					player2.increaseScore(2);
				}
				else {
					player2.increaseScore(1);
				}
				
			}
			else if (score1 == score2){
				System.out.println("The round is tied");
				player1.increaseScore(1);
				player2.increaseScore(1);
				numRounds++;
			}
			
			System.out.println(player1.getName() + " has a score of " + player1.getScore());
			System.out.println(player2.getName() + " has a score of " + player2.getScore());
			
		}
		
		
	}
	
	public void printWinner() {
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " had the highest score, with " + player1.getScore());
			System.out.println(player1.getName() + " had the most rounds, with " + player1.getRoundsWon());
		}
		else {
			System.out.println(player2.getName() + " had the highest score, with " + player2.getScore());
			System.out.println(player2.getName() + " had the most rounds, with " + player2.getRoundsWon());
		}
	}
}
