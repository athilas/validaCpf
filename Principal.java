/**
*	NAME: Software que verifica validade de valor digitado de cpf.
*	@author: Athila Wender de Salles
*	@version: 1.0
*/

import java.util.Scanner;

public class Principal{
	public static void main(String[] args){
		int i = 0, j=0;
		String cpf;
		Scanner ler = new Scanner(System.in);
		while(i==0)
		{
			System.out.print("Validador de cpf!\n");
			System.out.print("(1) - Verificar CPF digite 1 \n(2) - Sobre e ajuda digite 2 \n(3) - Sair digite 3\n");
			j = ler.nextInt();
			switch (j){
				case 1:
					System.out.print("\nDigite o cpf somente numeros: ");
					cpf = ler.next();
					if(Numero.teste(cpf)) Valida.teste(cpf);
					else System.out.println("Contem caracteres nao numericos. Teste abortado");
					j =0;
					break;
				case 2:
					System.out.println("A ser implementado");
					break;
				case 3:
					System.out.println("Saindo do programa");
					i =1;
					break;
				default:
					System.out.println("Opcao invalida, escolha uma das opcoes:");
					break;
			}
		}
	}
}