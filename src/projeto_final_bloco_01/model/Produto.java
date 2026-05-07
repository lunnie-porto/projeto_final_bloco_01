package projeto_final_bloco_01.model;

import projeto_final_bloco_01.util.Cores;

public abstract class Produto {
	
	// Atributos
	private int id;
    private String nome;
    private int tipo;
    private float preco;
    
    // Construtor
	public Produto(int id, String nome, int tipo, float preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
    
	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Cibernético";
			break;
		case 2:
			tipo = "Software";
			break;
        }

        System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN + " -------------------------------------------------- " + Cores.TEXT_RESET);
        System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_PURPLE + "  DETALHES DO ITEM NO INVENTÁRIO                   " + Cores.TEXT_RESET);
        System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN + " -------------------------------------------------- " + Cores.TEXT_RESET);
        System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  ID: " + this.id + "                                             " + Cores.TEXT_RESET);
        System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  Nome: " + this.nome + "                                         " + Cores.TEXT_RESET);
        System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  Tipo: " + tipo + "                                     " + Cores.TEXT_RESET);
        System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD + "  Preço: " + this.preco + " Créditos                         " + Cores.TEXT_RESET);
    }

     
    
}

