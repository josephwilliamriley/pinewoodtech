import java.util.Scanner;  // Import the Scanner class

/**
 * A class that takes an input string and reverses it's character order.
 * Written for Pinewood Technologies as part of my application.
 *
 * @author Joe Riley
 * @version 05/10/2020
 */
public class Pinewood
{
    // instance variables
    private String input;

    /**
     * Constructor for objects of class Pinewood
     */
    public Pinewood()
    {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a string:"); // Prompt user for input
        input = userInput.nextLine(); // Read user input
        System.out.println(reverseString(input));
    }

    /**
     * A method that reverses the input string
     *
     * @param  x  The input string
     * @return    The character reverse of a string
     */
    public String reverseString(String x)
    {
        String reverse = ""; // Initialize reverse
        for(int i = x.length() - 1; i >= 0; i--) // Cycle through each char of string
        {
            reverse = reverse + x.charAt(i); // Add character to reverse
        }
        return reverse;
    }
}
