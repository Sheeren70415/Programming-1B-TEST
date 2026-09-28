/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming1b;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // Get vehicle type
        System.out.print("Enter the console type: ");
        String vehicleType = input.nextLine();
        
        // Get city
        System.out.print("Enter the city for the gaming console: ");
        String city = input.nextLine();
        
        // Get total accidents
        System.out.print("Enter the total " + gamingConsoleType 
                + " sales for " + city + ": ");
        int salesTotal = input.nextInt();
        
        // Create RoadAccidentReport object
        consoleSalesReport report = new consoleSalesReport(vehicleType, city, salesTotal);
        
        // Display the report
        report.printSalesReport();
        
        input.close();
    }
}