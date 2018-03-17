package xyz.alexschiff.calculus;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class PolynomialParserTest {
    @Test
    public void testPolynomialGetDegree() {
        Polynomial myPolynomial = new Polynomial("1 3 2 -4");
        int degree = myPolynomial.getDegree();
        Assert.assertEquals(degree, 4);
    }
}
