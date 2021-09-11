package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("what is the input string?");
        String input = in.nextLine();
        System.out.println(input + " has " + input.length()+ " characters");

    }
}
