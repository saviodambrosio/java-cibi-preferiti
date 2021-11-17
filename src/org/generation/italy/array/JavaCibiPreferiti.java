package org.generation.italy.array;

import java.util.Arrays;

public class JavaCibiPreferiti {

	public static void main(String[] args) {
		
		String[] cibipreferiti = {"Pizza" ,"Kebab", "Spaghetti allo scoglio", "Pasta alla carbonara" ,"Babbà", "Petto di pollo impanato"};

		int lunghezzaArray = cibipreferiti.length;
		System.out.println("Array di " + lunghezzaArray + " elementi");
		System.out.println("Il mio primo cibo preferito è la " + cibipreferiti[0]);
		System.out.println("Il mio quarto cibo preferito è la " + cibipreferiti[lunghezzaArray - 3]);
		System.out.println("Il mio ultimo cibo preferito è il " + cibipreferiti[5]);
	}

}
