/*
 * This program a random password generator. This program
 * uses the RandomGenerator class in order to randomly generate
 * a password.
 */


import java.util.Scanner;

public class Password{

    /*
     * This method prints the menu for the user to choose which
     * password he or she wants.
     */
	public static void menu(){
		System.out.println("************************************************************************");
		System.out.println("*                       Password Generator Menu                        *");
		System.out.println("*          [1] Lowercase Letters                                       *");
		System.out.println("*          [2] Lowercase and Upper Case Letters                        *");
		System.out.println("*          [3] Lowercase, Uppercase, and Numbers                       *");
		System.out.println("*          [4] Lowercase, Uppercase, Numbers, and Punctuations         *");
		System.out.println("*          [5] Quit                                                    *");
		System.out.println("************************************************************************");   
	}

	public static void main(String[] args){

		int userChoice, userLength;
		RandomGenerator generator = new RandomGenerator();
		Scanner input = new Scanner(System.in);

		menu();
		while(true){
			try{
				System.out.print("Please choose an option (1-5): ");
				userChoice = Integer.parseInt(input.nextLine());

				//If the user picks something that is not in the options, then throw an exception.
				if(userChoice < 1 || userChoice > 5)
					throw new Exception();

				//If the user picks option 5, then say goodbye and exit the program.
				if(userChoice == 5){
					System.out.println("\nOk then, goodbye!");
					break;
				}

				System.out.print("Please choose the length of password (5-14): ");
				userLength = Integer.parseInt(input.nextLine());

				/*
				 * If the user picks either 1,2,3,or 4 from the option menu, and the user does
				 * not pick the required length, then do throw an exception.
				 */
				if(userLength < 5 || userLength > 14)
					throw new Exception();
				//Else, print the password.
				else
					System.out.println("\nPassword: " + generator.generatePassword(userChoice, userLength));
				break;
			}
			//Catch one of the errors and ask the user to input correctly.
			catch(Exception e){
				System.out.println("\nPlease enter the correct credentials.\n");
			}
		}
	}
}