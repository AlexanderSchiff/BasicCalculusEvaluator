package xyz.alexschiff.calculus;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fraction {

    private final int denominator;

    public int getDenominator() {
        return denominator;
    }

    private final int numerator;

    public int getNumerator() {
        return numerator;
    }

    private final Sign sign;

    public Sign getSign() {
        return sign;
    }

    Fraction(int numerator, int denominator, Sign sign) throws IllegalArgumentException {
        if (denominator == 0) {
            throw new IllegalArgumentException();
        }
        this.denominator = denominator;
        this.numerator = numerator;
        this.sign = sign;
    }

    Fraction(String fractionString) throws IllegalArgumentException {
        Pattern pattern = Pattern.compile("^(?<sign>-?)(?<numerator>[0-9]+)(?:/?)(?<denominator>[0-9]*)$");
        Matcher matcher = pattern.matcher(fractionString);
        if (!matcher.matches()) {
            throw new IllegalArgumentException();
        }

        sign = "-".equals(matcher.group("sign")) ? Sign.NEGATIVE : Sign.POSITIVE;
        numerator = Integer.parseInt(matcher.group("numerator"));
        String denominatorString = matcher.group("denominator");
        if (denominatorString == null || denominatorString.equals("")) {
            denominator = 1;
        } else {
            int tempDenominator = Integer.parseInt(denominatorString);
            if (tempDenominator == 0) {
                throw new IllegalArgumentException();
            }
            denominator = tempDenominator;
        }
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
        return this.getSign() == rightFraction.getSign() && this.getNumerator() * rightFraction.getDenominator() ==
                rightFraction.getNumerator() * this.getDenominator();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getSign() == Sign.NEGATIVE ? "-" : "+");
        stringBuilder.append("(");
        stringBuilder.append(this.getNumerator());
        if (this.getDenominator() != 1) {
            stringBuilder.append("/");
            stringBuilder.append(this.getDenominator());
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}