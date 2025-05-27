//3.	Write a program to take User ID as input and print Jake's name & age if the ID matches.
import java.util.Scanner;

public class printnm2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter id:");
        int id = s.nextInt();

        if(id == 777)
        {
            System.out.println("Name :Jack");
            System.out.println("Age: 26");
        }
        else{
            System.out.println("id not found");
        }
    }
}