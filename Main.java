import java.util.Scanner; //imports java.util.Scanner library
public class Main{
    public static void main (String[] args)
    {
        int feet, inches, totalInches, femaleWeight, maleWeight; //declares the variables as integer
        double maleWeightRange, femaleWeightRange; //declares the variables as double
        
        Scanner keyboard = new Scanner( System.in );
        System.out.println( "This program will calculate the ideal weight for both a male and a female"); //print statement
        System.out.print("Enter the height in feet: "); //user input for height in feet
        feet = keyboard.nextInt(); //stores user input in feet variable
        System.out.print("Enter the height in inches: "); //user input for height in inches 
        inches = keyboard.nextInt(); //stores the input in inches variable
        System.out.println("You entered a height of " + feet + "' " + inches + "\""); //prints the input in a proper manner with feet and inches signs
        
        totalInches = feet*12 + inches; //calculates totalinches
        femaleWeight = 100 + (totalInches - 60) * 5; //calculates female weight
        maleWeight = 106 + (totalInches - 60) * 6; //calculates male weight
        
        femaleWeightRange = femaleWeight * 0.15; //calculate female weight in okay range
        maleWeightRange = maleWeight * 0.15; //calculate male weight in okay range
        
        System.out.println("The weight for a female is " + femaleWeight + " pounds."); //prints female weight
        System.out.println("The weight for a male is " + maleWeight + " pounds."); //prints male weight
        
        System.out.println("The okay weight range for a female is " + femaleWeightRange + " pounds."); //prints female weight in okay range
        System.out.println("The okay weight range for a male is " + maleWeightRange + " pounds."); //prints male weight in okay range
        
    }
}
