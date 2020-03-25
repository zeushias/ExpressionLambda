package presentattion;

import IService.IJeu;
import IService.Jeu;

public class lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// b2.addActionListener(e -> System.out.println("Action !!!!"));
		Jeu monJeu = new Jeu();
		
		monJeu.jouerBien(new IJeu() {
			
			@Override
			public void jouer() {
				// TODO Auto-generated method stub
				System.out.println("Je joue");
			}
		});		
		// expression lambda
		monJeu.jouerBien(()-> System.out.println("Je joue très bien"));
			
	}
}
