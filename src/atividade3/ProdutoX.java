package atividade3;

public class ProdutoX {

	private double espesura;
	private String cor;
	
	public double getEspesura() {
		return espesura;
	}
	public void setEspesura(double espesura) {
		this.espesura = espesura;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public ProdutoX(double espesura, String cor) {
		this.espesura = espesura;
		this.cor = cor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoX [espesura=");
		builder.append(espesura);
		builder.append(", cor=");
		builder.append(cor);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
