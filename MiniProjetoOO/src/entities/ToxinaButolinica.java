package entities;

public class ToxinaButolinica extends Produto {
	private String funcionalidade;
	private double quantidadePorAmpola;

	public ToxinaButolinica(String nome, String tipo, int codigoCadastrado, double valor, int quantidadeEstoque,
			String funcionalidade, double quantidadePorAmpola) {
		super(nome, tipo, codigoCadastrado, valor, quantidadeEstoque);

		setFuncionalidade(funcionalidade);
		setQuantidadePorAmpola(quantidadePorAmpola);

	}

	public String getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(String funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public double getQuantidadePorAmpola() {
		return quantidadePorAmpola;
	}

	public void setQuantidadePorAmpola(double quantidadePorAmpola) {
		this.quantidadePorAmpola = quantidadePorAmpola;
	}

	public String toString() {
		return "Nome: " + nome + "\n" + " Tipo: " + tipo + "\n" + "Código Cadastrado: " + codigoCadastrado + "\n"
				+ "Valor:  " + valor + "\n" + "Quantidade em estoque: " + quantidadeEstoque + "\n"
				+ "Quantidade Por ampola: " + quantidadePorAmpola + " ml" + "\n" + "Funcionalidade: " + funcionalidade;

	}

}
