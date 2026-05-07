package projeto_final_bloco_01;

import java.util.Scanner;

import projeto_final_bloco_01.util.Cores;

public class Menu {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		 while (true) {
		    
			 System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN + " > L-SONGBIRD TECH _                              " + Cores.TEXT_RESET);
			 System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_PURPLE + " [ Intelligence & Cybernetics ]                   " + Cores.TEXT_RESET);
			 System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN + " -------------------------------------------------" + Cores.TEXT_RESET);
			 System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                  " + Cores.TEXT_RESET);

			 System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  1 " + Cores.TEXT_CYAN + "- Cadastrar Produto                           " + Cores.TEXT_RESET);
			 System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  2 " + Cores.TEXT_CYAN + "- Listar todos os Produtos                    " + Cores.TEXT_RESET);
			 System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  3 " + Cores.TEXT_CYAN + "- Atualizar Produto                           " + Cores.TEXT_RESET);
			 System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  4 " + Cores.TEXT_CYAN + "- Deletar Produto                             " + Cores.TEXT_RESET);
			 System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  0 " + Cores.TEXT_RED + "- Desconectar Sistema                         " + Cores.TEXT_RESET);

			 System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                  " + Cores.TEXT_RESET);
			 System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN + " -------------------------------------------------" + Cores.TEXT_RESET);
			 System.out.print(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_PURPLE + " DIGITE UM COMANDO: " + Cores.TEXT_RESET + " ");

			 opcao = leia.nextInt();
		    		
		    		if (opcao == 0) {
		    	        System.out.println(Cores.TEXT_YELLOW_BOLD + "\n[SISTEMA] Encerrando processos da L-SONGBIRD TECH...");
		    	        System.out.println("Conexão finalizada com sucesso." + Cores.TEXT_RESET);
		    	        leia.close();
		    	        System.exit(0);
		    	        
		    		}
		    		
		    		switch (opcao) {
		    	    case 1:
		    	        System.out.println(Cores.TEXT_WHITE_BOLD + "Iniciando Protocolo de Registro: Cadastrar Novo Item de Hardware...\n\n");
		    	        // cadastrar
		    	        break;
		    	        
		    	    case 2:
		    	        System.out.println(Cores.TEXT_WHITE_BOLD + "Acessando Banco de Dados: Listando todos os Itens no Inventário...\n\n");
		    	        // listar
		    	        break;
		    	        
		    	    case 3:
		    	        System.out.println(Cores.TEXT_WHITE_BOLD + "Sincronizando com a Rede: Atualizar Especificações do Produto...\n\n");
		    	        // atualizar
		    	        break;
		    	        
		    	    case 4:
		    	        System.out.println(Cores.TEXT_WHITE_BOLD + "ALERTA: Iniciando Protocolo de Purga: Deletar Produto do Sistema...\n\n");
		    	        // excluir
		    	        break;
		    	        
		    	    default:
		    	        System.out.println(Cores.TEXT_RED_BOLD + "\n[ERRO] Comando não reconhecido. Verifique a sintaxe da rede L-SONGBIRD.\n\n");
		    	        break;
		 }
	}
		 
	}
}
