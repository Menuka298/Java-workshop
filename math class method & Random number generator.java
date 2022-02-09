package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //math class method

        System.out.println(Math.abs(25.3));
        System.out.println(Math.pow(2,1));
        System.out.println(Math.sqrt(9));

        System.out.println(Math.ceil(5.1));
        System.out.println(Math.floor(5.9));

        System.out.println(Math.max(12,2));
        System.out.println(Math.min(2,1));

        //Random number generator

        Random rnd = new Random();
        int num;

        for (int i = 0 ; i<10 ; i++){
            num = rnd.nextInt(5);
            System.out.println(num);
        }

    }
}
