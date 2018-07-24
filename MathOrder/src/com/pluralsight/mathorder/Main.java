package com.pluralsight.mathorder;

public class Main {

    public static void main(String[] args) {
	      int valA = 21;
	      int valB = 6;
	      int valC = 3;
	      int valD = 1;

	      int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);

        // Primitive data types are very important to take into account when performing divisions
        int result10 = 25 / 6;
        float result11 = 25.0f / 7.0f;

        System.out.println(result10);
        System.out.println(result11);
    }
}
