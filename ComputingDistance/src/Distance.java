// ************************************************************
// Distance.java
//
// Computes the distance between two points
// ************************************************************
import java.util.Scanner;
public class Distance
{
    public static void main (String[] args)
    {
        double x1, y1, x2, y2; // coordinates of two points
        double distance; // distance between the points
        double deltX; // change in X power 2
        double deltY; // change in Y power 2
        
        
        Scanner scan = new Scanner(System.in);
        
        // Read in the two points
        System.out.print ("Enter the coordinates of the first point " +
                "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.print ("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        deltX = Math.pow(x1-x2, 2);
        deltY = Math.pow(y1-y2, 2);
        distance = Math.sqrt(Math.abs(deltX + deltY));
        System.out.println("The distance between these points is: " + distance);
                
                
        
        
       
    }}
        // Compute the distance
        // Print out the answer