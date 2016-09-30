package com.zoudys;

public class MyApp {

	public static void main(String[] args) {

		Couple<Integer> coupleA = new Couple<>();
		Couple<Integer> coupleB = new Couple<>();
		Triplet<Couple, Integer> tripletC = new Triplet<>();
		
		coupleA.setAbscisse(2);
		coupleA.setOrdonne(3);
		
		coupleB.setAbscisse(-1);
		coupleB.setOrdonne(4);
		
		tripletC.setAbscisse(coupleA);
		tripletC.setCote(2);
		
		System.out.println("A( "+coupleA.getAbscisse()+" , "+coupleA.getOrdonne()+" )");
		System.out.println("B( "+coupleB.getAbscisse()+" , "+coupleB.getOrdonne()+" )");
		
		System.out.println("C( "+tripletC.getAbscisse()+" , "+tripletC.getCote()+" , )");
		
	}

}
