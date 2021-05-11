package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * tests for kata {@link Kata#bouncingBall(double, double, double)}
 *
 * @author Matt Luffman
 * Date: 5/10/2021
 * Time: 10:48 PM
 */
public class BouncingBallTest {

    @Test
    public void test1() {
        assertEquals(3, Kata.bouncingBall(3.0, 0.66, 1.5));
    }

    @Test
    public void test2() {
        assertEquals(15, Kata.bouncingBall(30.0, 0.66, 1.5));
    }
}
