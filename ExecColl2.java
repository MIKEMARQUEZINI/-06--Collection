package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExecColl2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		List<Integer> num = new ArrayList<Integer>();
		int user;
		
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
		
		
		if (num.contains(user)) {
			System.out.println("\nO número ("+user+") está localizado na posição "+num.indexOf(user));
		}else {
			System.out.println("\nO número ("+user+") não foi encontrado");
		
		}
	}
}
