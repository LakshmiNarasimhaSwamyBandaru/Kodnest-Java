package com.kodnest.pattern.level4;

public class Pattern3 {
    public static void main(String[] args) {
        for (int m=1;m<=5;m++){
            for (int n=1;n<=m;n++){
                System.out.print("#");
            }
            for (int o=1;o<=5;o++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
