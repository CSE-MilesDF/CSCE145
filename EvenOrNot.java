import java.util.Scanner;
public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
	//type casting
		int number = (int) key.nextDouble();
		
		if(number % 2 ==0)		
		{
			System.out.println("Number entered is even");
		}
		else
		{
			System.out.println("Number entered is odd"); 
		}
		
		int a = 10;
		
		System.out.println(a);
		
		a = 15; 
		
		System.out.println(a);
		// replaces old values
		
	}

}
