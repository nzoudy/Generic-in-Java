package com.zoudys;

public class Couple<T> {

	private T abscisse;
	private T ordonne;
	
	public Couple() {
		super();
	}
	
	public Couple(T abscisse, T ordonne) {
		super();
		this.abscisse = abscisse;
		this.ordonne = ordonne;
	}

	public T getAbscisse() {
		return abscisse;
	}

	public void setAbscisse(T abscisse) {
		this.abscisse = abscisse;
	}

	public T getOrdonne() {
		return ordonne;
	}

	public void setOrdonne(T ordonne) {
		this.ordonne = ordonne;
	}
	
	
}
