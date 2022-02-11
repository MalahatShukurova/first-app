package lesson21;

import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İki eded daxil edin:");

        String input = scanner.next();
        String input1 = scanner.next();
        int number = 0;
        try {
            number = Integer.parseInt(input);
            number = Integer.parseInt(input1);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }






}}