package lesson20;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Person>people = Loader.load();
    }
}
