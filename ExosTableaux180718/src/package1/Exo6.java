package package1;
import java.util.Scanner;
public class Exo6 {
// Demander à l’utilisateur d’entrer le nombre 25. Il devra remplacer le cinquième élément du tableau.
	
	public static void main(String[] args) {
		
		int [] tab = new int [8];
		// j'initialise les éléments de mon tableau
		tab [0] = 12;
		tab [1] = 15;
		tab [2] = 13;
		tab [3] = 10;
		tab [4] = 8;
		tab [5] = 9;
		tab [6] = 13;
		tab [7] = 14;
		
		// TODO Auto-generated method stub
	 // je déclare une variable de type Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrez le numéro 25 :");
		// int input = sc.nextInt();
		tab[4] = sc.nextInt();
		// j'annonce que l'élément 5 de mon tableau sera remplacé par l'input de mon user
		// tab [4] = input;
		System.out.println("Vous avez saisie :" + tab[4]);
	}

}
