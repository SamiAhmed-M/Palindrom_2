package palindromCheck;
// Check if the given word is a palindrom through CharAt() method of the string
import java.util.Scanner;

public class PalCheck2 {

	public static void main(String[] args) {
		// Scanner object
		Scanner myObj = new Scanner(System.in);
		// Prompt user
		System.out.println("Please enter a string / word to check if palindrom or not");
		String str = myObj.nextLine();
		myObj.close();
		CheckPalindrom obj = new CheckPalindrom();
		obj.display(str);
	}

}
