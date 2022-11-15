package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float ticketPricePerKm = 0.21f;
		int minorSale = 20;
		int elderSale = 40;
		
		System.out.print("Quanti km dovrai percorrere?\t");
		float userKmToRide = sc.nextFloat();
		
		System.out.print("La tua età: ");
		int userAge = sc.nextInt();
		
		float finalicketPrice = ticketPricePerKm * userKmToRide;
		float saledTicketPrice = 0.0f;
		
		if(userAge < 18) {
		    
			saledTicketPrice = finalicketPrice - (( ((float) finalicketPrice) * ((float) minorSale) ) / 100f);
			System.out.printf("E' stato applicato lo sconto minorenne, il prezzo sarà: %.2f", saledTicketPrice);
			
			sc.close();
			return;
		}else if(userAge >= 40) {
			saledTicketPrice = finalicketPrice - (( ((float) finalicketPrice) * ((float) elderSale) ) / 100f);
			System.out.printf("E' stato applicato lo sconto over 65, il prezzo sarà: %.2f", saledTicketPrice);
			
			sc.close();
			return;
		}
		
		System.out.printf("Il prezzo del tuo biglietto è di: %.2f", finalicketPrice);
		
		sc.close();
	}

}
