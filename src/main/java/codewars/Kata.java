package codewars;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.Predicate;

/**
 * codewars java kata
 *
 * @author Matt Luffman
 * Date: 5/6/2021
 * Time: 9:32 PM
 */
public class Kata {

    /**
     * started: 11/26/19
     * kata: https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java
     * solutions: https://www.codewars.com/kata/5266876b8f4bf2da9b000362/solutions/java
     * topics: varargs, string formatting
     *
     *
     * sources: https://docs.oracle.com/javase/8/docs/technotes/guides/language/varargs.html
     * https://dzone.com/articles/java-string-format-examples
     *
     * @param names
     * @return like message
     */
    public static String whoLikesIt(String... names) {
        final int count = names.length;
        final String likesThis = " likes this";
        final String likeThis = " like this";
        String output = "no one" + likesThis;
        switch (count) {
            case 0:
                break;
            case 1:
                output = names[0] + likesThis;
                break;
            case 2:
                output = String.join(" and ", names) + likeThis;
                break;
            case 3:
                output = String.format("%s, %s and %s%s", names[0], names[1], names[2], likeThis);
                break;
            case 4:
            default:
                output = String.format("%s, %s and %d others%s", names[0], names[1], count - 2, likeThis);
                break;
        }
        return output;
    }

    /**
     * started: 4/6/21
     * Kata: https://www.codewars.com/kata/5277c8a221e209d3f6000b56/train/java
     * solutions: https://www.codewars.com/kata/5277c8a221e209d3f6000b56/solutions/java
     * topics: Deque, Stack, lambda
     *
     * sources:
     * https://mkyong.com/java8/java-8-predicate-examples/
     * https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html
     *
     * @param braces sequence of braces
     * @return true if valid, false otherwise
     */
    public boolean braceChecker_isValid(String braces) {
        boolean valid = false;
        // an odd string could never be valid, skip processing
        if (braces.length() % 2 == 0) {
            Predicate<String> isOpening = x -> "([{".contains(x);
            Predicate<String> isClosing = ")]}"::contains; // method reference
            Deque<String> stack = new ArrayDeque<>();
            final String[] split = braces.split("");
            boolean badSequence = false; // could throw IllegalArgumentException rather using a flag
            for (String brace : split) {
                if (isOpening.test(brace)) {
                    stack.addFirst(brace);
                } else if (isClosing.test(brace)) {
                    // check top item, if it doesn't correspond to current string, then we have an invalid string
                    if (getOpeningBraceEquivalent(brace).equals(stack.peekFirst())) {
                        // closing brace matches opening brace at the top of the stack, pop it off & continue
                        stack.removeFirst();
                    } else {
                        badSequence = true;
                        break;
                    }
                } else {
                    badSequence = true;
                    break;
                }
            }
            if (stack.size() == 0 && !badSequence) {
                valid = true;
            }
        }
        return valid;
    }

    /**
     * helper for {@link #braceChecker_isValid(String)}
     *
     * @param brace { ( or [
     * @return brace equivalent
     */
    private static String getOpeningBraceEquivalent(String brace) {
        switch (brace) {
            case ")":
                return "(";
            case "]":
                return "[";
            case "}":
                return "{";
            default:
                throw new IllegalArgumentException("argument must be a closing 'brace': ), ], or }");
        }
    }

    // TODO: try this with java 8 syntax

    /**
     * started: 4/14/21
     * kata: https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
     * solutions: https://www.codewars.com/kata/5264d2b162488dc400000001/solutions/java
     * topics: string reversal, split, join
     *
     * sources:
     * https://www.geeksforgeeks.org/reverse-a-string-in-java/
     *
     * @param sentence string with a few or more words
     * @return sentence with all 5+ character words reversed
     */
    public String spinWords(String sentence) {
        List<String> processedWords = new ArrayList<>();
        for (String word : sentence.split(" ")) {
            if (word.length() >= 5) {
                // word = StringUtils.reverse(word);
                word = new StringBuffer(word).reverse().toString();
            }
            processedWords.add(word);
        }
        return String.join(" ", processedWords);
    }
}
