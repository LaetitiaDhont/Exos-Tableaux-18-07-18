package package1;
//4) Afficher tous les �l�ments du tableau. /!\ La boucle �for� est obligatoire !

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// je d�clare mon tableau et je lui donne une taille
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
		
		// la boucle for permet d'afficher tout �l�ments du tableau donc je pars de la position z�ro, tant que i < 8 j'incr�mente i jusqu'� 7
		// i pour iterateur
		for ( int i = 0; i <8; i++)
			// pos = pos + 1 similar to pos++
			// j'affiche pos
			System.out.println(tab[i]);
	}

}
