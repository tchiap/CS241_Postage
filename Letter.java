/**
 * Tom Chiapete
 * November 1, 2005
 * CSCI 241
 * Project Postage
 * Class Letter
 * 
 * This class has a default constructor weight initially set 
 * to 0.0.
 * The user can read in the weight with the readWeight() method.
 * The user can then calcuate the postage based on the weight 
 * by calling the calculatePostage() method.
 * 
 * Imports java.util to use Scanner Class.
 * 
 * Known bugs:  None.
 */

import java.util.*;

public class Letter
{
    private double weight; // the letters weight in ounces
    
    /**
     * Letter() default constructor
     * Sets weight to 0.0
     */
    public Letter()
    {
        weight = 0.0;
    }
    
    /**
     * readWeight() method.
     * Reads in the weight with the Scanner class.
     * Sets the local variable to the instance variable.
     */
    public void readWeight()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Weight:  ");
        double w = input.nextDouble();
        weight = w;
    }
    
    /**
     * calculatePostage() method
     * Calculates postage based on given weight.
     * If the weight in ounces is less than or equal to one ounce,
     * the postage is 0.37.
     * If it's more than that, bump any fraction of an ounce to the 
     * next ounce, and calcuate.  Any extra ounces is 0.23 extra.
     * Return the cost value.
     */
    public double calculatePostage()
    {
        int extraOunces = (int)Math.ceil(weight - 1.0);
        if (weight <= 1.0)
            return 0.37;
        else
            return 0.37 + (extraOunces * 0.23);          
    }
}
