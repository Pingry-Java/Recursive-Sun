/**
 * This program performs the factorial function on one number
 *
 * @author Michael Sun 
 *
 */

public class RecursiveFactorial
{
	/**
	 * This is the main method of the function 
	 *
	 * @param args An array of strings. This is irrelevant to the program. 
	*/
	public static void main(String[] args)
	{
		System.out.println(recursiveFactorial(5));
	
	}
	
	/** 
	 * This method solves the factorial of a number recursively 
	 *
	 * 
	 * @param n The number that needs to be "factorialed" 
	 * @return The number after it has been "factorialed" 
	*/
	public static int recursiveFactorial(int n)
	{
	 if (n == 1){
	   return 1;
	 
	 }
	 else {
	  return n * recursiveFactorial(n - 1); 
	 
	 }
	
	
	}
}