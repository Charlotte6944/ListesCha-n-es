package fr.m2i;

public class Start {

	public static <T> void main(String[] args) {
		
		ListeDChainee<T> liste = new ListeDChainee<T>();
		
		liste.add("rouge");
		liste.add(12);
		liste.add("vert");
		
		liste.remove(1);
		liste.get(0);
		
		liste.print();

	}

}
