/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming1b;

/**
 *
 * @author Student
 */
public class consoleSalesReport {
    
}
public class consoleSalesReport extends GamingConsole {
    // Constructor
    public consoleSalesReport(String consoleType, String city, int salesTotal) {
        super(consoleType, city, salesTotal);
    }

    // Method to display the accident report
    public void consoleSalesReport() {
        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("******************************");
        System.out.println("CONSOLE TYPE: " + getGamingConsoleType());
        System.out.println("CITY: " + getCity());
        System.out.println("SALES TOTAL: " + getSalesTotal());
        System.out.println("******************************");
    }
}