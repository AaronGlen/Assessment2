package src.main.java.com.qa;

import src.main.java.com.qa.BoardTest;
import src.main.java.com.qa.Movement;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static boolean answer = true;
    public static double distanceTotal = 0;
    public static double distanceX = 0;
    public static double distanceY = 0;


    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("enter your name");
        String name = id.nextLine();


        Scanner boardSize = new Scanner(System.in);
        System.out.println("enter table size (integer pls): ");
        int bs = boardSize.nextInt();
        BoardTest play = new BoardTest(bs);
        Movement p1 = new Movement();



        System.out.println("hello " + name);
        System.out.println("you appear to be looking for some treasure");
        System.out.println("don't worry i'll help you out");
        System.out.println("we can only head: north, south, east and west, 1 metre at a time");
        System.out.println("i'll keep you up to date with how far we are from the treasure");



        while (answer) {
            System.out.println("which direction would you like to go:");
            System.out.println("1 - north");
            System.out.println("2 - south");
            System.out.println("3 - east");
            System.out.println("4 - west");
            System.out.println("5 - end game");

            Scanner options = new Scanner(System.in);
            System.out.println("Please enter direction " + name);
            int choice = options.nextInt();


            switch (choice) {
                case 1:
                    p1.north(bs);
                    break;
                case 2:
                    p1.south(bs);
                    break;
                case 3:
                    p1.east(bs);
                    break;
                case 4:
                    p1.west(bs);
                    break;
                case 5:
                    System.out.println("oh well, have a nice day " + name + " maybe next time");
                    answer = false;
                    break;
                default:
                    System.out.println("uh oh");


            }


            distanceX = ((p1.getXPostionPlayer() - play.getXTresure())+bs) % bs;
            double distanceXSquared = distanceX * distanceX;
            distanceY = ((p1.getYPostionPlayer() - play.getYTresure())+bs) % bs;
            double distanceYSquared = distanceY * distanceY;
            distanceTotal = (int) Math.sqrt((distanceXSquared) + (distanceYSquared));

            if (distanceX == 0 && distanceY == 0) {
                System.out.println("we did it we found the treasure, well done " + name);
                System.out.println("the treasure was at x: "+play.getXTresure()%bs+" y: "+play.getYTresure()%bs);
                answer = false;
            } else {

                System.out.println("you are " + distanceTotal + "m away from the treasure " + name);
                System.out.println("we are: "+distanceX+"m away, on the x-axis");
                System.out.println("we are: "+distanceY+"m away, on the y-axis");
            }


        }
    }
}
