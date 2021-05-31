package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("CGPA Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your Marks in English");
        int e = sc.nextInt();
        System.out.println("Enter your Marks in Hindi");
        int h = sc.nextInt();
        System.out.println("Enter your Marks in Maths");
        int m = sc.nextInt();
        System.out.println("Enter your Marks in Physics");
        int p = sc.nextInt();
        System.out.println("Enter your Marks in Chemistry");
        int c = sc.nextInt();
        int total = e + h + m + p +c;
        float CGPA = total / 5f;
        System.out.println("Your CGPA is: " +CGPA);
    }
}
