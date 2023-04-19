package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ExecColl3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		Set<Integer> num = new HashSet<Integer>();
		
		int numuser=0;
		
		
		//Entrada de dados realizadas pelo usuario//
		for(int i=0;i<10;i++) {
			System.out.println("Digite um "+(i+1)+" número: ");
			numuser = leia.nextInt();
			num.add(numuser);
			}
		
	
		
		
		
		Iterator<Integer> inum = num.iterator();
		
		
		// Organiza ordem crescente
		
	
		System.out.println("\nListagem dados do Set...");
		while(inum.hasNext()) {			
			
		//impressão//	
			System.out.println(inum.next());;
			}
		
		}

}
