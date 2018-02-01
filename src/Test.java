import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("What is the name of the data file?");
		Scanner input=new Scanner(System.in);
		String fileName=input.nextLine();
		File inputFile = new File(fileName);
		Scanner fileInput = new Scanner(inputFile);
		String template="";
		while(fileInput.hasNext()){ 
			template=template+input.nextLine()+"\n";
		}
		//code above store the input file into  template
		String [] inputStrings=template.split(" ");
		int sum=0;
		for(int i=0; i<inputStrings.length;i++) {
			sum+=Integer.parseInt(inputStrings[i]);
		}
		System.out.println("The sum of the integers that are in the file is : "+sum);
		
		
	}
}
