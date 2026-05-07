package projeto_final_bloco_01.model;

import projeto_final_bloco_01.util.Cores;

public class Cibernetico extends Produto {
	
	private String parteCorpo;

	public Cibernetico(int id, String nome, int tipo, float preco, String parteCorpo) {
		super(id, nome, tipo, preco);
		this.parteCorpo = parteCorpo;
		
	}

	public String getParteCorpo() {
		return parteCorpo;
	}

	public void setParteCorpo(String parteCorpo) {
		this.parteCorpo = parteCorpo;
	}
	
	// Polimorfismo
	
		@Override
		public void visualizar() {
			super.visualizar();
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + 
					"  Slot de Instalação: " + this.parteCorpo + "                         " + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN + 
					" -------------------------------------------------- " + Cores.TEXT_RESET);

}
		
}
