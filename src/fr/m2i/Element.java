package fr.m2i;

public class Element <T> {

	private T valeurElement;
	private Element <T> precElement;
	private Element <T> suivElement;
	
	public Element(T valeurElement) {
		this.setValeurElement(valeurElement);
	}
	
	public Element(T valeurElement, Element <T> precElement) {
		this.setValeurElement(valeurElement);
		this.setPrecElement(precElement);
	}
	
	public T getValeurElement() {
		return valeurElement;
	}
	public void setValeurElement(T valeurElement) {
		this.valeurElement = valeurElement;
	}
	public Element <T> getPrecElement() {
		return precElement;
	}
	public void setPrecElement(Element <T> precElement) {
		this.precElement = precElement;
	}
	public Element <T> getSuivElement() {
		return suivElement;
	}
	public void setSuivElement(Element <T> suivElement) {
		this.suivElement = suivElement;
	}
	
}
