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

    private static final Kata testRun = new Kata();

    public static void main(String[] args) {
        // showLikesOutput();
        // braceCheckerTest();
        spinWordsTest();
    }

    public static void test(boolean condition) {
        System.out.println(condition);
        assert condition;
    }

    public static void showLikesOutput() {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "Matt", "Matt", "Austin", "Ryan"));
    }


    /**
     * "(){}[]"   =>  True
     * "([{}])"   =>  True
     * "(}"       =>  False
     * "[(])"     =>  False
     * "[({})](]" =>  False
     */
    public static void braceCheckerTest() {
        System.out.println(testRun.braceChecker_isValid("(){}[]"));
        System.out.println(testRun.braceChecker_isValid("([{}])"));
        System.out.println(testRun.braceChecker_isValid("(}"));
        System.out.println(testRun.braceChecker_isValid("[(])"));
        System.out.println(testRun.braceChecker_isValid("[({})](]"));
        // custom
        System.out.println(testRun.braceChecker_isValid("{{}([{()[]}])}"));
    }

    public static void spinWordsTest() {
        test(testRun.spinWords("emocleW").equals("Welcome"));
        test(testRun.spinWords("Hey wollef sroirraw").equals("Hey fellow warriors"));
        test(testRun.spinWords("This is a test").equals("This is a test"));
        test(testRun.spinWords("This is another test").equals("This is rehtona test"));
    }
}
