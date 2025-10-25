package main.java;

import java.util.Scanner;

public class H2 {
	 public static void main(String[] args) {
	    	
	    	Scanner scanner = new Scanner(System.in);
	    	
	        System.out.print("Bitte gebe einen Wert für j ein: ");
	        int j= scanner.nextInt(); 
	    	
	        System.out.print("Bitte gebe einen Wert für i ein: ");
	        int i = scanner.nextInt();
	        
	        System.out.print("Bitte gebe einen Wert für k ein: ");
	        int k = scanner.nextInt();
	        
	        int min;
	        int max;
	        
	        if (i < j && i < k) {
	            min = i;
	        } else if (j < i && j < k) {
	            min = j;
	        } else {
	            min = k;
	        }

	        if (i > j && i > k) {
	            max = i;
	        } else if (j > i && j > k) {
	            max = j;
	        } else {
	            max = k;
	        }
	        System.out.println("Min: " + min);
	        System.out.println("Max: " + max);
	 }
}
