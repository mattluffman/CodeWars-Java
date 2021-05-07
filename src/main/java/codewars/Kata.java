package codewars;

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
}
