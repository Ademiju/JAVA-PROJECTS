package chapterTwo;

import java.util.Scanner;

public class DigitSeparator {
    /* 2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user,
separates the number into its individual digits and prints the digits separated from one another by three spaces each.
For example, if the user types in the number 42339, the program should print 4   2   3   3   9
Assume that the user enters the correct number of  digits.
What happens when you enter a number with more than five digits?
What happens when you enter a number with fewer than five digits?
[Hint: It’s possible to do this exercise with the techniques you learned in this chapter.
You’ll need to use both division and remainder operations to “pick off” each digit.]

ANSWER: */

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a five-digits number ");

        int number = input.nextInt();

        int fifthNumber = number%10;
        int firstRemainder = number/10;
        int fourthNumber = firstRemainder%10;
        int secondRemainder = firstRemainder/10;
        int thirdNumber = secondRemainder%10;
        int thirdRemainder = secondRemainder/10;
        int secondNumber = thirdRemainder%10;
        int firstNumber = thirdRemainder/10;
        System.out.printf("%d\t%d\t%d\t%d\t%d", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
    }


}

// When you enter more than five digits, the application reads the digit(s) before the last four digits as one whole number
//and prints them together
//
//When you enter numbers fewer than five digits, the application adds Zero infront of your entered digit
//to make up for the missing digit(s).