package Atividade4;

import java.util.ArrayList;

public class Chave<K, V>{
	private ArrayList<K> key = new ArrayList<K>();
	private ArrayList<V> value = new ArrayList<V>();
	private int cont = 0;
	
	public boolean addChave(K key, V value){
		for (int i = 0; i < this.key.toArray().length; i++) {
			if (this.key.toArray()[i] == key) {
				return false;
			}
		}
		this.key.add(key);
		this.value.add(value);
		cont++;
		return true;
	}
	@SuppressWarnings("unchecked")
	public V buscaChave(K key) {
		for (int i = 0; i < this.key.toArray().length; i++) {
			if (this.key.toArray()[i] == key) {
				return (V) this.value.toArray()[i];
			}
		}
		return null;
	}
}
