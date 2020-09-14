import java.util.Scanner;
/**
 * This program turns a Celsius temp into Farenheit 
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args){ 
	//initializes the scanner input 
	 Scanner input = new Scanner(System.in);
	 //prompts the user to enter a temperature
	  System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");
	  //gets input from user for temperature
		int degreesCelsius = input.nextInt();
		//calculates the farenheit temperature
	  int degreesFarenheit = degreesCelsius * 9 / 5 + 32;
		/**outputs the final result for the calculation as a whole setence
		*/
	  System.out.println(degreesCelsius + "C is the same as " + degreesFarenheit + "F" );

    
  }
}
