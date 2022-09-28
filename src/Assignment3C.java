//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment3C {
    public static void main(String[] args) {

        //import scanner and declare variables
        Scanner scan = new Scanner(System.in);
        String strUserDevice;
        String strUserBinary;
        int intUserSoftware;

        //first output and get input
        System.out.print("[App Checklist]\nWhat mobile device do you have? ");
        strUserDevice = scan.next();

        //checks that user enters either Android or Apple
        if (strUserDevice.equals("Android") || strUserDevice.equals("Apple")) {
            System.out.print("What version do you have? ");
            intUserSoftware = scan.nextInt();

            //determines ideal output
            if ((strUserDevice.equals("Android") && intUserSoftware >= 11) || (strUserDevice.equals("Apple") && intUserSoftware >= 12)) {
                System.out.println("Congratulations, you can run the app!");
            }

            //determines output for Android devices
            else if (strUserDevice.equals("Android")) {
                System.out.print("Does your device support Augmented Reality? ");
                strUserBinary = scan.next();

                //third if statement determining final output
                if (strUserBinary.equals("Yes") || strUserBinary.equals("yes")) {
                    System.out.println("Congratulations, you can run the app!");
                }
                else {
                    System.out.println("I'm sorry, our app does not support your device.");
                }
            }

            //determines output for Apple devices
            else {
                System.out.print("Does your device support Bluetooth connections? ");
                strUserBinary = scan.next();

                //third if statement determining final output
                if (strUserBinary.equals("Yes") || strUserBinary.equals("yes")) {
                    System.out.println("Congratulations, you can run the app!");
                }
                else {
                    System.out.println("I'm sorry, our app does not support your device.");
                }
            }

        }
        else {
            System.out.println("I'm sorry, our app does not support your device.");
        }

    }
}