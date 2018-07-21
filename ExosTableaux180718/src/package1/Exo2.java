package package1;
//Modifier le cinquième élément du tableau pour lui attribuer la valeur 5 et l’afficher.
public class Exo2 {
// Je mets des commentaires car sinon Vanessa elle va crier et ça me fait peur
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//déclarer le tableau 
		int [] tab;
		//donner une taille
		tab = new int [8];
		// initialiser les élements du tableau 
		tab [0] = 12;
		tab [1] = 15;
		tab [2] = 13;
		tab [3] = 10;
		tab [4] = 8;
		tab [5] = 9;
		tab [6] = 13;
		tab [7] = 14;
		 
		// je remplace le 5ème élément qui est à la position 4 (car taille = -1)
		tab [4] = 5; 
		System.out.println(tab[4]);
		
	}

}
