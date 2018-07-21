package package1;

import java.util.Scanner;

//Demander à l’utilisateur d’entrer un nombre entier et stocker sa valeur dans une variable nommée input.

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//importer le scanner
		//déclarer le scanner
		// Scanner <nom de Scanner>
		Scanner sc;
		// <nom du Scanner> = new Scanner 
		// créer une instance de scanner avec new(System.in);
		sc = new Scanner(System.in);
		// j'indique à l'user de taper un chiffre
		System.out.println("Veuillez entrez un chiffre :");
		// je crée une variable input +  je vérifie que l'user a tapé un chiffre
		int input = sc.nextInt();
		// nextInt c'est une méthode de la classe Scanner 
		// j'indique la saisie 
		System.out.println("Vous avez saisie : " + input);
	}

}
