package atividade2;

public class Produto<V> {
	private V id;
	private String produto;
	private double valor;
	private String dataFabricacao;
	private String dataVencimento;
	
	public Produto(V id, String produto , double valor, String dataFabricacao, String dataVencimento) {
		this.id = id;
		this.produto = produto;
		this.valor = valor;
		this.dataFabricacao = dataFabricacao;
		this.dataVencimento = dataFabricacao;
	}

	public V getId() {
		return id;
	}

	public void setId(V id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id);
		builder.append(", produto=");
		builder.append(produto);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dataFabricacao=");
		builder.append(dataFabricacao);
		builder.append(", dataVencimento=");
		builder.append(dataVencimento);
		builder.append("]");
		return builder.toString();
	}
	
	

	
	
	
	
	

}
