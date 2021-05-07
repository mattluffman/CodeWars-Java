package codewars;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * test for {@link Kata#braceChecker_isValid(String)}
 *
 * @author Matt Luffman
 * Date: 5/6/2021
 * Time: 9:58 PM
 */
public class BraceCheckerTest {

    Kata instance = new Kata();

    @Test
    public void testValid1() {
        assertTrue(instance.braceChecker_isValid("()"));
    }

    @Test
    public void testInvalid1() {
        assertFalse(instance.braceChecker_isValid("[(])"));
    }

    @Test
    public void testValid2() {
        assertTrue(instance.braceChecker_isValid("(){}[]"));
    }

    @Test
    public void testValid3() {
        assertTrue(instance.braceChecker_isValid("([{}])"));
    }

    @Test
    public void testInvalid2() {
        assertFalse(instance.braceChecker_isValid("(}"));
    }

    @Test
    public void testInvalid3() {
        assertFalse(instance.braceChecker_isValid("[(])"));
    }

    @Test
    public void testInvalid4() {
        assertFalse(instance.braceChecker_isValid("[({})](]"));
    }

    @Test
    public void testValid4() {
        assertTrue(instance.braceChecker_isValid("{{}([{()[]}])}"));
    }
}
