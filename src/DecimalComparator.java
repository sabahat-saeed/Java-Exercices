/**************************************************** CODE EXERCISE 6: LeapYear *****************************************************************
 DecimalComparator
 Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

 The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.



 EXAMPLES OF INPUT/OUTPUT:

 areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

 areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

 areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

 areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.



 TIP: Use paper and pencil.

 TIP: Use casting.

 NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static ​like we have been doing so far in the course.
 NOTE: Do not add a  main method to solution code.

 */

 public class DecimalComparator {
  public static void main(String[] args) {
   double num1 = 1.234567;
   double num2 = 1.235823;

   boolean areEqual = compareToThreeDecimalPlaces(num1, num2);
   System.out.println("Are the numbers equal up to 3 decimal places? " + areEqual);
 }

 public static boolean compareToThreeDecimalPlaces(double num1, double num2) {
  int factor = 1000; // 10^3 for 3 decimal places

  int num1Rounded = (int) Math.round(num1 * factor);
  int num2Rounded = (int) Math.round(num2 * factor);

  return num1Rounded == num2Rounded;
 }
}
