package Array;

import java.util.Scanner;

class CopyArrAtoB{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int [] arr1=new int[5];
        System.out.println("Enter 5 number to store and copy");
        for(int i=0;i<= arr1.length-1;i++){
            arr1[i]=scan.nextInt();
        }
        System.out.println("Elements of original array");
        for (int i=0;i<= arr1.length-1;i++){
            System.out.print(arr1[i]+"");

        }
        int [] arr2=new int[arr1.length];
        System.out.println("\nElements of new array");
        for (int i=0;i<=arr2.length-1;i++){
            arr2[i]=arr1[i];
            System.out.print(arr2[i]+" ");

        }
    }
}