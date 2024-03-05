import java.util.Scanner;

public class Squ_calculator {
	public static void main(String[] args)
	{
	   int length;
	   double perimeter,area;
	   Scanner scan = new Scanner(System.in) ;
	
	    
	   System.out.println("Please enter the length of square " +
	                    "I will calculate perimeter and area of that square");
	   System.out.print("Enter the length : ");
	   length = scan.nextInt();
	   perimeter = 4*length;
	   area = length*length;
	   
	   
	   System.out.println("The perimeter of the square is " + perimeter);
	   System.out.println("The area of the square is " + area);
	}
}
