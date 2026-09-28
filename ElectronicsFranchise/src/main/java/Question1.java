/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Question1 {
    
}



    public static void main(String[] args) {
        // 1. Single-dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // 2. Two-dimensional array for console sales 
        // Rows: Cities, Columns: PS5, XBOX, SWITCH
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-18s %-10s %-10s %-10s%n", "", "PS5", "XBOX", "SWITCH");

        // Print the sales table
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %-10d %-10d %-10d%n", 
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int maxSales = 0;
        String bestCity = "";

        // Calculate totals per city and find the highest
        for (int i = 0; i < cities.length; i++) {
            int rowTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                rowTotal += sales[i][j];
            }
            System.out.printf("%-18s %d%n", cities[i], rowTotal);

            if (rowTotal > maxSales) {
                maxSales = rowTotal;
                bestCity = cities[i];
            }
        }

        System.out.println("\nCITY WITH THE MOST SALES: " + bestCity);
        System.out.println("--------------------------------------------------");
    }
