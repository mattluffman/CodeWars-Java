package codewars;

import static codewars.Kata.whoLikesIt;

/**
 * main method for testing some kata output
 *
 * @author Matt Luffman
 * Date: 5/6/2021
 * Time: 9:33 PM
 */
public class Runner {

    public static void main(String[] args) {
        showLikesOutput();
    }

    public static void showLikesOutput() {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "Matt", "Matt", "Austin", "Ryan"));
    }
}