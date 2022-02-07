package lesson4;

import java.util.Random;
import java.util.Scanner;

public class RandomEx {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Welcome " + name);
        Random rnd = new Random();
        int x = rnd.nextInt(101);
//        System.out.println(x);
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        while (x != y) {
            if (y < x)
                System.out.println("Your number is too small. Please, try again.");
            else
                System.out.println("Your number is too big. Please, try again.");
            sc = new Scanner(System.in);
            y = sc.nextInt();
        }
      //  System.out.println("Congratulations, "+ name+ "!");
        System.out.println(String.format("Congratulations %s!",name));;


    }


}
