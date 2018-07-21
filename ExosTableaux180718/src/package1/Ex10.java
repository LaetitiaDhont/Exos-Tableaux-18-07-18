package package1;

import java.util.Scanner;

/*
 * 10) Demander à l’utilisateur d’entrer un nombre entier. Le comparer à chaque élément du tableau. 
 * Si les nombres sont identiques, afficher “Bravo !”. Sinon, afficher “Perdu !”.
/!\ Les boucles sont autorisées !

 */
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab = new int [8];
		tab [0] = 12;
		tab [1] = 15;
		tab [2] = 13;
		tab [3] = 10;
		tab [4] = 8;
		tab [5] = 9;
		tab [6] = 24;
		tab [7] = 14;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Veuillez saisir un nombre entier :");
		int input = sc.nextInt();
		// on crée la boucle
		for (int i = 0; i < tab.length; i++) {
			if (input == tab[i]) {
				System.out.println("Bravo!");
			}
			
			else {
				System.out.println("Perdu!");
			}
		
			
				
			
		}

	}
}
