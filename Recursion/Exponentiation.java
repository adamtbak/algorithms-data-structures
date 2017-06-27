/*
 * This class implements the logic necessary to calculate an exponent expression.
 * For example, we are able to calculate the value x^n, where x and n are
 * both integers. This class implements recursion to create a solution.
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
    
    /* This method uses recursion to calculate the value x^n */
    private static long exp(int x, int n)
    {
        if(n == 0)
            return 1;
        else
            return x * exp(x, n - 1);
    }    
}
