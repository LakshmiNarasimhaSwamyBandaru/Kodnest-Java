package com.kodnest.training.twodarray;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[][]=new int[2][5];
        for (int i=0;i<=1;i++){
            for (int j=0;j<=4;j++){
                System.out.println("Enter the marks of class"+i+"Students"+j);
                arr[i][j]= scan.nextInt();
            }
        }
        System.out.println("Array elements are.....");
        for (int i=0;i<=1;i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
