package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in : ");
        int number = sr.nextInt();
        int count = 0;
        int n = 2;
            while (count<number){
                boolean prime = true;
                for (int i = 2; i < n; i++) {
                    if (n%i==0){
                        prime = false;
                    }
                }
                if (prime==true){
                    System.out.print(n+"  ");
                    count++;
                }
                n++;
            }
    }
}
