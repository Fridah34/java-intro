import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius=scanner.nextDouble();

        double area = findarea(radius);
        System.out.println("The area of the circle is:"+ area);

        scanner.close();
       
    }
    public static double findarea(double radius){
       
        return Math.PI * radius * radius ;
        
    }
    
}
