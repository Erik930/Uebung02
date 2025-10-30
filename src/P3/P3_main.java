package p3;

import java.util.Scanner;

public class P3_main {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		System.out.print("Bitte gebe einen Wert für i ein: ");
        int i= s1.nextInt(); 
        
        System.out.print("Bitte gebe einen Wert für j ein: ");
        int j= s2.nextInt();
        
        System.out.print("Bitte gebe einen Wert für k ein: ");
        int k= s3.nextInt();
// challo
        
        if (i < j) {
         System.out.println("A");
         
        } else if (i < k) {
         System.out.println("B");
         
        } else if (j < k) {
         System.out.println("C");
        }
        
	}
}
