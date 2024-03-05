import java.util.Scanner;

public class Mil_Kil {
	public static void main(String[] args)
	{
		int mile;
	       double kilometer;
	       Scanner scan = new Scanner(System.in) ;

	       // get three values from user
	       System.out.println("Please enter mile " +
	                       "I will convert it into kilometer");
	      System.out.print("Enter the miles : ");
	      mile = scan.nextInt();
	      kilometer = mile*1.60935;
	      
	      
	      System.out.println("The average is " + kilometer);
	      

	}

}
