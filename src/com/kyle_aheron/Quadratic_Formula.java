package com.kyle_aheron;

public class Quadratic_Formula {
    public double posQuadForm(int ax, int bx, int c) {
        int b;
        b = (bx);
        int a;
        a = (ax);

        double posAnswer;
        posAnswer = ((-b) - Math.sqrt((b^2) + ((-4) * a * c)) / (2 * a));
        return posAnswer;
    }
    public double negQuadForm(int ax, int bx, int c) {
        int b;
        b = (bx);
        int a;
        a = (ax);

        double negAnswer;
        negAnswer = ((-b) + Math.sqrt((b^2) + ((-4) * a * c)) / (2 * a));
        return negAnswer;
    }
}
