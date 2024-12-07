

import java.util.Scanner;


public class Homework04 {

	public static void main(String[] args) {
		// Miles Farmer
		Scanner key = new Scanner(System.in);

		System.out.println("How many cirles do you wish to sort");

int size = key.nextInt();
//array 2 makes it possible to create unique values
double[] circlearrays = new double[size];
double[] array2 = new double[size];

int check = 0;
// the checks end the loops for me.
int check3 = 0;

	for(int i =0; i< circlearrays.length; i++) {
		System.out.println("Enter the radius for the circle at index"+i+":");
		circlearrays[i] = key.nextInt();
	}


System.out.println("Choose to store data in one of the following ways or quit the program");
System.out.println("1.Total # of circles to store in the collection and the radius of each circle in the Collection.");
System.out.println("2. Sort and display the circles by smallest to largest area. 3.");
System.out.println("3. Sort and display the circles area from largest to smallest");
System.out.println("4. Find and display all unique circles areas in the collection");
System.out.println("5. Quit the program");

int choice = key.nextInt();
//do loop with a switch inside that lets the user choose which case they want to use or choose again with the wrong input.
do {
	switch(choice) {
	//case 1 displays radius and length
	case 1:
		System.out.println("The number of circles listed are" +circlearrays.length + "circles and the radius of the circles are");
		for (int i = 0; i< circlearrays.length; i++) {
			System.out.print(circlearrays[i]+ ", ");
			check3++;
		}
		break;
	case 2:
		//case 2 displays the circles by smallest to largest area
		for (int i = 0; i < circlearrays.length; i++) {
			circlearrays[i] = circlearrays[i] * circlearrays[i] * 3.14;
		}
		for(int i = 0; i < circlearrays.length; i++)
		{
			int min = i;
			double smallest = circlearrays[i];
			
			for(int j = i+1; j < circlearrays.length; j++)
			{
				if(circlearrays[j] < smallest)
				{
					smallest = circlearrays[j];
					min = j;
					
				}
			}
			
			if(smallest < circlearrays[i])
			{
				double temp = circlearrays[i];
				
				circlearrays[i] = circlearrays[min];
					
				circlearrays[min] = temp;
				
			}

		}
		
		for(int i = 0; i < circlearrays.length; i++)
		{
			System.out.print(circlearrays[i]+", ");
			
		}
		check3++;
		break;
		//case 3 is like case 2 but displays it from largest to smallest
	case 3:
		for (int i = 0; i < circlearrays.length; i++) {
			circlearrays[i] = circlearrays[i] * circlearrays[i] * 3.14;
		}
		for(int i = 0; i < circlearrays.length; i++)
		{
			int min = i;
			double largest = circlearrays[i];
			
			for(int j = i+1; j < circlearrays.length; j++)
			{
				if(circlearrays[j] > largest)
				{
					largest = circlearrays[j];
					min = j;
					
				}
			}
			
			if(largest > circlearrays[i])
			{
				double temp = circlearrays[i];
				
				circlearrays[i] = circlearrays[min];
					
				circlearrays[min] = temp;
				
			}

		}
		
		for(int i = 0; i < circlearrays.length; i++)
		{
			System.out.print(circlearrays[i]+", ");
			
		}
		check3++;
		
		break;
	case 4: //this is the unique values and has no repeating values
		for (int i = 0; i < circlearrays.length; i++)
		{
			circlearrays[i] = circlearrays[i] * circlearrays[i] * 3.14;
		}
		for(int i = 0; i < circlearrays.length; i++) 
		{
			array2[i] = circlearrays[i];
		}
		for(int i=0; i<circlearrays.length; i++) {
			for (int j = i; j<circlearrays.length; j++) {
				if(circlearrays[i] == array2[j]) 
				{
					check++;
				}
				}
			if(check<2) {
				System.out.println(+circlearrays[i]+ "");
			}
			check = 0;
		}
		check3++;
		break;
	case 5:
		//case 5 just ends the program if the user wishes to do so.
		System.exit(0);
		check3++;
		break;
		default:
			System.out.println("Improper value. Please choose again.");
			System.out.println("Choose to store data in one of the following ways or quit the program");
			System.out.println("1.Total # of circles to store in the collection and the radius of each circle in the Collection.");
			System.out.println("2. Sort and display the circles by smallest to largest area. ");
			System.out.println("3. Sort and display the circles area from largest to smallest");
			System.out.println("4. Find and display all unique circles areas in the collection");
			System.out.println("5. Quit the program");
		choice = key.nextInt();
	//if someone clicks an invalid input default replays the loop since the check3 is less than 1.
	} 
} while(check3 < 1);














	}

}
