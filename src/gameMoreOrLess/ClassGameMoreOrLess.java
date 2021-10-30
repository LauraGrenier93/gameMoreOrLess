package gameMoreOrLess;

import java.util.Random;

public class ClassGameMoreOrLess {

	public static void main(String[] args) {
		int i = 0;
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
			} else if(nombreAleatoire % 2 == 0 && paire1 == true && paire2 == false){
				paire2 = true;
				i++;
				nombreAleatoire2 = nombreAleatoire;
				System.out.println("nombre2 :" + nombreAleatoire2);
			} else if(nombreAleatoire % 2 != 0  && impaire == false) {
				impaire = true;
				i++;
				nombreAleatoire3 = nombreAleatoire;
				System.out.println("nombre3 :" + nombreAleatoire3);
			}
		} while ( i < 3);
	}
}
