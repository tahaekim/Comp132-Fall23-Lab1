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

import java.util.Random;
public class Dice {
	
	private Random random;
	private int numSides;
	
	public Dice(int numSides) {
		this.random = random;
		this.numSides = numSides;
	}
	
	public int rollDice() {
		Random random = new Random(); 
		return random.nextInt(numSides) + 1;
	}
}
