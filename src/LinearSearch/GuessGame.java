package LinearSearch;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 number to be stored");
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the guessed number");
        int num = scan.nextInt();
        boolean status = false;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] == num) {
                status = true;
                break;
            }
        }
        if (status) {
            System.out.println("Second player won");
        } else {
            System.out.println("First player won");
        }
    }
}

