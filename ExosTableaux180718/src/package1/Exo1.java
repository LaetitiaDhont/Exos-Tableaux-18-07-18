package package1;
/*
 * Dans cet exercice, on va travailler avec un tableau d�entiers appel� tab contenant les valeurs suivantes : 
12, 15, 13, 10, 8, 9, 13 et 14.

 */
public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//d�clarer le tableau
		int [] tab;
		// donner une taille
		tab = new int [8];
		//initialiser les �l�ments du tableau
		
		tab [0] = 12;
		tab [1] = 15;
		tab [2] = 13;
		tab [3] = 10;
		tab [4] = 8;
		tab [5] = 9;
		tab [6] = 13;
		tab [7] = 14; // <--- il est la 
		
		// int [] tab = {12,15,13,10,8,9,13,14};
		
		System.out.println(tab[7]);
		// J'affiche le huiti�me �l�ment de mon tableau, puisque l'index de mon tableau commence � -1, le huiti�me �lement est � la position 7.
	
	}

}
