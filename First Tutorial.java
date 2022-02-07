package com.company;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        //Display The Variable

	System.out.println("Hello World");

        int x = 12;
        System.out.println("x");

        int y = 12;
        System.out.println(y);

        //Variable

        double num;
        num = 12.2;
        System.out.println(num);

       int age = 18;
       System.out.println("Am " + age + " years old ");

        //user input

        Scanner s = new Scanner(System.in);
        System.out.println(s.next());

        Scanner z = new Scanner(System.in);
        System.out.println(z.nextLine());

        //massage box

        String Name = JOptionPane.showInputDialog("Hi What's your name");
        JOptionPane.showMessageDialog(null , "hi " + Name + " hi ");


    }
}
