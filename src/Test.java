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
		
		
		System.out.println("These are all of the even ints");
		for(int j =0; j<inputStrings.length; j++)
		{
			int tempInt = 0;
			if(inputStrings[j].equals(""))
			{
				
			}
			
			else 
			{
				tempInt = Integer.parseInt(inputStrings[j]);
				
				if(tempInt % 2 == 0)
				{
					System.out.println(tempInt);
				}
			}
		}
	}
}
