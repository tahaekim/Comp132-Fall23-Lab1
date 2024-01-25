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

public class Player {
	private int score;
    private int numRoundsWon;
	private String name;
	
	public Player(String name) {
		this.score = 0;
		this.numRoundsWon = 0;
		this.name = name;
		
	}
	
	public void increaseScore(double score) {
		this.score += score;
	}
	
	public void wonRound() {
		this.numRoundsWon++;
	}
	
	public int getScore() {
		return score;
	}
	
	public int getRoundsWon() {
		return numRoundsWon;
	}
	
	public String getName() {
		return name;
	}

}
