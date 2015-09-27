
/**
 * Write a description of class trees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trees
{
    public static void main(String[] args) {
        writeTree(3,4);
        writeTree(2,5);

       
    }

    public static void writeTree( int x, int y) { //x = segments, y = height
        for (int i= 1; i<=x ; i++ ) {
            for (int j=i; j<=y; j++) {
                for (int k=j; k<=5; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int l=j; l>1; l--) {
                    doubleStar();
                }
                System.out.println();
            }

        }
        bottom();
    }

    public static void doubleStar() {
        System.out.print("**");
    }

    public static void bottom() {
        System.out.println("     *");
        System.out.println("     *");
        System.out.println("  *******");
        System.out.println();

    }
}
