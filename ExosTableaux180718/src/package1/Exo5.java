package package1;

import java.util.Scanner;

//Demander � l�utilisateur d�entrer un nombre entier et stocker sa valeur dans une variable nomm�e input.

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//importer le scanner
		//d�clarer le scanner
		// Scanner <nom de Scanner>
		Scanner sc;
		// <nom du Scanner> = new Scanner 
		// cr�er une instance de scanner avec new(System.in);
		sc = new Scanner(System.in);
		// j'indique � l'user de taper un chiffre
		System.out.println("Veuillez entrez un chiffre :");
		// je cr�e une variable input +  je v�rifie que l'user a tap� un chiffre
		int input = sc.nextInt();
		// nextInt c'est une m�thode de la classe Scanner 
		// j'indique la saisie 
		System.out.println("Vous avez saisie : " + input);
	}

}
