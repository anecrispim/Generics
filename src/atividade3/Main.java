package atividade3;

public class Main {

	public static void main(String[] args) {
		
		ProdutoX p1 = new ProdutoX(0.6, "Vermelha");
		ProdutoX p2 = new ProdutoX(0.8, "Amarela");
		
		Pedidos Pedido1 = new Pedidos();
		
		Pedido1.setListaProduto(p1);
		Pedido1.setListaProduto(p2);
		Pedido1.setNumPedido(1254);
		
		System.out.println(Pedido1.toString());

	}

}
