package xyz.alexschiff.calculus;

import org.junit.Assert;
import org.junit.Test;

public class FractionTest {
    @Test
    public void testFractionEquality() {
        Fraction testFraction = new Fraction(1, 2, Sign.NEGATIVE);
        Assert.assertTrue(testFraction.equals(new Fraction(2, 4, Sign.NEGATIVE)));
    }

    @Test
    public void testFractionFromString() {
        Fraction firstFraction = new Fraction("-1/2");
        Fraction secondFraction = new Fraction(1, 2, Sign.NEGATIVE);
        Assert.assertTrue(firstFraction.equals(secondFraction));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Fraction testFrac = new Fraction("1/0");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero2() {
        Fraction testFrac = new Fraction(2, 0, Sign.POSITIVE);
    }

    @Test
    public void testNotEqual() {
        Fraction firstFraction = new Fraction("1/2");
        Fraction secondFraction = new Fraction(3, 5, Sign.NEGATIVE);
        Assert.assertFalse(firstFraction.equals(secondFraction));
    }
}