package com.zoudys;

public class Triplet<T, T2> extends Couple<T>{

	private T2 cote;

	public Triplet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triplet(T abscisse, T ordonne, T2 cote) {
		super(abscisse, ordonne);
		this.cote = cote;
	}

	public T2 getCote() {
		return cote;
	}

	public void setCote(T2 cote) {
		this.cote = cote;
	}
	
	
	
}
