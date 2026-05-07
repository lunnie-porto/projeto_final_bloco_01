package projeto_final_bloco_01;

import java.util.Scanner;

import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.Cibernetico;
import projeto_final_bloco_01.model.Software;
import projeto_final_bloco_01.util.Cores;
import java.util.InputMismatchException;

public class Menu {

	private static final Scanner leia = new Scanner(System.in);
	private static final ProdutoController produtos = new ProdutoController();

	public static void main(String[] args) {

		int opcao;

		while (true) {

			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN
					+ " > L-SONGBIRD TECH _                              " + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_PURPLE
					+ " [ Intelligence & Cybernetics ]                   " + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN
					+ " -------------------------------------------------" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                  "
					+ Cores.TEXT_RESET);

			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  1 " + Cores.TEXT_CYAN
					+ "- Cadastrar Produto                           " + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  2 " + Cores.TEXT_CYAN
					+ "- Listar todos os Produtos                    " + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  3 " + Cores.TEXT_CYAN
					+ "- Atualizar Produto                           " + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  4 " + Cores.TEXT_CYAN
					+ "- Deletar Produto                             " + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  0 " + Cores.TEXT_RED
					+ "- Desconectar Sistema                         " + Cores.TEXT_RESET);

			System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                  "
					+ Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN
					+ " -------------------------------------------------" + Cores.TEXT_RESET);
			System.out.print(
					Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_PURPLE + " DIGITE UM COMANDO: " + Cores.TEXT_RESET + " ");
			
			try {
		        opcao = leia.nextInt();
		        leia.nextLine(); 
		    } catch (InputMismatchException e) {
		        opcao = -1;
		        System.out.println(Cores.TEXT_RED_BOLD + "\n[ERRO] Digite um número inteiro!\n\n" + Cores.TEXT_RESET);
		        leia.nextLine(); 
		        continue;
			}
			if (opcao == 0) {
				System.out.println(Cores.TEXT_CYAN + " Conexão Neural Encerrada. Até a próxima atualização." + Cores.TEXT_RESET);
				
			    sobre(); 
			    
			    leia.close();
			    System.exit(0); 

			}

			switch (opcao) {

			case 1:
				System.out
						.println(Cores.TEXT_WHITE_BOLD + "Iniciando Protocolo de Registro: Cadastrar Novo Item...\n\n");

				cadastrarProduto();
				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Acessando Banco de Dados: Listando todos os Itens...\n\n");

				listarProdutos();
				keyPress();
				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Sincronizando com a Rede: Atualizar Especificações...\n\n");
				atualizarProduto();
				keyPress();
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "ALERTA: Iniciando Protocolo de Purga: Deletar Produto do Sistema...\n\n");
				deletarProduto();
				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\n[ERRO] Comando não reconhecido. Verifique a sintaxe da rede L-SONGBIRD.\n\n");
				break;
			}
		}
	}
			
	public static void sobre() {
	    System.out.println(Cores.TEXT_CYAN + "****************************************************");
	    System.out.println(Cores.TEXT_WHITE_BOLD + " Projeto Desenvolvido por:  ");
	    System.out.println(Cores.TEXT_RESET + " Luana Moreira Porto - luanamporto45@gmail.com");
	    System.out.println(" https://github.com/lunnie-porto");
	    System.out.println(Cores.TEXT_CYAN + "****************************************************" + Cores.TEXT_RESET);
	}

	public static void cadastrarProduto() { // 1
		String nome, parteCorpo;
		float preco;
		int tipo, versao;

		System.out.println("Digite o Nome do Produto: ");
		leia.skip("\\R?");
		nome = leia.nextLine();

		System.out.println("Digite o Preço (Créditos): ");
		preco = leia.nextFloat();

		do {
			System.out.println("Digite o Tipo (1-Cibernético ou 2-Software): ");
			tipo = leia.nextInt();
		} while (tipo < 1 || tipo > 2);

		switch (tipo) {
		case 1 -> {
			System.out.println("Digite o Slot de Instalação (ex: Braços): ");
			leia.skip("\\R?");
			parteCorpo = leia.nextLine();
			produtos.cadastrar(new Cibernetico(produtos.gerarNumero(), nome, tipo, preco, parteCorpo));
		}
		case 2 -> {
			System.out.println("Digite a Versão do Software: ");
			versao = leia.nextInt();
			produtos.cadastrar(new Software(produtos.gerarNumero(), nome, tipo, preco, versao));
		}
		}
	}

	public static void listarProdutos() { // 2
		produtos.listarTodos();
	}

	public static void atualizarProduto() { // 3
		System.out.println("Digite o ID do produto que deseja atualizar: ");
		int id = leia.nextInt();

		var buscaProduto = produtos.buscarNaCollection(id);

		if (buscaProduto != null) {
			System.out.println("Digite o Novo Nome: ");
			leia.skip("\\R?");
			String nome = leia.nextLine();

			System.out.println("Digite o Novo Preço: ");
			float preco = leia.nextFloat();

			int tipo = buscaProduto.getTipo();

			if (tipo == 1) {
				System.out.println("Digite o Novo Slot: ");
				leia.skip("\\R?");
				String slot = leia.nextLine();
				produtos.atualizar(new Cibernetico(id, nome, tipo, preco, slot));
			} else {
				System.out.println("Digite a Nova Versão: ");
				int versao = leia.nextInt();
				produtos.atualizar(new Software(id, nome, tipo, preco, versao));
			}
		} else {
			System.out.println("\nProduto não encontrado!");
		}
	}

	public static void deletarProduto() { // 4
		System.out.println("Digite o ID do produto a ser deletado: ");
		int id = leia.nextInt();

		System.out.println("\nConfirmar exclusão? (S/N): ");
		leia.skip("\\R?");
		String confirma = leia.nextLine();

		if (confirma.equalsIgnoreCase("S")) {
			produtos.deletar(id);
		} else {
			System.out.println("Operação abortada.");
		}
	}

	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
		leia.skip("\\R?");
		leia.nextLine();
	}
}
