package xyz.alexschiff.calculus;

public class Fraction {

    private final int denominator;
    private final int numerator;
    private final Sign sign;

    Fraction(int denominator, int numerator, Sign sign) {
        this.denominator = denominator;
        this.numerator = numerator;
        this.sign = sign;
    }

    @Override
    public boolean equals(Object rightObject) {
        if (rightObject == null) {
            return false;
        }
        if (rightObject == this) {
            return true;
        }
        if (!(rightObject instanceof Fraction)) {
            return false;
        }
        Fraction rightFraction = (Fraction) rightObject;
        return this.sign == rightFraction.sign && this.numerator * rightFraction.denominator == rightFraction
                .numerator * this.denominator;
    }
}
