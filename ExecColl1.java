package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExecColl1 {

	public static void main(String[] args) {
		
		List<String> cores = new ArrayList<String>();
		
		Scanner leia = new Scanner (System.in);
		
		// adicionando elementos para dentro do meu ArrayList
				
		System.out.println("\nInforme 5 cores: ");
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite a "+(i+1)+" cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
			}
		
		for (String ListaElementos : cores) {
			System.out.println(ListaElementos);
		}
		
		// Organiza ordem crescente
		
		Collections.sort(cores);
		System.out.println("\nCores ordenadas...");
		System.out.println(cores);
		System.out.println();

	}

}
