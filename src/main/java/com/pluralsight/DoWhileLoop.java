package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {

        //  execute body → check condition → repeat if true. Guarantees at least one execution.

        //  Step 1

        // initial counter variable
        int count = 1;
        int maxCount = 5;

        //  Condition
        do {
            System.out.println("I love Java");
            count = count + 1;
        }   while (count <= maxCount);

        // ----------------------------------------------
    }
}
