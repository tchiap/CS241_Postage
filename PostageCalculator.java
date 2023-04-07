/**
 * Tom Chiapete
 * November 1, 2005
 * CSCI 241
 * Project Postage
 * Class PostageCalculator
 * 
 * This class just has a main method and asks the client what type of parcel they have so
 * we can calculate the postage for them.
 * The user types in what they want, and this program will create the correct object to 
 * calcuate the correct postage cost.
 * 
 * Imports java.util to use Scanner Class.
 * 
 * Known bugs:  None.
 */

import java.util.*;
public class PostageCalculator
{
    /**
     * main() method
     * Asks user which what type of parcel they have.  This program will create the 
     * correct object to ask for input that the given class needs.
     * If the user enters anything other than postcard, letter or parcel, tell them 
     * in a form of an error message.
     */
    public static void main(String [] args)
    {
        // Ask for type.  Save input to String type.
        System.out.println("Postage Calculator");
        System.out.println("==============================");
        System.out.println();
        System.out.println("Please enter in type-");
        System.out.print("Choose from:  ");
        System.out.println("postcard, letter or parcel");
        System.out.print(">> ");
        Scanner input = new Scanner(System.in);
        String type = input.next();
        System.out.println();
        System.out.println();
        
        // If it's a letter, ask for width, calculate cost.
        if (type.equals("letter"))
        {
            System.out.println("--SEND A LETTER--");
            Letter lt = new Letter();
            lt.readWeight();
            double letterCost = lt.calculatePostage();
            System.out.println("Postage Cost: "+letterCost);
            System.out.println();
            System.out.println();
        }
        
        // If it's a postcard, ask for width and height, and calculate cost.
        else if (type.equals("postcard"))
        {
            System.out.println("--SEND A POSTCARD--");
            Postcard pc = new Postcard();
            pc.readWidth();
            pc.readHeight();
            double pcCost = pc.calculatePostage();
            System.out.println("Postage Cost: "+pcCost);
            System.out.println();
            System.out.println();
        }
        
        // If it's a priority parcel, ask for weight and zone, and calculate cost.
        else if (type.equals("parcel"))
        {
            System.out.println("--SEND PRIORITY MAIL PARCEL--");
            PriorityParcel pp = new PriorityParcel();
            pp.readWeight();
            pp.readZone();
            double ppCost = pp.calculatePostage();
            System.out.println("Postage Cost: "+ppCost);
            System.out.println();
            System.out.println();
        }
        
        // Else, error message.
        else
        {
            System.out.println("Invalid type.");   
        }
    }
}
