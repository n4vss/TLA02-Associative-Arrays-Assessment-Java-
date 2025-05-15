package com.mycompany.tla02;

import java.util.*;

public class Navales_TLA02 {

    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap<>();

        // Initializing student scores
        student.put("John", 85);
        student.put("Alice", 90);
        student.put("Mark", 78);
        student.put("Sophia", 95);
        student.put("Emma", 88);

        Scanner sc = new Scanner(System.in);

        // Find student's score
        System.out.print("Enter student's name to find their score: ");
        String name = sc.nextLine();

        if (student.containsKey(name)) {
            System.out.println(name + "'s score is: " + student.get(name));
        } else {
            System.out.println("Student not found.");
        }

        // Update a student's score
        System.out.print("Enter student's name to update their score: ");
        String updateName = sc.nextLine();

        if (student.containsKey(updateName)) {
            System.out.print("Enter the new score: ");
            if (sc.hasNextInt()) { // Validate input
                int newScore = sc.nextInt();
                student.put(updateName, newScore);
                System.out.println(updateName + "'s score updated successfully!");
                sc.nextLine(); // Consume leftover newline
            } else {
                System.out.println("Invalid score input.");
                sc.nextLine(); // Consume invalid input
            }
        } else {
            System.out.println("Student not found.");
        }

        // Print out all student names and scores
        System.out.println("\nList of students and scores:");
        for (Map.Entry<String, Integer> entry : student.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
