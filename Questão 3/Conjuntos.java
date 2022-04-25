package aula01;

import java.util.ArrayList;

public class Conjunto {
	public static void main(String[] args) {
		//Cria a lista de conjuntos
		ArrayList<Ajuda> lista = new ArrayList<>();
		
		//Demarcador
		int i = 0;
		
		while(i < 4) {	
			System.out.println("Informe o dígito do comando:");
			System.out.println("1.Criar um Conjunto.");
			System.out.println("2.Inserir elementos no conjunto.");
			System.out.println("3.printar");
			
			//Recebe a ordem
			int order = Util.readInt();
			
			//Operações
			if(order == 1) {
				//Cria o conjunto
				Ajuda conj = new Ajuda();
				lista.add(conj);
				System.out.println("Conjunto criado. Seu dígito é " + i);
				i++;
				
				//Limite
				if(i==4) {
					System.out.println("Limite de conjuntos execedido.");
					System.out.println("Fim do Programa");
				}
			}
			
			else if(order == 2) {
				System.out.println("Informe qual dígito do conjunto");
				int localizador = Util.readInt();
				System.out.println("Informe a quantidade de elementos:");
				int tam = Util.readInt();
				System.out.println("Digite os elementos:");
				for(int k = 0; k< tam; k++) {
					int number = Util.readInt();
					lista.get(localizador).conjuntinho.add(number);
				}
			}
			else if(order == 3) {
				System.out.println("Informe qual dígito do conjunto");
				int localizador = Util.readInt();
				System.out.println(lista.get(localizador).conjuntinho);
			}
		}
		
	}
	
}
