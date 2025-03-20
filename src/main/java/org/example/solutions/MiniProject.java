package org.example.solutions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MiniProject {

    public static void guessTheNumber() {

        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.println("guess my number");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("correctnumber");
                break;

            } else if (userNumber > myNumber) {
                System.out.println("number large");
            }
            else {
                System.out.println("number too small");
            }

        } while (userNumber >= 0);

        System.out.println("my number was:" + myNumber);
    }
}
