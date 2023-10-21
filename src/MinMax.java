import java.util.Scanner;
public class MinMax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? : ");
        int N = input.nextInt();
        int i = 0;
        int num, minNum, maxNum;

        System.out.print("Enter number "+(i+1)+" : ");
        num = input.nextInt();
        maxNum = num;
        minNum = num;

        while(i<N-1){
            System.out.print("Enter number "+(i+2)+" : ");
            num = input.nextInt();
            if(num>maxNum){
                maxNum = num;
            }
            if(num<minNum){
                minNum = num;
            }
            i++;
        }
        System.out.println("The largest number : "+maxNum);
        System.out.println("The smallest number : "+minNum);
    }
}

