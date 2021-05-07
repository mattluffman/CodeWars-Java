package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test for {@link Kata#spinWords(String)}
 *
 * @author Matt Luffman
 * Date: 5/6/2021
 * Time: 10:11 PM
 */
public class SpinWordsTest {

    Kata instance = new Kata();

    @Test
    public void testSpinWords() {
        assertEquals("Welcome", instance.spinWords("emocleW"));
        assertEquals("Hey fellow warriors", instance.spinWords("Hey wollef sroirraw"));
        assertEquals("This is a test", instance.spinWords("This is a test"));
        assertEquals("This is rehtona test", instance.spinWords("This is another test"));
        assertEquals("This is another test", instance.spinWords("This is rehtona test"));
    }
}
