package com.kodnest.pattern.level3;

public class Pattern2 {
    public static void main(String[] args) {
        for (int k = 1; k <= 5; k++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
