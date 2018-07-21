package package1;
import java.util.Scanner;
public class Exo8 {

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
		// je déclare une variable de type Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre entier : ");
		int input = sc.nextInt();
		// j'impose ma condition : si l'user tape le nombre qui est à la position 2 de mon tableau alors affiche Bravo
		// == --> comparer = --> j'attribue une valeur
		if (input == tab[2]) {
		System.out.println("Bravo !");
					
		}
		
		// sinon, imprime perdu 
		else {
			System.out.println("Perdu !");
		}
		
	}

}
