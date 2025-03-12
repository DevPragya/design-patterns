package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;
import org.example.solutions.PrefixSum;

public class Main {

    private enum DesignPatterns {
        PREFIX_SUM,
        LINKED_LIST
    }

    private static DesignPatterns currentChoice = DesignPatterns.LINKED_LIST;

    public static void main(String[] args) {
        switch(currentChoice) {
            case PREFIX_SUM -> callPrefixSum();
            case LINKED_LIST -> call2();
        }
    }

    private static void callPrefixSum() {
        //For taking input
        Scanner scanner = new Scanner(System.in);

        //Step 1: Take array input
        System.out.println("Enter the size of array");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++)
        {
            array[i] = scanner.nextInt();
        }

        //Step 2: Take the subarray range
        System.out.println("Enter the start index");
        int start = scanner.nextInt();
        System.out.println("Enter the end index");
        int end = scanner.nextInt();


        //Step 3: Call the method to find the sum
        PrefixSum prefixSum = new PrefixSum();
        int result = prefixSum.findSubarraySum(array, start, end);


        //Step 4: Print the result
        if (result != -1) {
            System.out.println("The sum of the subarray is " + result);
        }

        scanner.close();
    }

    private static void call2() {
        System.out.println("I am in call2");
    }
}



