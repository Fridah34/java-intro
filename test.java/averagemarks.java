import java.util.Scanner;

public class averagemarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Subject 1:");
        double Subject1 = scanner.nextDouble();

        System.out.println("Enter marks for Subject 1:");
        double Subject2 = scanner.nextDouble();

        System.out.println("Enter marks for Subject 1:");
        double Subject3 = scanner.nextDouble();


        double average=(Subject1 + Subject2 +Subject3) /3;
        System.out.println("Average Marks:" + average);

        if(average>=90){
            System.out.println("Grade: A(Excellent)");
        }else if(average<=80){
            System.out.println("Grade: B(Good)");
        }else if(average>=70){
            System.out.println("Grade: C(Average)");
        }else if(average>=60){
            System.out.println("Grade: D(Below Average)");
        }else {
            System.out.println("Grade: F(Fail)");
        }

    }
    
}
