//2.	Write a program to take Name and Age as input and print them

import java.util.Scanner;

public class printnm
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the name :");
        String name = s.nextLine();

        System.out.print("enter the age :");
        int age = s.nextInt();

        System.out.println("Name :"+name);
        System.out.println("Age: "+age);
    }
}