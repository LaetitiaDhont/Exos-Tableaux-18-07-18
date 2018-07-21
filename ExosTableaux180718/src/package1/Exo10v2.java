package package1;

import java.util.Scanner;

public class Exo10v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// déclarer le tableau + sa taille
		int [] tab = new int [8];
		tab [0] = 12;
		tab [1] = 15;
		tab [2] = 13;
		tab [3] = 10;
		tab [4] = 8;
		tab [5] = 9;
		tab [6] = 13;
		tab [7] = 14;
		// je déclare ma variable de type Scanner		
		Scanner sc = new Scanner (System.in);
		System.out.println("Veuillez saisir un nombre entier :");
		int input = sc.nextInt();
		// tab.length la taille du tabeau 
		int i;
		for (i = 0; i < tab.length; i++) {
			if (input == tab[i]) {
				System.out.println("Bravo!");
				break;
			}
		}
		if (i == tab.length) {
			i--;
		}
		if (input != tab[i]) {
			System.out.println("Perdu!");
		}
				//System.out.println("Perdu !");
			
		
	}

}

