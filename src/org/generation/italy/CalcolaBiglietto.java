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
		
		float finalTicketPlusOneCent = (ticketPricePerKm / 50f);
		float finalicketPrice = (ticketPricePerKm + finalTicketPlusOneCent) * userKmToRide;

		float saledTicketPrice = 0.0f;
		
		if(userAge > 12 && userAge < 18) {
		    
			// altro metodo in live coding
			finalicketPrice -= finalicketPrice / 100 * minorSale;
			System.out.printf("E' stato applicato lo sconto minorenne, il prezzo sarà: %.2f", finalicketPrice);
			
			sc.close();
			return;
		}else if(userAge >= 40) {
			saledTicketPrice = finalicketPrice - (( ((float) finalicketPrice) * ((float) elderSale) ) / 100f);
			System.out.printf("E' stato applicato lo sconto over 65, il prezzo sarà: %.2f", saledTicketPrice);
			
			sc.close();
			return;
		}else if(userAge <= 12) {
			System.out.println("I minori di 12 anni viaggiano gratis!");
			
			sc.close();
			return;
		}
		
		System.out.printf("Il prezzo del tuo biglietto è di: %.2f", finalicketPrice);
		
		sc.close();
	}

}
