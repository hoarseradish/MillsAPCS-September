
/**
 * Write a description of class trees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trees
{
    public static void main(String[] args) {
        writeTree(1,7);
        writeTree(5,6);
        writeTree(4,3);
        writeTree(3,4);
        writeTree(6,8);
        writeTree(4,9);
        writeTree(4,4);

    }
    public static void writeTree( int x, int y) { //x = segments, y = height
        int z = y;
        for (int i= 1; i<=x ; i++, y++) {
            for (int j=i; j<=y; j++) {
                for (int k=j; k<=(x+z); k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int l=j; l>1; l--) {
                    doubleStar();
                }
                System.out.println();
            }

        }
        for (int n=1 ; n<=2; n++) {
            for (int m= 1; m<= x+z; m++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int o=1; o<=((x+z)-3); o++){
            System.out.print(" ");
        }
        System.out.println("*******");
    }

    public static void doubleStar() {
        System.out.print("**");
    }

}
