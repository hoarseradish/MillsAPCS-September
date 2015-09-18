
/**
 * outputs an hourglass using forloops 
 * 
 * @author Gavin Moy
 * @version 9/18/15
 */
public class hourglass
{
    public static void main(String[] args) {
        top();
        for (int i = 1; i<=4; i++){ // loops 4 times to createthe top triangle
            for (int j = i; j >= 1; j--) { // counts down so it will loop for the number of i
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int k = i; k <= 4; k ++) { // counts up so that as i increases, the number of colons decreases
                doubleColon();
            }
            System.out.println("/");
        }
        System.out.println("     ||");
        for (int l = 1; l <= 4; l++) { // loops 4 times to create the bottom triangle
            for (int m = l; m <= 4; m++) {  // counts up so that as l incraes, the number of spaces decreases
                System.out.print(" ");
            }
            System.out.print("/");
            for ( int n = l; n >= 1; n--) { // counts down so that number of colons increases as l increases 
                doubleColon();
            }
            System.out.println("\\");
        }
        top();

    }

    public static void doubleColon() { //two colons because each layer is in a multiple of 2 colons
        System.out.print("::");
    }

    public static void top()  { //the top and bottom of the hourglass
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
    }
}

