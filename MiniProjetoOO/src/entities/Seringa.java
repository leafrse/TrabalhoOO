package entities;

public class Seringa extends Produto {

	private double tamanho;
	private double expessuraDaAgulha;

	public Seringa(String nome, String tipo, int codigoCadastrado, double valor, int quantidadeEstoque, double tamanho,
			double expessuraDaAgulha) {
		super(nome, tipo, codigoCadastrado, valor, quantidadeEstoque);

		this.nome = nome;
		this.tipo = tipo;
		this.codigoCadastrado = codigoCadastrado;
		this.valor = valor;
		this.quantidadeEstoque = quantidadeEstoque;
		this.tamanho = tamanho;
		this.expessuraDaAgulha = expessuraDaAgulha;
		
	}

	public double getTamanho() {
		return tamanho;
	}

	public double setTamanho(double tamanho) {
		return tamanho;
	}

	public double getExpessuraDaAgulha() {
		return expessuraDaAgulha;
	}

	public void setExpessuraDaAgulha(double expessuraDaAgulha) {
		this.expessuraDaAgulha = expessuraDaAgulha;
	}

	public String toString() {
		return "Nome: " + nome + "\n" + " Tipo: " + tipo + "\n" + "Código Cadastrado: " + codigoCadastrado + "\n"
				+ "Valor:  " + valor + "\n" + "Quantidade em estoque: " + quantidadeEstoque + "\n"
				+ "Expessura da agulha: " + expessuraDaAgulha + "\n" + "Tamanho: " + tamanho + "cm";

	}

}
