package se.lexicon;
// Yearly (100%!=0 and 4%=0)
// Century (100%=0 and 400%=0)

// The Scanner class is used to get user input, and it is found in the java.util package.

// Example: 1980 is a leap year

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = scan.nextInt();

        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println(year+" is a leap year.");
        }
        else {
            System.out.println(year+" is not a leap year.");
        }
    }
}