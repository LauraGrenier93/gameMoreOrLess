package gameMoreOrLess;

import java.util.Random;
import java.util.Scanner;
import java.time.OffsetTime;
import java.time.Duration;
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
		byte tentative=1;
		int nombreAleatoire1;
		int nombreAleatoire2;
		int nombreAleatoire3;
		Random rand = new Random();
			do {
				nombreAleatoire1 = rand.nextInt(1001);
				nombreAleatoire2 = rand.nextInt(1001);
				nombreAleatoire3 = rand.nextInt(1001);
				System.out.println("Le nombre aléatoire 1 est :" + nombreAleatoire1);
				System.out.println("Le nombre aléatoire 2 est :" + nombreAleatoire2);
				System.out.println("Le nombre aléatoire 3 est :" + nombreAleatoire3);
				tentative++;
			} while (nombreAleatoire1 % 2 == 1 && nombreAleatoire2 % 2 == 1 && nombreAleatoire3 % 2 == 0);
			System.out.println("Le nombre d'essai pour avoir 2 paires suivi d'un impaire est de :" + tentative);

		// exercice 3 : trouver un chiffre entre 0 et 1000
	       OffsetTime startTime = OffsetTime.now();
		int nombreAleatoire = rand.nextInt(1001);
		System.out.println("Le nombre aléatoire à trouver est :" + nombreAleatoire);
		int nombreUtilisateur;
		int k = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir un nombre : ");
			nombreUtilisateur = sc.nextInt();
			System.out.println("le chiffre choisit par l'utilisateur est : " + nombreUtilisateur);
			if(nombreAleatoire <= nombreUtilisateur) {
				System.out.println("c'est moins");
			} else {
				System.out.println("c'est plus");
			}
			k++;
		} while(nombreAleatoire != nombreUtilisateur);
	       OffsetTime endTime = OffsetTime.now();
	       Duration time = Duration.between(startTime, endTime);
		System.out.println("Vous avez gagné en " + k);
		System.out.println("Vous aves terminé en " + time.toMinutesPart() + " minute(s)" + time.toSecondsPart() + " seconde(s)");
	}
}
