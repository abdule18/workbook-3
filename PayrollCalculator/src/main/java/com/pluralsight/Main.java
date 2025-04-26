package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class Main {
//    Employee employee = new Employee(1, "Abdule", 40, 25);
    public static void main(String[] args){
        String fileName = "employees.csv";

//        FileInputStream fileInputStream = null;
        try {
//            FileInputStream  fileInputStream = new FileInputStream(fileName);

            BufferedReader bufReader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = bufReader.readLine()) != null) {
                System.out.println(line);
            }

            String[] parts = line.split("\\|");

            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            float hoursWorked = Float.parseFloat(parts[2]);
            double payRate = Double.parseDouble(parts[3]);

            Employee employee = new Employee(id, name, hoursWorked, payRate);

            System.out.printf("ID: %d | Name: %s | Pay: $%.2f%n",
                    employee.getEmployeeId(), employee.getName(), employee.getHoursWorked(), employee.getPayRate());

            bufReader.close();
        } catch (IOException e) {
            System.out.println("There is an Error!");;
        }

    }
}