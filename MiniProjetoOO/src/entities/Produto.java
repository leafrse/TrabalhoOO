package entities;

public abstract class Produto {

	protected String nome;
	protected String tipo;
	protected int codigoCadastrado;
	protected double valor;
	protected int quantidadeEstoque;

	

	public Produto(String nome, String tipo, int codigoCadastrado, double valor, int quantidadeEstoque) {

		setNome(nome);
		setTipo(tipo);
		setCodigoCadastrado(codigoCadastrado);
		setValor(valor);
		setQuantidadeEstoque(quantidadeEstoque);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCodigoCadastrado() {
		return codigoCadastrado;
	}

	public void setCodigoCadastrado(int codigoCadastrado) {
		this.codigoCadastrado = codigoCadastrado;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	
}
