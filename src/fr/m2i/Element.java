package fr.m2i;

public class Element <T> {

	private T valeurElement;
	private Element precElement;
	private Element suivElement;
	
	public Element(T valeurElement) {
		this.setValeurElement(valeurElement);
	}
	
	public Element(T valeurElement, Element precElement) {
		this.setValeurElement(valeurElement);
		this.setPrecElement(precElement);
	}
	
	public T getValeurElement() {
		return valeurElement;
	}
	public void setValeurElement(T valeurElement) {
		this.valeurElement = valeurElement;
	}
	public Element getPrecElement() {
		return precElement;
	}
	public void setPrecElement(Element precElement) {
		this.precElement = precElement;
	}
	public Element getSuivElement() {
		return suivElement;
	}
	public void setSuivElement(Element suivElement) {
		this.suivElement = suivElement;
	}
	
}
