package package1;

import java.util.Scanner;

public class Exo9 {

	/*
	 * Demander à l’utilisateur d’entrer un nombre entier. Le comparer à chaque élément du tableau. Si les nombres sont identiques, afficher “Bravo !”. Sinon, afficher “Perdu !”.
/!\ Les boucles sont interdites !

	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// je déclare mon tableau
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
		// j'impose ma condition : si l'user tape le nombre qui est à n'importe quel position de mon tableau alors affiche Bravo
		// == --> comparer = --> j'attribue une valeur
		
		if (input == tab[0]) {
			System.out.println("Bravo !");
		}
		
		else if (input == tab[1]) {
			System.out.println("Bravo !");
		}
		
		else if (input == tab[2]) {
			System.out.println("Bravo !");
		}
		
		else if (input == tab[3]) {
			System.out.println("Bravo !");
		}
		
		else if (input == tab[4]) {
			System.out.println("Bravo !");
		}
		
		else if (input == tab[5]) {
			System.out.println("Bravo !");
		}
		
		else if (input == tab[6]) {
			System.out.println("Bravo !");
		}
		
		else if (input == tab[7]) {
			System.out.println("Bravo !");
		}
		// sinon affiche perdu 
		else {
			System.out.println("Perdu !");
		}
	}

}
