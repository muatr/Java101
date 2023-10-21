import java.util.Scanner;
public class Prime {
    static void isPrime(int num, int div){
        if (num<2){
            System.out.println(num+" is not PRIME !");
        }
        else if (div==1){
            System.out.println(num+" is PRIME !");
        }
        else {
            if (num%div==0){
                System.out.println(num+" is not PRIME !");
            }
            else {
                isPrime(num, div-1);
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        isPrime(num, num/2);

    }
}
