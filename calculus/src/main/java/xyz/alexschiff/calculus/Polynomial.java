package xyz.alexschiff.calculus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polynomial {
    private int degree;

    public Polynomial(String polynomialString) {
        String[] coefficientArray = polynomialString.split(" ");
        List<String> coefficientList = new ArrayList<>(Arrays.asList(coefficientArray));
        coefficientList.removeAll(Arrays.asList("", null));
        degree = coefficientList.size();
    }

    public int getDegree() {
        return degree;
    }
}
