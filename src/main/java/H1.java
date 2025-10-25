package main.java;

import java.util.Scanner;

public class H1 {

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.print("Bitte gebe einen Wert für z ein: ");
        int z = scanner.nextInt(); 

        if (z > 10) {
            z = z - 10;
        }

        System.out.println("Ergebnis: " + z);

        scanner.close();
    }
}