/* 
 * This class represents a recursive solution to the problem of finding
 * the reverse of a string. The recursive function in of itself
 * is not as efficient as it could be due to the unnecessary stack size
 * it creates with each entry into the function; however, the added
 * variables were added to add clarity as to how the function operates and
 * can be omitted to improve space efficiency.
 *
 * The recursive function could also be improved by combining the two
 * base conditions into one short-circuit Boolean expression; however,
 * we leave these two expressions as is in order to better emphasize
 * the two possible base cases of a string of one character and a 
 * string of zero characters.
 */

public class ReverseString 
{
    public static void main(String args[])
    {
        String stringToReverse = "Hello World!";
        System.out.println("Regular String: " + stringToReverse);
        System.out.println("Reversed String: " + reverseString("Hello World!"));
    }
    
    private static String reverseString(String stringToReverse)
    {
        if(stringToReverse.length() == 1)
            return stringToReverse;
        
        /* Needed to process an empty string */
        if(stringToReverse.length() == 0)
            return stringToReverse;
        
        char lastCharacter = stringToReverse.charAt(stringToReverse.length() - 1);
        String stringMinusLastCharacter = stringToReverse.substring(0, stringToReverse.length() - 1);
        
        return lastCharacter + reverseString(stringMinusLastCharacter);
    }
}