/*
 * The RandomGenerator class generates random characters
 * in order to generate a random password for the Password
 * class.
 */

import java.util.Random;

public class RandomGenerator{

	/*
	 * A private method that will generate a random lowercase
     * letter.
	 */
	private char generateLowerCase(){
		int randomNum = (int)(Math.random() * (122 - 97) + 97);
		return (char)randomNum;
	}

	/*
	 * A private method that will generate a random letter, lowercase
     * or uppercase.
	 */
	private char generateLetter(){
		int randomNum = 0;
		do{
			randomNum = (int)(Math.random() * (122 - 65) + 65);
		}while(randomNum > 90 && randomNum < 97);
		return (char)randomNum;
	}

	/*
	 * A private method that will generate a random letter or
     * a random number.
	 */
	private char generateNumOrLetter(){
		int randomNum = 0;
		do{
			randomNum = (int)(Math.random() * (122 - 48) + 48);
		}while((randomNum > 57 && randomNum < 64) || (randomNum > 90 && randomNum < 97));
		return (char)randomNum;
	}

	/*
	 * A private method that will generate a random letter,
     * number, or punctuation.
	 */
	private char generateChar(){
		int randomNum = (int)(Math.random() * (122 - 48) + 48);
		return (char)randomNum;
	}

	/*
	 * A public method that will generate a random password,
	 * depending on the choice that user inputs from the menu
	 * and the length of the password that the user wants.
	 */
	public String generatePassword(int choice, int length){
		String password = "";

		switch(choice){
			case 1:
				for(int index = 0; index < length; index++){
					password += generateLowerCase();
				}
				break;
			case 2:
				for(int index = 0; index < length; index++){
					password += generateLetter();
				}
				break;
			case 3:
				for(int index = 0; index < length; index++){
					password += generateNumOrLetter();
				}
				break;
			case 4:
				for(int index = 0; index < length; index++){
					password += generateChar();
				}
				break;
			default:
				break;
		}

		return password;
	}
}