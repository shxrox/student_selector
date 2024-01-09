package com.mycompany.driver;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Enter number of students: ");
        Scanner scan = new Scanner(System.in);
        int numStudents = scan.nextInt();
        String[] student = new String[numStudents];
        int[] age = new int[numStudents];
        Scanner scanInput = new Scanner(System.in);

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter name: ");
            student[i] = scanInput.nextLine();
            System.out.println("Enter age for " + student[i] + ": ");
            age[i] = scanInput.nextInt();
            scanInput.nextLine(); 
        }

        for (int i = 0; i < numStudents; i++) {
            if (age[i] >= 15) {
                System.out.println(student[i] + " can receive a vaccine");
                System.out.println("The student is now " + age[i]);
            }
        }

        scan.close();
        scanInput.close();
    }
}
