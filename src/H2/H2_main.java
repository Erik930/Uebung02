package h2;

import java.util.Scanner;

public class H2_main {
	 public static void main(String[] args) {
	    	
	    	Scanner s1 = new Scanner(System.in);
	    	Scanner s2 = new Scanner(System.in);
	    	Scanner s3 = new Scanner(System.in);
	    	
	        System.out.print("Bitte gebe einen Wert für j ein: ");
	        int j= s1.nextInt(); 
	    	
	        System.out.print("Bitte gebe einen Wert für i ein: ");
	        int i = s2.nextInt();
	        
	        System.out.print("Bitte gebe einen Wert für k ein: ");
	        int k = s3.nextInt();
	        // int i,j,k werden von Nutzer Deklariert und System gescannt
	        
	        int min;
	        int max;
	        
	        
	        if (i < j && i < k) {
	            min = i;
	        } else if (j < i && j < k) {
	            min = j;
	        } else {
	            min = k;
	        }
	        // Definition von min durch testen, welcher Wert der kleinste ist
	        if (i > j && i > k) {
	            max = i;
	        } else if (j > i && j > k) {
	            max = j;
	        } else {
	            max = k;
	        }
	        // Definition von max durch testen, welcher Wert der groesste ist
	        System.out.println("Min: " + min);
	        System.out.println("Max: " + max);
	        // ausspucken von vorher definiertem min und max
	 }
}
