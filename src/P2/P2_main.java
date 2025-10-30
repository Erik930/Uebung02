package P2;

import java.util.Scanner;

public class P2_main {
	
    public static void main(String[] args) {
    	
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("Bitte gebe einen Wert für i ein: ");
    int i = scanner.nextInt(); 

    
    boolean b = false;
    
    if (i > 10) {
    b = true;
    }  else {
    b = false;
    }
    
    
    System.out.println("b = " + b );
    	
    	
    	
    }
}
