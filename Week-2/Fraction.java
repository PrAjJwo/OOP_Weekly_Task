import java.util.Scanner;

public class Fraction {
	public static void main(String[] args)
	{
		int neumerator,denomenator;
	    	double fraction;
	      Scanner scan = new Scanner(System.in) ;

	  
	
	      System.out.print("Enter the neumerator : ");
	      neumerator = scan.nextInt();
	      System.out.print("Enter the denomenator : ");
	      denomenator = scan.nextInt();
	      
	      fraction = neumerator/denomenator;
	      
	      System.out.println("The average is " + fraction);
	      

	}

}
