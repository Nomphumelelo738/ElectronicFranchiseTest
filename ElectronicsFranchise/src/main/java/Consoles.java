/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
package Question2;

public abstract class Consoles implements IConsoles {
    private String consoleType;
    private String storeName;
    private int totalSales;

    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return storeName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}