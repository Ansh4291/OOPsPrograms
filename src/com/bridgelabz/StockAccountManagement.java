package com.bridgelabz;

import java.util.Scanner;

public class StockAccountManagement {
    static Scanner sc = new Scanner(System.in);
    public static void stockDetails(){
        System.out.println("Enter the number of stocks ");
        int n = sc.nextInt();
        String ShareName;
        int noOfShare;
        float SharePrice = 0.0f , StockValue = 0.0f , ValueOfTotalStock = 0.0f;

        for (int i = 0; i < n; i++){
            System.out.println("Enter the name of share ");
            ShareName = sc.next();
            System.out.println("Enter the Number of share");
            noOfShare = sc.nextInt();
            System.out.println("Enter the share price");
            SharePrice = sc.nextFloat();
            StockValue = CalculateStockValue(noOfShare , SharePrice );
            System.out.println("Stock Value of share is "+ n );
            System.out.println("Share name is " + ShareName + " And its value is " +StockValue);
            ValueOfTotalStock += StockValue;
        }
        System.out.println("Total stock value of share is " + ValueOfTotalStock);
    }

    private static float CalculateStockValue(int noOfShare, float sharePrice) {
        return noOfShare * sharePrice;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Stock Account Management project :-) ");
        stockDetails();
    }
}
