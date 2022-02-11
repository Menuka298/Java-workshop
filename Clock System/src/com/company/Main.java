package com.company;

public class Main {

    public static void main(String[] args) {

            second secondObj  = new second();
            //System.out.println(secondObj.standTime());

            secondObj.setTime(12,12,12);
            System.out.println(secondObj.standTime());
            System.out.println(secondObj.RegularTime());

            secondObj.setTime(14,25,36);
            System.out.println(secondObj.standTime());
            System.out.println(secondObj.RegularTime());

        }
    }
