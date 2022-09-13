package atividade1;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dados< Integer > d1 = new Dados<>(3);
		Dados< Double > d2 = new Dados<>(3.785);
		Dados< String > d3 = new Dados<>("Armazanamento");
		
		
		System.out.println(d1.getType());
		System.out.println(d2.getType());
		System.out.println(d3.getType());
		
		
	
	}
}



