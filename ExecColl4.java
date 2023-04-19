package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExecColl4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		Set<Integer> num = new HashSet<Integer>();
		
		int user=0;
		
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
		System.out.println("\nDigite o número que você deseja encontrar:");
		user= leia.nextInt();
		
		boolean verifica;
		verifica = num.contains(user);
		
		if (verifica = true) {
			System.out.println("\nO número ("+user+") foi encontrado!");
		}else {
			System.out.println("\nO número ("+user+") não foi encontrado");
		
		}
			
		}
	

}
