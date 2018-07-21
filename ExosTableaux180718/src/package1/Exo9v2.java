package package1;

import java.util.Scanner;

public class Exo9v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab = new int [8];
		tab [0] = 12;
		tab [1] = 15;
		tab [2] = 13;
		tab [3] = 10;
		tab [4] = 8;
		tab [5] = 9;
		tab [6] = 13;
		tab [7] = 14;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Veuillez saisir un nombre entier :");
		int input = sc.nextInt();
		
		// On compare chaque élements du tableau avec la syntaxe or 
		if ((input == tab[0] || (input == tab[1]) || (input == tab[2]) || (input == tab[3]) || (input == tab[4]) || (input == tab[5]) || (input == tab[6]) || (input == tab[7]))){
			System.out.println("Bravo !");
		}
		// || = OR 
		
		else {
			System.out.println("Perdu! ");
		}
				
	}

}
