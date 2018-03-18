package xyz.alexschiff.calculus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polynomial {
    private int degree;
    private List<Integer> coefficientList;

    Polynomial(String polynomialString) {
        String[] coefficientArray = polynomialString.split(" ");
        List<String> coefficientList = new ArrayList<>(Arrays.asList(coefficientArray));
        coefficientList.removeAll(Arrays.asList("", null));
        degree = coefficientList.size();

    }

    @Override
    public String toString() {
        return "Polynomial{}";
    }

    public int getDegree() {
        return degree;
    }


    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public List<Integer> getCoefficientList() {
        return coefficientList;
    }
}
