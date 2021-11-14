package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int u = in.nextInt();
        System.out.println("Enter second number: ");
        int k = in.nextInt();
        System.out.println("Enter third number: ");
        int l = in.nextInt();
        System.out.println("Enter forth number: ");
        int r = in.nextInt();
        if (u>k) {
            if (u>l){
                if (u>r){
                    System.out.println("The biggest number is: "+u);
                }else{
                    System.out.println("The biggest number is: "+r);
                }
            }else{
                if (l>r){
                    System.out.println("The biggest number is: "+l);
                }else{
                    System.out.println("The biggest number is: "+r);
                }
            }
        }else{
            if (k>l){
                if (k>r){
                    System.out.println("The biggest number is: "+k);
                }else{
                    System.out.println("The biggest number is: "+r);
                }
            }else{
                if (l>r){
                    System.out.println("The biggest number is: "+l);
                }else{
                    System.out.println("The biggest number is: "+r);
                }
            }
        }
    }
}
