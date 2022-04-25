import java.util.*;

public class Conjuntos {
	public static void main(String[] args) {
		//Cria a lista de conjuntos
		ArrayList<Ajuda> lista = new ArrayList<>();
		
		//Demarcador
		int i = 0;
		
		while(true) {	
			System.out.println("Informe o dígito do comando:");
			System.out.println("1.Criar um Conjunto.");
			System.out.println("2.Inserir elementos no conjunto.");
			System.out.println("3.Verificar pertencimento de um elemento.");
			System.out.println("4.Verificação de um conjunto ser subconjunto do outro.");
			System.out.println("5.União de conjuntos.");
			System.out.println("6.Intersecção de conjuntos.");	
			System.out.println("7.Diferença de dois conjuntos.");
			System.out.println("8.printar.");
			System.out.println("9.Fim do programa.");
			
			//Recebe a ordem
			int order = Util.readInt();
			
			//---------Operações---------//
			
			//Comando 1
			if(order == 1) {
				//Cria o conjunto
				Ajuda conj = new Ajuda();
				lista.add(conj);
				System.out.println("Conjunto criado. Seu dígito é " + i);
				i++;
			}
			
			//Comando 2
			else if(order == 2) {
				System.out.println("Informe qual dígito do conjunto");
				int localizador = Util.readInt();
				//Verificar se o conjunto existe 
				if(localizador > (i - 1)) {
					System.out.println("Conjunto inexistente.");
					continue;
				}
				
				//Adicionar elementos
				System.out.println("Informe a quantidade de elementos:");
				int tam = Util.readInt();
				System.out.println("Digite os elementos:");
				for(int k = 0; k< tam; k++) {
					int number = Util.readInt();
					lista.get(localizador).conjuntinho.add(number);
				}
				System.out.println("Elementos inseridos.");
			}
			
			//Comando 3
			else if(order == 3) {
				System.out.println("Informe o dígito do conjunto.");
				int localizador = Util.readInt();
				//Verificar se o conjunto existe 
				if(localizador > (i - 1)) {
					System.out.println("Conjunto inexistente.");
					continue;
				}
				
				System.out.println("Digite qual o elemento deseja verificar a pertinência.");
				int element = Util.readInt();
				System.out.println("O conjunto " + localizador + " contém o elemento " + element + ": "+ lista.get(localizador).conjuntinho.contains(element));
			}
			
			//Comando 4
			else if(order == 4) {
				System.out.println("Informe o dígito do conjunto principal:");
				int localizador1 = Util.readInt();
				//Verificar se o primeiro conjunto existe 
				if(localizador1 > (i - 1)) {
					System.out.println("Conjunto inexistente.");
					continue;
				}
				
				System.out.println("Informe o dígito do conjunto secundário, o qual será verificado se é de fato ou não subconjunto:");
				int localizador2 = Util.readInt();
				//Verificar se o segundo conjunto existe 
				if(localizador2 > (i - 1)) {
					System.out.println("Conjunto inexistente.");
					continue;
				}
				
				System.out.println("O conjunto " + localizador2 + " é subconjunto de " + localizador1 + ": " +
				lista.get(localizador1).conjuntinho.containsAll(lista.get(localizador2).conjuntinho));
			}
			
			//Comando 5
			else if(order == 5) {
				System.out.println("Informe o dígito do primeiro conjunto");
				int localizador1 = Util.readInt();
				//Verificar se o primeiro conjunto existe 
				if(localizador1 > (i - 1)) {
					System.out.println("Conjunto inexistente.");
					continue;
				}
				
				System.out.println("Informe o dígito do segundo conjunto");
				int localizador2 = Util.readInt();
				//Verificar se o segundo conjunto existe 
				if(localizador2 > (i - 1)) {
					System.out.println("Conjunto inexistente.");
					continue;
				}
				
				//Criar conjunto união
				Ajuda conj = new Ajuda();
				lista.add(conj);
				lista.get(i).conjuntinho.addAll(lista.get(localizador1).conjuntinho);
				lista.get(i).conjuntinho.addAll(lista.get(localizador2).conjuntinho);
				System.out.println("Conjunto da união criado. Seu dígito é " + i);
				i++;
			}
			
			//Comando 6
			else if(order == 6) {
				System.out.println("Informe qual dígito do primeiro conjunto conjunto.");
				int localizador1 = Util.readInt();
				//Verificar se o primeiro conjunto existe 
				if(localizador1 > (i - 1)) {
					System.out.println("Conjunto inexistente.");
					continue;
				}
				
				System.out.println("Informe qual dígito do segundo conjunto conjunto.");
				int localizador2 = Util.readInt();
				//Verificar se o segundo conjunto existe 
				if(localizador2 > (i - 1)) {
					System.out.println("Conjunto inexistente.");
					continue;
				}
				
				//Criar conjunto de intersecção
				Ajuda conj = new Ajuda();
				lista.add(conj);
				lista.get(i).conjuntinho.addAll(lista.get(localizador1).conjuntinho);
				lista.get(i).conjuntinho.retainAll(lista.get(localizador2).conjuntinho);
				System.out.println("Conjunto de intersecção criado. Seu dígito é " + i);
				i++;	
			}
			
			//Comando 7
			else if(order == 7) {
				System.out.println("Informe qual dígito do primeiro conjunto conjunto.");
				int localizador1 = Util.readInt();
				//Verificar se o primeiro conjunto existe 
				if(localizador1 > (i - 1)) {
					System.out.println("Conjunto inexistente.");
					continue;
				}
				
				System.out.println("Informe qual dígito do segundo conjunto conjunto.");
				int localizador2 = Util.readInt();
				//Verificar se o segundo conjunto existe 
				if(localizador2 > (i - 1)) {
					System.out.println("Conjunto inexistente.");
					continue;
				}
				
				//Criar conjunto de diferença
				Ajuda conj = new Ajuda();
				lista.add(conj);
				lista.get(i).conjuntinho.addAll(lista.get(localizador1).conjuntinho);
				lista.get(i).conjuntinho.removeAll(lista.get(localizador2).conjuntinho);
				System.out.println("Conjunto de diferença criado. Seu dígito é " + i);
				i++;	
			}
			
			//Comando 8
			else if(order == 8) {
				System.out.println("Informe qual dígito do conjunto");
				int localizador = Util.readInt();
				System.out.println(lista.get(localizador).conjuntinho);
			}
			
			//Comando 9
			else if(order == 9) {
				System.out.println("Fim do programa.");
				break;
			}
			
			//Comando inexistente
			else {
				System.out.println("ERRO. Código inválido.");
			}
		}	
	}	
}
