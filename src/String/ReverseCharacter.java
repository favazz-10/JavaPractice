package String;

import java.util.Scanner;

class ReverseString{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=scan.nextLine();
        System.out.println("Original String= "+s1);
        char [] arr=s1.toCharArray();
        System.out.print("Reversed String= ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);

        }
    }
}