/**
 * Tom Chiapete
 * November 1, 2005
 * CSCI 241
 * Project Postage
 * Class Postcard
 * 
 * This class has a default constructor with width and height 
 * being set to 0.0.
 * The user can call readWidth() and readHeight() methods if they 
 * would like to change the width and height instance variables.
 * Finally, to calculate cost, user can call calculateCost()
 * 
 * Imports java.util to use Scanner Class.
 * 
 * Known bugs:  None.
 */

import java.util.*;
public class Postcard
{

    private double width; // postcard width
    private double height; // postcard height

    /**
     * Postcard() default constructor
     * Set width and height to both 0.0.
     */
    public Postcard()
    {
        width = 0.0;
        height = 0.0;
    }
    
    /**
     * readWidth() method
     * Reads in width with Scanner class.
     * Sets local variable to instance variable.
     */
    public void readWidth()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Width:  ");
        double w = input.nextDouble();
        width = w;
    }
    
    /**
     * readHeight() method
     * Reads in the height with the Scanner class.
     * Sets the local variable to instance variable.
     */
    public void readHeight()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Height:  ");
        double h = input.nextDouble();
        height = h;
    }
    
    /**
     * calculatePostage() method
     * If the width is greater than 6 or height is greater than
     * 4.5, the cost of postage is 0.37.
     * Otherwise, the cost of postage is 0.23.
     * Return that value as a double.
     */
    public double calculatePostage()
    {
        if (width > 6 || height > 4.5)
            return 0.37;
        return 0.23;
    }
}
