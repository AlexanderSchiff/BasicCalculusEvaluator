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

    @Test
    public void testPolynomialToString() {
        Polynomial myPolynomial = new Polynomial("1/3 -3/17 2/55 -4/33");
        String polynomialString = myPolynomial.toString();
        Assert.assertTrue(polynomialString.equals("+(1/3)x^3-(3/17)x^2+(2/55)x^1-(4/33)x^0"));
    }
}