package atividade1;



public abstract class DadosEntrada {
	public abstract void consultar();
}

class DadoString extends DadosEntrada {
	private String str;

	public void MeuString(String string) {
		String str = string;
	}

	public String getStr() {
		return str;
	}

	public DadoString(String str) {
		super();
		this.str = str;
	}

	@Override
	public void consultar() {
		System.out.println("Entrada de Texto " + getStr());

	}

}

class DadoInt extends DadosEntrada {

	private Integer numeroInt;

	public Integer getNumeroInt() {
		return numeroInt;
	}

	public void setNumeroInt(Integer numeroInt) {
		this.numeroInt = numeroInt;
	}
	
	public DadoInt(Integer numeroInt) {
		super();
		this.numeroInt = numeroInt;
	}

	@Override
	public void consultar() {
		System.out.println("Entrada de Numero inteiro " + getNumeroInt());

	}

}

class DadoDouble extends DadosEntrada {

	private Double numeroDuble;

	
	public Double getNumeroDuble() {
		return numeroDuble;
	}


	public void setNumeroDuble(Double numeroDuble) {
		this.numeroDuble = numeroDuble;
	}
	
	
	

	public DadoDouble(Double numeroDuble) {
		super();
		this.numeroDuble = numeroDuble;
	}


	@Override
	public void consultar() {
		System.out.println("Entrada de Numero Double " + getNumeroDuble());
		
	}

}

class DadoCaracter extends DadosEntrada {
	
	private char Caracter;
	
	public DadoCaracter(char caracter) {
		super();
		Caracter = caracter;
	}

	public char getCaracter() {
		return Caracter;
	}

	public void setCaracter(char caracter) {
		Caracter = caracter;
	}

	@Override
	public void consultar() {
		System.out.println("Entrada de Caracter  - " + getCaracter());

	}

}
