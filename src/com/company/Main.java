package com.company;

public class Main {

    public static void main(String[] args) {
        // boiler-plate code.

        // access-modifier: It is a way of setting how we want other classes to view that item.
        // library



        // System.out.println("Hello World"); // when you want to output to the console.
        // The syntax is System.out.println

        float five = 5;
        float six = 6; // declaration and initialization

//        int eleven = five + six;

        String hello = "Hello";
        String world = "World";
        // concatenation. concatenation is the process of joining two or more strings together.

//        five += 5; // at the end of the statement five will be increased by 5.
//        five += 5;
//        five /= 5.6f;

//        five = five % 2; // 15 % 3 = 0


        float sum = five + six;
        float difference = five - six;
        float product = five * six;
        float quotient = five / six;

        float modulo = six % five;

//        five++;

//        System.out.println(++five);

      //  System.out.println(five + six + "faeee"); // remember to add concatenation
//        System.out.println("The sum of " + five + " and " + six + " is: " + sum);
//        System.out.println("The difference of " + five + " and " + six + " is: " + difference);
//        System.out.println("The product of " + five + " and " + six + " is: " + product);
//        System.out.println("The quotient of " + five + " and " + six + " is: " + quotient);
//        System.out.println("The modulo of " + six + " % " + five + " is: " + modulo);

//        System.out.println("The value of the modulo " + 15 + " % " +  2 + " is: " + five);


        // Relational operators

        // Equality
        System.out.println(five == six); // returns true if the values are equal and false if they aren't

        // Non-equality
        System.out.println(five != six); // returns true if the values are not equal and false if they are.

        // Less Than
        System.out.println(five < six); // return true if the value on the left is less than the value on the right and false if not.

        // Greater than
        System.out.println(five > six); // return true if the value on the left is greater than the value on the right and false if not.

        // Less than or equals
        System.out.println(five <= six); // returns true if the value on the left is greater than or equal to the value on the right.

        // Greater than or equals
        System.out.println(five >= six); // returns true if the value on the left is greater than or equal to the right and false if not.

    }
}
