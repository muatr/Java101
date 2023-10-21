import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int size;
        do {
            System.out.print("Enter matrix size larger than 1: ");
            size = input.nextInt();
        } while (size <= 1);
        String[][] arr = new String[size][size];
        String[][] arr2 = new String[size][size];

        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                arr[i][j] = " - ";
                arr2[i][j] = " - ";
            }
        }

        for(int i = 0; i<size*size/4; i++){
            int rand_row = rand.nextInt(size);
            int rand_col = rand.nextInt(size);
            if(!arr[rand_row][rand_col].equals(" * ")){
                arr[rand_row][rand_col] = " * ";
            }
            else i--;
        }

        System.out.println("Location of Mines");
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\n = = = = = ");
        System.out.println("Welcome to Mine Sweeper Game!");
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\n = = = = = \n");

        int noBoom = 0;
        int row, col;
        do {
            System.out.print("Enter the row index: ");
            row = input.nextInt();
            System.out.print("Enter the column index: ");
            col = input.nextInt();
            System.out.println("");
        } while(row<0 || row>size-1 || col<0 || col>size-1);
        noBoom++;

        int count1 = 0;
        while(!arr[row][col].equals(" * ") && noBoom<size*size-size*size/4) {
            int count = 0;
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i == 0 && j == 0) continue;
                    if (row + i >= 0 && row + i < arr.length && col + j >= 0 && col + j < arr[0].length) {
                        if (arr[row + i][col + j].equals(" * ")) count++;
                    }
                }
            }
            arr[row][col] = " " + count + " ";
            arr2[row][col] = " " + count + " ";

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(arr2[i][j]);
                }
                System.out.println("");
            }

            System.out.println("");
            do {
                System.out.print("Enter the row index: ");
                row = input.nextInt();
                System.out.print("Enter the column index: ");
                col = input.nextInt();
                System.out.println("");
            } while(row<0 || row>size-1 || col<0 || col>size-1 || !arr2[row][col].equals(" - "));

            noBoom++;
            count1 = count;
        }

        if(arr[row][col].equals(" * ")) System.out.println("Game Over :(");
        else{
            System.out.println("Good Job :)");
            arr[row][col] = " " + count1 + " ";
            arr2[row][col] = " " + count1 + " ";
        }

        System.out.println("Location of Mines");
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
