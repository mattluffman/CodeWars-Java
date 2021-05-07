package codewars;

import org.junit.Test;

import static codewars.Kata.whoLikesIt;
import static org.junit.Assert.assertEquals;

/**
 * unit tests for wholikesit kata
 * https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java<br/>
 * for {@link Kata#whoLikesIt(String...)}
 *
 * @author Matt Luffman
 * Date: 5/6/2021
 * Time: 9:42 PM
 */
public class WhoLikesItTest {

    @Test
    public void testWhoLikesIt() {
        assertEquals("no one likes this", whoLikesIt());
        assertEquals("Peter likes this", whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
