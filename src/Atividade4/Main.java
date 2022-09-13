package Atividade4;

public class Main {

	public static void main(String[] args) {
		Chave<String, String>  c1 = new Chave<>();
		System.out.println(c1.addChave("1", "teste3"));
		System.out.println(c1.addChave("1", "teste2"));
		System.out.println(c1.buscaChave("1"));
	}

}
