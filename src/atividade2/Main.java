package atividade2;

public class Main {

	public static void main(String[] args) {
		
		Produto<Integer> p1 = new Produto<>(1, "Carta", 1.56, "12/07/2022", "12/08/2022");
		
		Produto<String> p2 = new Produto<>("1A5", "Carta", 1.56, "12/07/2022", "12/08/2022");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
