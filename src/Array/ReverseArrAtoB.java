package Array;

import java.util.Scanner;

public class ReverseArrAtoB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers to reverse");
        int[] arr1 = new int[5];
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println("Elements of original array");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nElemets of reversed array");
        int[] arr2 = new int[arr1.length];
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = arr1[i];
            System.out.print(arr2[i] + " ");
        }

    }
}
