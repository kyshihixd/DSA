//********************************************************************
//  GasMileage.java       Author: Lewis/Loftus
//
//  Demonstrates the use of the Scanner class to read numeric data.
//********************************************************************

import java.util.Scanner;

public class GasMileage {
   // -----------------------------------------------------------------
   // Calculates fuel efficiency based on values entered by the
   // user.
   // -----------------------------------------------------------------
   public static void main(String[] args) {
      String car1, car2;
      double miles1, miles2;
      double gallons1, gallons2, mpg1, mpg2;

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the car, miles, gallons for the first car: ");
      car1 = scan.next();
      miles1 = scan.nextDouble();
      gallons1 = scan.nextDouble();

      System.out.print("Enter the car, miles, gallons for the second car: ");
      car2 = scan.next();
      miles2 = scan.nextDouble();
      gallons2 = scan.nextDouble();

      mpg1 = miles1 / gallons1;
      mpg2 = miles2 / gallons2;

      System.out.println("Miles Per Gallon for car " + car1 + ": " + mpg1);
      System.out.println("Miles Per Gallon for car " + car2 + ": " + mpg2);
   }
}
