package Array;

import java.util.Scanner;

public class Array2D {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int [][] arr=new int[2][3];
        System.out.println("Enter the age of students");
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                arr[i][j]= scan.nextInt();
            }
        }
        System.out.println("Age of Students are: ");
        for (int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
