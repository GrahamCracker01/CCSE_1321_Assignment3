//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment3B {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intGrade;

        //first output and get input
        System.out.print("[Martial Arts Belt]\nWhat belt grade are you? ");
        intGrade = scan.nextInt();

        //switch statement determining response
        switch (intGrade) {
            case 10:
                System.out.println("You have a white belt,\nwith 0 stripes!");
                break;
            case 9:
                System.out.println("You have a white belt,\nwith 1 stripe!");
                break;
            case 8:
                System.out.println("You have a yellow belt,\nwith 1 stripe!");
                break;
            case 7:
                System.out.println("You have a yellow belt,\nwith 2 stripes!");
                break;
            case 6:
                System.out.println("You have a blue belt,\nwith 1 stripe!");
                break;
            case 5:
                System.out.println("You have a blue belt,\nwith 2 stripes!");
                break;
            case 4:
                System.out.println("You have a green belt,\nwith 1 stripe!");
                break;
            case 3:
                System.out.println("You have a green belt,\nwith 2 stripes!");
                break;
            case 2:
                System.out.println("You have a brown belt,\nwith 1 stripe!");
                break;
            case 1:
                System.out.println("You have a brown belt,\nwith 2 stripes!");
                break;
            case 0:
                System.out.println("You have a black belt,\nwith 0 stripes!");
                break;
            default:
                System.out.println("You have no belt...");
                break;
        }


    }
}