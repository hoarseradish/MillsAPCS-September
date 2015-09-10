
/**
 * Converts Fahrenheit into Celsius
 * 
 * @author Gavin Moy
 * @version 9/9/15
 */
public class FtoC
{
    public static void main(String args[]) {
        //declare variables
        double fahrenheit; 
        double celsius;
        
        //calculate celsius
        fahrenheit = 80;  // enter fahrenheit here
        celsius = (fahrenheit - 32) * 5 / 9;
        
        // print resluts
        System.out.print("Fahrenheit: ");
        System.out.println(fahrenheit);
        System.out.print("Celsius: ");
        System.out.println(celsius);
        
    }
}
