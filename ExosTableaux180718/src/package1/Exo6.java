package package1;
import java.util.Scanner;
public class Exo6 {
// Demander � l�utilisateur d�entrer le nombre 25. Il devra remplacer le cinqui�me �l�ment du tableau.
	
	public static void main(String[] args) {
		
		int [] tab = new int [8];
		// j'initialise les �l�ments de mon tableau
		tab [0] = 12;
		tab [1] = 15;
		tab [2] = 13;
		tab [3] = 10;
		tab [4] = 8;
		tab [5] = 9;
		tab [6] = 13;
		tab [7] = 14;
		
		// TODO Auto-generated method stub
	 // je d�clare une variable de type Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrez le num�ro 25 :");
		// int input = sc.nextInt();
		tab[4] = sc.nextInt();
		// j'annonce que l'�l�ment 5 de mon tableau sera remplac� par l'input de mon user
		// tab [4] = input;
		System.out.println("Vous avez saisie :" + tab[4]);
	}

}
