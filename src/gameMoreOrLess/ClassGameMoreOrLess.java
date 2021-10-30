package gameMoreOrLess;

import java.util.Random;

public class ClassGameMoreOrLess {

	public static void main(String[] args) {
		//exercice1 : trier par adresse mail
		 String [] mails = {"a@hotmail.fr", "b@sfr.fr", "c@sfr.fr","d@sfr.fr", "e@hotmail.fr", "f@hotmail.fr", "g@hotmail.fr", "h@sfr.fr", "i@hotmail.fr","j@htomail.fr"};
		byte count1 =0;
		byte count2 = 0;
		for( String mail : mails ) {
			if(mail.endsWith("@sfr.fr")) {
				count1++;
			} else {
				count2++;
			}
		}
		System.out.println("nombre de mail se terminant par @sfr.fr :" + count1);
		System.out.println("nombre de mail se terminant par @hotmail.fr :" + count2);
		//exercice 2 : trois nombre entre 0 et 1000 (2 nombres paires suivi d'un nombre impaire)
		byte i = 0;
		byte j = 0;
		int nombreAleatoire1;
		int nombreAleatoire2;
		int nombreAleatoire3;
		boolean paire1 = false;
		boolean paire2 = false;
		boolean impaire = false;
		do {
			Random rand = new Random();
			int nombreAleatoire = rand.nextInt(1000-0+1)+0;
			if( nombreAleatoire % 2 == 0 && paire1 == false && paire2 == false) {
				paire1 = true;
				i++;
				nombreAleatoire1 = nombreAleatoire;
				System.out.println("nombre1 :" + nombreAleatoire1);
			} else if(nombreAleatoire % 2 == 0 && paire1 && paire2 == false){
				paire2 = true;
				i++;
				nombreAleatoire2 = nombreAleatoire;
				System.out.println("nombre2 :" + nombreAleatoire2);
			} else if(nombreAleatoire % 2 != 0  && impaire == false && paire1 && paire2) {
				impaire = true;
				i++;
				nombreAleatoire3 = nombreAleatoire;
				System.out.println("nombre3 :" + nombreAleatoire3);
			}
			j++;
		} while ( i < 3);
		System.out.println("Le nombre d'essai pour avoir 2 paires suivi d'un impaire est de :" + j);
	}
}
