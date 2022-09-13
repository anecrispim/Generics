package atividade3;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
	private int numPedido;
	private List<ProdutoX>  listaProduto = new ArrayList<ProdutoX>();
	
	public int getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	public List<ProdutoX> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(ProdutoX p) {
		this.listaProduto.add(p);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedidos [numPedido=");
		builder.append(numPedido);
		builder.append(", listaProduto=");
		builder.append(listaProduto);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
