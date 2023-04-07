/**
 * Tom Chiapete
 * November 1, 2005
 * CSCI 241
 * Project Postage
 * Class PriorityParcel
 * 
 * This class has a default constructor with weight being set 
 * to 0.0 and zone being set to 0.
 * The user can change the zone by calling readZone() method.
 * The user can change the weight by calling readWeight() method.
 * Finally, to calculate total postage cost, call the
 * calculatePostage() method.
 * 
 * Imports java.util to use Scanner Class.
 * 
 * Known bugs:  None.
 */

import java.util.*;
public class PriorityParcel
{
    private double weight; // weight of parcel
    private int zone; // the zone number it is to be shipped

    /** 
     * CalculatePostage() constructor
     * Sets weight to 0.0 and zone to zero.
     */
    public PriorityParcel()
    {
        weight = 0.0;
        zone = 0;
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
     * readZone() method.
     * Reads in the zone with the Scanner class.
     * Sets the local variable to the instance variable.
     */
    public void readZone()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Zone (1-8):  ");
        int w = input.nextInt();
        zone = w;
    }
    
    /** 
     * calculatePostage() method
     * This will calculate the postage for a priority parcel.
     * If the weight is below 1.0, always return 3.85.
     * Otherwise if the weight is greater than 1 and 
     * less than or equal to 2, use a switch statement using 
     * the zone to figure out the cost.
     * Otherwise, notify user we can't do anything over 2.
     */
    public double calculatePostage()
    {
        double cost = 0.0; // cost local variable used for returns.
        if (weight <= 1.0)
            return 3.85;
        else if (weight > 1 && weight <= 2)
        {
            switch(zone)
            {
                case 1: cost = 3.95; break;
                case 2: cost = 3.95; break;
                case 3: cost = 3.95; break;
                case 4: cost = 4.55; break;
                case 5: cost = 4.90; break;
                case 6: cost = 5.05; break;
                case 7: cost = 5.40; break;
                case 8: cost = 5.75; break;
                default: System.out.println("Invalid Zone");
            }
            return cost; // returns cost.
        }
        else // if weight is greater than 2
        {
            System.out.println("Error: Please enter a weight "+
            "greater than 0 and less than or equal to 2.");   
        }
        return 0.0; // We have to return something, 
                    // even though our data doesn't help us.
    }
}
