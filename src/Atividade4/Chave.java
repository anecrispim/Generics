package Atividade4;

import java.util.List;

public class Chave<K, V>{
	private K key;
	private V Value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return Value;
	}
	public void setValue(V value) {
		Value = value;
	}
	
	public Chave(K key, V value) {
		this.key = key;
		Value = value;
	}
	
	public boolean addLista(List<Chave<String,Integer>> lista) {
		
		
		return false;
	}
	public Chave verificaLista(List<Chave<String,Integer>> lista) {
		//lista.get()
		
		
		return null;
			
	
	}
	
	

	
}
