import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("What is the name of the data file?(exclude .txt)");
		Scanner input = new Scanner(System.in);
		String fileName = "src\\" + input.nextLine() + ".txt";
		File inputFile = new File(fileName);
		Scanner fileInput = new Scanner(inputFile);
		String template = "";
		template = template + fileInput.nextLine();

		// code above store the input file into template
		String[] inputStrings = template.split(" ");
		int sum = 0;
		System.out.println("Odd Numbers: ");
		for (int i = 0; i < inputStrings.length; i++) {
			if (inputStrings[i].equals("")) {

			} else {
				sum += Integer.parseInt(inputStrings[i]); // adds each number to variable sum
				if (Integer.parseInt(inputStrings[i]) % 2 != 0) { // checks to see if the current index is not divisible
																	// by two
					System.out.print(inputStrings[i] + " "); // prints out the value if it is not divisible by two.
				}
			}
		}
		System.out.println("\n\nThe sum of the integers that are in the file is : \n" + sum);

		// code below displays every fifth number in the list
		int count = 1;
		System.out.println("Every fifth number is:");
		for (int i = 0; i < inputStrings.length; i++) {
			if (count % 5 == 0) {
				System.out.println(inputStrings[i]);
			}
			count++;

		}

		// All even numbers
		System.out.println("These are all of the even ints");
		for (int j = 0; j < inputStrings.length; j++) {
			int tempInt = 0;
			if (inputStrings[j].equals("")) {

			}

			else {
				tempInt = Integer.parseInt(inputStrings[j]);

				if (tempInt % 2 == 0) {
					System.out.println(tempInt);
				}
			}
		}

		// code below displays every number divisible by 3
		for (int i = 0; i < inputStrings.length; i++) {
			int currNum = Integer.parseInt(inputStrings[i]);
			if (currNum % 3 == 0) {
				System.out.println("this number is divisible by 3: " + currNum);
			}
		}
	}
}
