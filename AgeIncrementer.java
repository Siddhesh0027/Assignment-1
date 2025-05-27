//4.	Write a program to take Age as input, increment it by 1, and print the result

import java.util.Scanner;

public class AgeIncrementer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        int incrementedAge = age + 1;

        System.out.println("Your age next year will be: " + incrementedAge);

        scanner.close();
    }
}