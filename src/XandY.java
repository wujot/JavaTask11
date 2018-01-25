import java.util.Scanner;

public class XandY {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Type X: ");
        x = sc.nextInt();
        System.out.println("Type Y: ");
        y = sc.nextInt();

        sc.close();

        if(x < 0 && y > 0) {
            System.out.printf("Point (%d, %d) is placed on a II quarter of coordinate system.", x, y);
        }else if(x > 0 && y > 0) {
            System.out.printf("Point (%d, %d) is placed on a I quarter of coordinate system.", x, y);
        }else if(x < 0 && y < 0) {
            System.out.printf("Point (%d, %d) is placed on a III quarter of coordinate system.", x, y);
        }else
            System.out.printf("Point (%d, %d) is placed on a IV quarter of coordinate system.", x, y);
    }
}
