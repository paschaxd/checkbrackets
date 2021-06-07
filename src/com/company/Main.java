package com.company;

public class Main {

    public static void main(String args[])
    {
        String checkLine = "))((";
        System.out.println(checkLine + ": brackets are " + (checkBrackets(checkLine) ? "balanced" : "unbalanced") );
    }

    public static boolean checkBrackets(String checkLine) {
        if (checkLine.startsWith(")")) return false;

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
}