package no.hvl.dat100;

import java.util.Scanner;

public class O3 {
		
		public static void main(String[]args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Program som rekner ut fakultet av gitt verdi n");
			System.out.println("----------------------------------------------");
			System.out.println();
			System.out.print("Vennligst skriv inn eit positivt heiltall: ");
			int tall = scanner.nextInt();
			
			if(tall<0) {
				
			System.out.println("ugyldig tall, velg ett som er større enn null");
			
			}else {
				
				long fakultet = 1;
				
				for (int i = tall; i > 1; i--) {
					fakultet *= i;
				}
				
				System.out.println(tall + " fakultet er: " + fakultet);
			}
			
			scanner.close();
			
	}
	}
	

