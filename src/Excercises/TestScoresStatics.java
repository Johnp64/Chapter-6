package Excercises;

import java.util.Scanner;

public class TestScoresStatics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numOfEntries = -1;
        int high = 0;
        int low = 0;
        int avg;
        int scoreTotal = 0;
        int userEntry = 0;

        while (userEntry != 999) {

            System.out.println("Please enter a test score >>>");
            userEntry = input.nextInt();

            if (userEntry > high){
                high = userEntry;
            }
            else if(userEntry < low ){
                low = userEntry;
            }
            else if (userEntry >=999 ){
                System.out.println("Error");
            }


            numOfEntries++;
            scoreTotal = scoreTotal + userEntry;

        }
        scoreTotal = scoreTotal -999;
        System.out.println("Score Results");
        System.out.println("The number of tests: " + numOfEntries);
        System.out.println("Highest score: " + high);
        System.out.println("Lowest score: " + low);
        System.out.println("The average scores is: " + scoreTotal/numOfEntries);


    }
}