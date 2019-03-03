import java.util.Scanner;


public class putinarray


/*Write a java program to read numbers from the user and put it in an array. Ask for the array 
 * size before you ask for the actual numbers. Print the array. Do not use an ArrayList 
 * to do this exercise *
 * 
 */
{
	public static void smallest(int[] array)
	{
		int arraylength = array.length;
		int temp;
		for (int b=1; b< arraylength; b++)
			//comparison loop
		{
			for (int j=0; j< arraylength -1; j++)
			{//iteration loop
				if(array[j]> array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}

			}
		}
		
		System.out.println(array[0]);
		//for loop that checks all numbers, the largest number goes into temp, then print temp
		//ERRO HANDLING
		
		//put the array in as an argument....
	}
	
	public static void largest(int [] array)
	{
		int num = 0;
		int arraylength = array.length;
		for (int j=0; j<= arraylength-1; j++)
		{
			if (array[j] > num)
			{
				num = array[j];
			}
		}
		System.out.println(num);

		//for loop that checks all numbers, the largest number goes into temp, then print temp

	}
	
	
	
	
	public static void main(String[] args)
	{
	
		System.out.println("What sized array do you want?");
		Scanner scan  = new Scanner(System.in);
		int sizearray = scan.nextInt();
		int[] array = new int[sizearray];
		
		
		for (int i=0; i<= sizearray-1; i++ )
		{
			System.out.println("What is the number that you want to enter into the array");
			Scanner scan1 = new Scanner(System.in);
			int num = scan1.nextInt();
			
			array[i] = num;
			
			System.out.println("These are the numbers in the current array");
			for (int z=0; z<=i; z++)
			{
				System.out.println(array[z]);
			}
		}
		
		//put array numbers into smallest(num)
		
		System.out.println("Do you want to search for the 1.Smallest or 2.Largest number in the array?");
		Scanner scan2 = new Scanner(System.in);
		int choice = scan2.nextInt();
		
		if (choice ==1 )
		{
			smallest(array);
		}
		
		if (choice ==2 )
		{
			largest(array);
		}
		
		
	}

}