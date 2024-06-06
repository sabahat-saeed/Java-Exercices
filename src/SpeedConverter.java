
/**************************************************** CODE EXERCISE 2: SPEED CONVERTER *****************************************************************

 Description:
 First Method: Write a method called toMilesPerHour that has one parameter of type double with the name kilometersPerHour.

 This method needs to return a value of type long, which is the result of converting kilometers per hour to miles per hour.
 If the parameter kilometersPerHour is less than 0, the method toMilesPerHour should return -1 to indicate an invalid value.
 Otherwise, if the parameter is positive, calculate the value of miles per hour, round it, and return it.
 Second Method: Write another method called printConversion with one parameter of type double with the name kilometersPerHour.

 This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
 Then, it needs to print a message in the format "XX km/h = YY mi/h".
 XX represents the original value kilometersPerHour.
 YY represents the rounded milesPerHour from the kilometersPerHour parameter.
 If the parameter kilometersPerHour is less than 0, print the text "Invalid Value".
 Use the method Math.round to round the number of calculated miles per hour (double). The method should return long.
 Do not add a main method in this code.
 All methods should be defined as public static.
 Note: 1 mile per hour is equal to 1.609 kilometers per hour.
 /*************************************************************************************************/

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour<0){

            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);

    }
    public static void printConversion(double kilometersPerHour){

        if(kilometersPerHour<0){

            System.out.print("Invalid Value");
            return;

        }else{

            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");

        }
    }

}
