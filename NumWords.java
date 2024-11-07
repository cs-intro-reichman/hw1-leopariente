// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int number = Integer.parseInt(args[0]);
		int totalHundreds = number / 100;
		int totalTens = number / 10 - (totalHundreds * 10);
		int totalOnes = number - (totalHundreds * 100) - (totalTens * 10);

		System.out.println(totalHundreds + " hundreds, " + totalTens + " tens, and " + totalOnes + " ones.");
	}
}
