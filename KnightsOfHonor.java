package EXERCISE;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split("\\s+");
        Consumer<String> knights = name -> System.out.println("Sir " + name);
        for (var name : names) {
            knights.accept(name);
        }
    }
}
