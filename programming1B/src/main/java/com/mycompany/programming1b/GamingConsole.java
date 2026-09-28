/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming1b;

/**
 *
 * @author Student
 */
public abstract class GamingConsole implements IgamingConsole
{
    private String consoleType;
    private String city;
    private int salesTotal;

    // Constructor
    public GamingConsole(String consoleType, String city, int salesTotal)
    {
        this.consoleType = consoleType;
        this.city = city;
        this.salesTotal = salesTotal;
    }
    // Getter for vehicle type
    @Override
    public String getGamingConsoleType()
    {
        return consoleType;
    }
    // Getter for city
    @Override
    public String getCity()
    {
        return city;
    }
    // Getter for total number of accidents
    @Override
    public int getSalesTotal()
    {
        return salesTotal;
    }
}