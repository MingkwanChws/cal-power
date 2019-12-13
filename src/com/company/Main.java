package com.company;

import java.util.Scanner;

public class Main {


    
    public static void main(String[] args) {
        int baseNumber;
        int exponential;
        long result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base Number");
        baseNumber = scanner.nextInt();
        System.out.println("Enter Exponential");
        exponential = scanner.nextInt();
        result =  1;
        for ( int count = 1; count<=exponential; count++ ) {
            result = result * baseNumber;
        }
        System.out.println(result);



    }
}
