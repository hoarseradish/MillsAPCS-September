
/**
 * programming project 1
 * 
 * @author Gavin Moy
 * @version 9/21/15
 */
public class programming_project_1
{
    public static void main(String[] args) {
        for( int i=1; i<=7; i++) { // 7 lines
            for ( int j=i; j<=6; j++) { // number of stars decreases as lines#  increases
                System.out.print("*");
            }
            for ( int k=i; k>=1; k--) { // the number of spaces equals the line number
                System.out.print(" ");
            }
            for ( int l=i; l<=6; l++) { // the number of foward slash couples start at 6 and decrease each line
                doubleForward();
            }
            for ( int m=i; m>=1; m--) { //starts at 0 back slashes, a couple of backslashes added every line
                doubleBack();
            }
            for ( int n=i; n>=1; n--) { // starts at 1 space increases every line
                System.out.print(" ");
            }
            for ( int o=i; o<=6; o++) { // starts at 6 stars and decreases every line
                System.out.print("*");
            }
            System.out.println();
            
            
        }
        
    }
    public static void doubleForward() {
        System.out.print("//");
    }
    public static void doubleBack() {
        System.out.print("\\\\");
    }
    
}
    