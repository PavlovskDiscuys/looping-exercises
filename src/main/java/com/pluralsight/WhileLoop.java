package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {

        //  check condition → execute body only if condition true. May execute zero times.

        //  Step 1

        // initial counter variable
        int count = 1;
        int maxCount = 5;

        //  Condition
        while (count <= maxCount) {
            count = count + 1;
            System.out.println("I love Java");
        }

        // ----------------------------------------------


    }
}
