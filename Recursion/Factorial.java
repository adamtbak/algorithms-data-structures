/*
 * This class calculates the factorial of a number using recursion.
 *
 * The factorial of a number n, is defined by the following formula:
 * n! = n * (n-1) * (n-2) * ... * 1
 * 
 * We are also able to define n! using the following recursive formula:
 * n! = n * (n-1)!
 *
 * One thing to bear in mind, is that the factorial is defined for 0,
 * hence, we have: 0! = 1. 
 *
 * The first 5 factorials are given as follows:
 * 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24, 5! = 120
 *
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
    
    private static long factorial(long n)
    {
        if(n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }    
}
