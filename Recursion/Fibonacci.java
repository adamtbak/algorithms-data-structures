/*
 * This class calculates the Fibonacci Sequence using recursion.
 *
 * The Fibonacci sequence is given by the following formula:
 * F[n] = F[n-1] + F[n-2] where F[0] = 0 and F[1] = 1
 *
 * The first 10 Fibonacci numbers are as follows:
 * F[0] = 0, F[1] = 1, F[2] = 1, F[3] = 2, F[4] = 3,
 * F[5] = 5, F[6] = 8, F[7] = 13, F[8] = 21, F[9] = 34
 *
 */

public class Fibonacci 
{   
    private static final int NUMBER_OF_FIBONACCI_NUMBERS_TO_PRINT = 20;
    
    public static void main(String[] args)
    {
        for(int i = 0; i < NUMBER_OF_FIBONACCI_NUMBERS_TO_PRINT; i++)
        {
            System.out.println("Fibonacci [" + i + "] : " + getFibonacciNumber(i));               
        }
    }
    
    private static int getFibonacciNumber(int n)
    {
        if(n == 0)
            return 0;
        
        if(n == 1)
            return 1;
        
        return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);
    }
}