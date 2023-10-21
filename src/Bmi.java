import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in meters : ");
        double height = input.nextDouble();
        System.out.print("Enter your weight : ");
        double weight = input.nextDouble();
        double result = weight / (height*height);
        System.out.println("Your Body Mass Index : "+result);
    }
}
