package projeto_final_bloco_01.model;

import projeto_final_bloco_01.util.Cores;

public class Software extends Produto {
	
	private int versao;
	
	public Software(int id, String nome, int tipo, float preco, int versao) {
		super(id, nome, tipo, preco);
		this.versao = versao;
		
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		
		System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + 
				"  Versão do Software: v." + this.versao + "                          " + Cores.TEXT_RESET);
		System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN + 
				"***********************************************************" + Cores.TEXT_RESET);
	}

	

	
	
}
