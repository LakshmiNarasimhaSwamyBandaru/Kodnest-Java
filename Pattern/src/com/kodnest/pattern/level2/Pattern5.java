package com.kodnest.pattern.level2;

public class Pattern5 {
    public static void main(String[] args) {
       int count=0;
        for (int k = 1; k <= 5; k++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(k);
                count++;
            }
            System.out.println();
        }
    }
}
