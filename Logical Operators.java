package com.company;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

    

        //Logical Operators

        //if else statements

        int num = 5;

        if (num == 10){                // == ,< , > , !=
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        int math = 50;
        int sin = 66;

        if (m>50 || s>60)  // && , || ,
        {
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }




        //else if

        int mar = 68;

        if (mar >= 75)
            System.out.println("Your Grade is : A ");
        else if(mar >= 65)
            System.out.println("Your Grade is : B ");
        else if(mar >= 55)
            System.out.println("Your Grade is : A ");




        //switch statements

        int age = 16;

        switch (age){

            case 15 :
                System.out.println("Your Age is 15 ");
                break;

            case 16 :
                System.out.println("Your Age is 16 ");
                break;

            default:
                System.out.println("I dont know your age !!!!!!!!!!!!! ");
        }





    }
}
