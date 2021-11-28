package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(" Ile liczb porównujemy? ");
        int n = s.nextInt();

        System.out.println(" Podaj kolejne liczby: ");
        int a = s.nextInt();
        int x =a;
        int i =1;
        while(i<n) {
            a = s.nextInt();
            if (a > x) {
                
                x =a;
            }
            i = i +1;
        }
            System.out.println("Największa liczba to : "+x);
        }
    }