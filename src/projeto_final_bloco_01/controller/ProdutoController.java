package projeto_final_bloco_01.controller;

import projeto_final_bloco_01.repository.ProdutoRepository;

import java.util.ArrayList;

import projeto_final_bloco_01.model.Produto;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	int numero = 0;

	@Override
	public void procurarPorId(int id) {
		var produto = buscarNaCollection(id);
		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO Produto ID: " + id + " não foi encontrado!");
	}
	

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nProduto " + produto.getNome() + " cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO Produto ID: " + produto.getId() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\nO Produto ID: " + produto.getId() + " não foi encontrado!");
		}

	}

@Override
public void deletar(int id) {
	var produto = buscarNaCollection(id);

	if (produto != null) {
		if (listaProdutos.remove(produto) == true)
			System.out.println("\nO Produto ID: " + id + " foi deletado com sucesso!");
	} else {
		System.out.println("\nO Produto ID: " + id + " não foi encontrado!");
	}
}
	

public int gerarNumero() {
    return ++numero;
}
public Produto buscarNaCollection(int id) {
	for (var produto : listaProdutos) {
		if (produto.getId() == id) {
			return produto;
		}
	}
	return null;
}
}

