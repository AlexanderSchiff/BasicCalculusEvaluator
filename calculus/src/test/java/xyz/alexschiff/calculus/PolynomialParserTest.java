package xyz.alexschiff.calculus;

import org.junit.Assert;
import org.junit.Test;

public class PolynomialParserTest {
    @Test
    public void testPolynomialGetDegree() {
        Polynomial myPolynomial = new Polynomial("1 3 2 -4");
        int degree = myPolynomial.getDegree();
        Assert.assertEquals(degree, 4);
    }

    @Test
    public void testPolynomialComparison() {
        Polynomial myPolynomial = new Polynomial("1 3 2 -4");
        Assert.assertTrue(myPolynomial.equals(new Polynomial("1 3 2 -4")));
    }
}