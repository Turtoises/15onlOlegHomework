package com.tms.homework080622;

public class Job6 {
    private static char letterRus='я';
    private static int indexNextLetter=2;

    public static void main(String[] args){

        System.out.println(getNextLetter(letterRus,indexNextLetter));

    }

    public static char getNextLetter(char letterRus, int indexNextLetter){

        return (char) (letterRus+indexNextLetter);
     }

}
