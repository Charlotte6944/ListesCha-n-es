package fr.m2i;

public class Start {

	public static void main(String[] args) {
		
		ListeDChainee liste = new ListeDChainee();
		
		liste.add("rouge");
		liste.add(12);
		liste.add("vert");
		
		liste.remove(1);
		liste.get(0);
		
		liste.print();

	}

}
