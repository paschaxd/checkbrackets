package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String args[])
    {
        String checkLine = "()()";
        System.out.println(checkLine + ": brackets are " + (checkBrackets(checkLine) ? "balanced" : "unbalanced") );
        System.out.println(checkLine + ": brackets are " + (checkBrackets2(checkLine) ? "balanced" : "unbalanced") );
    }

    public static boolean checkBrackets(String checkLine) {
        int count = 0;
        for (String s : checkLine.split("")) {
            if (s.equals("(")){
                count++;
            } else if (s.equals(")")){
                count--;
            } else {
                System.out.println("Unknown character");
            }
        }
        return count == 0;
    }
    public static boolean checkBrackets2(String checkLine) {
        long count1 = Arrays.stream(checkLine.replace("(", "").split("")).count();
        long count2 = Arrays.stream(checkLine.replace(")", "").split("")).count();
        return count1 == count2;
    }
}