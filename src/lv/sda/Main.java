package lv.sda;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        scan.close();
        int sum = IntStream.of(numbers).sum();
        float average = sum / numbers.length;
        System.out.println("The average from your 10 numbers is: " + average);


    }
}
