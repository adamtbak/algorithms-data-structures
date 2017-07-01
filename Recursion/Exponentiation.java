/*
 * This class calculates the exponentiation of a number, in other words,
 * it calculates the value of the expression, x raised to the power or n,
 * written also as x^n.
 *
 * The recursive formula for the x^n is given by:
 * x^n = x * x^(n-1)
 *
 */

public class Exponentiation 
{
    public static void main(String[] args)
    {
        /* We create a table of values of 2^0 to 2^10 */
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("2^" + i + " : " + exp(2, i));
        }        
    }
   
    private static long exp(int x, int n)
    {
        if(n == 0)
            return 1;
        else
            return x * exp(x, n - 1);
    }    
}
