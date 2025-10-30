package h3;

import java.util.Scanner;

public class H3_main {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
    	
        System.out.print("Bitte gebe einen Wert für i ein: ");
        int i= s1.nextInt(); 
        
        Scanner s2 = new Scanner(System.in);
        
        System.out.print("Bitte gebe einen Wert für j ein: ");
        int j= s2.nextInt(); 
        
        int k = -10;

        boolean expr1 = (i > j);
        boolean expr2 = (i > 200);
        boolean expr3 = (j > 100);

        if (expr1 && !expr2 && !expr3) {
            k = 1;
        } else if (expr1 && expr2 && !expr3) {
            k = 2;
        } else if (expr1 && expr2 && expr3) {
            k = 3;
        } else if (!expr1 && !expr2 && !expr3) {
            k = 4;
        } else {
            k = -10;
        }

        System.out.println("k = " + k);
    } 
}
