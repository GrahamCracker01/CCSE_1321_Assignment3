//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment3A {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intAnswer;

        //first output and get input
        System.out.println("[Epic Quest Simulator]\nHello stranger! Do you have time to hear my tale?\n1) Yes\n2) No");
        intAnswer = scan.nextInt();

        //first level if statement
        if (intAnswer == 1) {
            System.out.println("Thank you! I come from the land of Pax Bisonica. Our country has been taken over by a cruel tyrant!\n1) That's awful!\n2) What can I do?");
            intAnswer = scan.nextInt();

            //second level if statement
            if (intAnswer == 1) {
                System.out.println("Alas, it is truly terrible...");
            }
            System.out.println("Please, you must journey to Pax Bisonica and free our country!\n1) Yes\n2) No");
            intAnswer = scan.nextInt();

            //third if statement, but still second level
            if (intAnswer == 1) {
                System.out.println("Hooray!");
            }
            else {
                System.out.println("Then all is lost...");
            }
        }
        else {
            System.out.println("Ah, then goodbye...");
        }

    }
}