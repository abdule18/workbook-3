package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String fileName = "employees.csv";


        try {

            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(fileName));

            bufWriter.write("ID|Name|Gross Pay");
            bufWriter.newLine();

            System.out.println("How many employees do you want to add?");
            int numEmpl = scanner.nextInt();
            scanner.nextLine();

            for (int i =0; i < numEmpl; i++){
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();

                System.out.print("Enter employer name: ");
                String name = scanner.nextLine();

                System.out.println("Enter the employee Gross Pay: ");
                String grossPay = scanner.nextLine();

                bufWriter.write(id + "|" + name + "|" + grossPay);
                bufWriter.newLine();
            }

//            System.out.println("Enter the name of the file employee file to process: ");
//            String file = scanner.nextLine();
//            System.out.println();

//            if(file.equalsIgnoreCase(fileName)){
//
//            }
//
//            int line;
//
//            for (line = 1; line <= bufWriter.length; line++){
//                bufWriter.write(bufWriter[line]);
//            }


//            String[] parts = line.split("\\|");
//
//            int id = Integer.parseInt(parts[0]);
//            String name = parts[1];
//            float hoursWorked = Float.parseFloat(parts[2]);
//            double payRate = Double.parseDouble(parts[3]);
//
//            Employee employee = new Employee(id, name, hoursWorked, payRate);
//
//            System.out.printf("ID: %d | Name: %s | Pay: $%.2f%n",
//                    employee.getEmployeeId(), employee.getName(), employee.getHoursWorked(), employee.getPayRate());

            bufWriter.close();
            System.out.println("This is the outcome: " + fileName);
        } catch (IOException e) {
            System.out.println("There is an Error!");;
        }

    }
}