package Shuler.Willie.SumofNumbers;

import java.util.Scanner;

/**
 * Created by willieshuler on 9/9/16.
 */
public class SumofNumbers {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner user_input = new Scanner(System.in);
        int input = user_input.nextInt();

        int sum = 0;
        for(int i=1; i <= input; i++){

            sum = sum + i;
        }

        System.out.println("The sum of numbers from 1 to n: " + sum);

    }
}
