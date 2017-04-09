package hu.helixlab.homework;

import homework04.*;

public class Main {

    public static void main(String[] args) {

        UserRegistry userRegistry = new UserRegistry();
        userRegistry.run();
        ArrayTest arrayTest = new ArrayTest();
        arrayTest.intArray();
        System.out.println();
        System.out.println("A második legnagyobb elem: " + arrayTest.getSecondHighest());
    }
}
