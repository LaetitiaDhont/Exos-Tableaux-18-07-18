package package1;
import java.util.Scanner;
// Demander à l’utilisateur d’entrer un nombre entier. Le comparer au troisième élément du tableau. Si les nombres sont identiques, afficher “Bravo !”.
public class Exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// je déclare mon tableau
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
		
		// je déclare une variable de type Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre entier : ");
		int input = sc.nextInt();
		// j'impose ma condition : si l'user tape le nombre qui est à la position 2 de mon tableau alors affiche Bravo
		// == --> comparer = --> j'attribue une valeur
		if (input == tab[2]) {
			System.out.println("Bravo !");
			
		}
		
	}

}
