import java.util.Scanner;



public class fibo
{
	/*
	 * By starting with 1 and 2, the first 10 fibonacci numbers will be:1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
	 *  ... By considering the terms in the Fibonacci sequence whose values do not exceed 1000, find the sum of
	 *   the odd-valued terms. Write a Java Program with a function with a member method to accomplish the above. *

	 */
	public static void odd(int fib)
	{
		int sum = 0;
		int first =1;
		int second =2;
		int[] array= new int[30];
		array[0]=1;
		array[1]=2;
		int count = 0; //used to check how many elements in the array
		
		
        
        while (first <= fib)
        {
        	array[count] = first;
        	count++;
            
            
            sum = first + second;
            first = second;
            second=sum;
            
         
        }
        
        System.out.println("");
		for (int i=0; i<=count-1;i++)
		{
			System.out.print(array[i] +",");

		}
		
		System.out.println("");
		
		
		
		
		
		
		
		
		
		
		
		int summ=0;
		
		System.out.println("These are the odd valued terms");
		
		for (int z=1; z<=count; z++)
		{
			if (array[z]%2 !=0 )
			{
				System.out.print(array[z] + ",");
				summ = summ + array[z];
			}
		}
		System.out.println("");
		System.out.println("Sum =" + " " + summ);
		
		
		
		
	}
	public static void main(String[] args)
	{
		
		System.out.println("What is the fibonacci number you want to end at?");
		Scanner scan = new Scanner(System.in);
		int fib = scan.nextInt();
		
		odd(fib);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int febcount = 16;
		int [] array = new int[20];

		int i= 2;
		array[0] = 1;
		array[1] = 2;
		
		while (array[i] < 1000)
		{
		for(i=2; i<febcount; i++)
		{
			array[i] = array[i-1] + array[i-2];
			System.out.print(array[i]+ ",");		
		}
		}
				
		for (int z =0; z<=10; z++)
		{
			System.out.print(array[z] + ", ");
		}*/
		
		//put fib numbers in array then use as arguemnt to method then check if its odd by doing /2 ==0
	}
}