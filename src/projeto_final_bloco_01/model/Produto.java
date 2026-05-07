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

		System.out.println("\n" + Cores.TEXT_CYAN + "--------------------------------------------------");
	    System.out.println(Cores.TEXT_PURPLE_BOLD + " DETALHES DO ITEM NO INVENTÁRIO                   ");
	    System.out.println(Cores.TEXT_CYAN + "--------------------------------------------------" + Cores.TEXT_RESET);
	    System.out.println(Cores.TEXT_WHITE_BOLD + " ID: " + Cores.TEXT_RESET + this.id);
	    System.out.println(Cores.TEXT_WHITE_BOLD + " Nome: " + Cores.TEXT_RESET + this.nome);
	    System.out.println(Cores.TEXT_WHITE_BOLD + " Tipo: " + Cores.TEXT_RESET + tipo);
	    System.out.println(Cores.TEXT_WHITE_BOLD + " Preço: " + Cores.TEXT_RESET + this.preco + " Créditos");
    }

     
    
}

