import java.util.Scanner;
public class arearectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length=scanner.nextInt();

        System.out.println("Enter the width of the rectangle");
        int width=scanner.nextInt();

        int arearectangle =findarea(length, width);
        System.out.println("Enter the area of the rectangle:" +arearectangle);

        scanner.close();   
    }
    public static int findarea(int length,int width) {
        return length *width;
        
    }
    
}
