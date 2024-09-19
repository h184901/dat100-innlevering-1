package no.hvl.dat100;
import java.util.Scanner;

public class O2 {
	




		public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Skriv inn bruttolønn her: ");
			int bruttoLønn = scanner.nextInt();
			
			final int trinnEn = 0;
			final int trinnTo = 208051;
			final int trinnTre = 292851;
			final int trinnFire = 670001;
			final int trinnFem = 937901; 
			final int trinnSeks = 1350001; 
			
			double trinnSkatt = 0;
			
			
			if (bruttoLønn >= trinnEn &&  bruttoLønn < trinnTo) {
				System.out.println("ingen trinnskatt");
				
			}else {
				
			if (bruttoLønn >= trinnTo && bruttoLønn < trinnTre) {
				trinnSkatt = 0.983; // trekker fra 0.017 fra 1 så eg kan bare gange sammen og ta minus startverdien (ville prøve ut Math.abs)
				System.out.println("du må betale: " + Math.abs(((trinnSkatt * bruttoLønn) - bruttoLønn)) + "kr i trinnskatt");
				
			}if (bruttoLønn >= trinnTre && bruttoLønn < trinnFire) {
				trinnSkatt = 0.04; // anna måte for samme resultat
				System.out.println("du må betale: " + ((trinnSkatt * bruttoLønn)) + "kr i trinnskatt");
		
			}if (bruttoLønn >= trinnFire && bruttoLønn < trinnFem) {
				trinnSkatt = 0.864; 
				System.out.println("du må betale: " + Math.abs(((trinnSkatt * bruttoLønn) - bruttoLønn)) + "kr i trinnskatt");
				
		} if (bruttoLønn >= trinnFem && bruttoLønn < trinnSeks) {
			trinnSkatt = 0.834; 
			System.out.println("du må betale: " + Math.abs(((trinnSkatt * bruttoLønn) - bruttoLønn)) + "kr i trinnskatt");
			
		} if (bruttoLønn >= trinnSeks) {
		trinnSkatt = 0.824; 
		System.out.println("du må betale: " + Math.abs(((trinnSkatt * bruttoLønn) - bruttoLønn)) + "kr i trinnskatt");
			}
	} //lag samme kode med case seinare
			

}}
