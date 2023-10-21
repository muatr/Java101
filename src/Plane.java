import java.util.Scanner;

public class Plane {
    public static void main(String[] args) {
        double total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in km : ");
        int dist = input.nextInt();
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        System.out.print("Enter journey type (1 => One Way , 2 => Return Trip ): ");
        int type = input.nextInt();

        if(!(age<=0 || !(type==1 || type==2) || dist<=0)){
            if(age>0 && age<12){
                total = dist*0.10 - dist*0.10*0.50;
            } else if(age>=12 && age<=24){
                total = dist*0.10 - dist*0.10*0.10;
            } else if(age>24 && age<=65){
                total = dist*0.10;
            } else if(age>65){
                total = dist*0.10 - dist*0.10*0.30;
            }

            if(type==2)
                total = 2*(total - total*0.20);

            System.out.println("\nTotal = "+total+" TL");
        }
        else System.out.println("\nYou Entered Incorrect Data !");
    }
}

