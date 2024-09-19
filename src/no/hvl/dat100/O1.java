package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {




public static void main(String[] args) {

for(int i = 0; i<=0; i++) {

String poengsumTxt = showInputDialog("Skriv inn poengsum " + i + "(0-100");
        
int poengsum = parseInt(poengsumTxt);

if (poengsum < 0 || poengsum > 100) {
    System.out.println("Ugyldig poengsum! " + i + "Vennligst skriv inn en poengsum mellom 0 og 100.");
        } else {
            
char karakter;
 if (poengsum >= 90 && poengsum <= 100) {
                karakter = 'A';
    } else if (poengsum >= 80 && poengsum <= 89) {
                karakter = 'B';
    } else if (poengsum >= 60 && poengsum <= 79) {
                karakter = 'C';
    } else if (poengsum >= 50 && poengsum <= 59) {
                karakter = 'D';
    } else if (poengsum >= 40 && poengsum <= 49) {
                karakter = 'E';
    } else {
                karakter = 'F';
    }

           
 System.out.println("Karakteren er: " + karakter);
        }
    }



}}