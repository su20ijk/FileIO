import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("What is the name of the data file?");
		Scanner input=new Scanner(System.in);
		String fileName="src\\"+input.nextLine()+".txt";
		File inputFile = new File(fileName);
		Scanner fileInput = new Scanner(inputFile);
		String template="";
			template=template+fileInput.nextLine();
		//code above store the input file into  template
		String [] inputStrings=template.split(" ");
		int sum=0;
		for(int i=0; i<inputStrings.length;i++) {
			if(inputStrings[i].equals("")) {
				
			}
			else {
				sum+=Integer.parseInt(inputStrings[i]);	
			}
		}
		System.out.println("The sum of the integers that are in the file is : "+sum);
		//code below displays every number divisible by 3
		for(int i=0; i<inputStrings.length;i++) {
			int currNum=Integer.parseInt(inputStrings[i]);
			if(currNum%3==0) {
				System.out.println("this number is divisible by 3: "+currNum);
			}
		}
	}
}
