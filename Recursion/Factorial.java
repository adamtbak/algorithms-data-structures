/*
 * This class creates a solution to the n factorial problem using recursion.
 *
 * Author: Adam Bak 
 */

public class Factorial 
{
    public static void main(String[] args)
    {
        for(int i = 0; i <= 5; i++)
        {
            System.out.println(i + "! = " + factorial(i));
        }
    }
    
    /* This method uses recursion to calculate the factorial of the number n */
    private static long factorial(long n)
    {
        if(n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }    
}
