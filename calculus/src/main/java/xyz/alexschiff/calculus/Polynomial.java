package xyz.alexschiff.calculus;

import java.util.ArrayList;
import java.util.Arrays;

public class Polynomial {
    private int degree;

    private ArrayList<Fraction> coefficientList;

    Polynomial(String polynomialString) {
        String[] coefficientArray = polynomialString.split(" ");
        ArrayList<String> coefficientStringList = new ArrayList<>(Arrays.asList(coefficientArray));
        coefficientStringList.removeAll(Arrays.asList("", null));
        coefficientList = new ArrayList<>();
        degree = coefficientStringList.size() - 1;
        for (String aCoefficientStringList : coefficientStringList) {
            coefficientList.add(new Fraction(aCoefficientStringList));
        }
    }

    public int getDegree() {
        return degree;
    }

    public ArrayList<Fraction> getCoefficientList() {
        return coefficientList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = this.getNumberOfCoefficients() - 1; i >= 0; i--) {
            Fraction tempFraction = this.getCoefficientList().get(i);
            stringBuilder.append(tempFraction.toString());
            stringBuilder.append("x^");
            stringBuilder.append(i - 1);
        }
        return stringBuilder.toString();
    }


    @Override
    public boolean equals(Object rightObject) {
        if (rightObject == null) {
            return false;
        }
        if (rightObject == this) {
            return true;
        }
        if (!(rightObject instanceof Polynomial)) {
            return false;
        }
        Polynomial rightPolynomial = (Polynomial) rightObject;
        if (this.getDegree() != rightPolynomial.getDegree()) {
            return false;
        }
        for (int i = 0; i < this.getNumberOfCoefficients(); i++) {
            if (!this.getCoefficientList().get(i).equals(rightPolynomial.getCoefficientList().get(i))) {
                return false;
            }
        }
        return true;
    }

    public int getNumberOfCoefficients() {
        return this.getCoefficientList().size();
    }

}