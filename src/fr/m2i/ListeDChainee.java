package fr.m2i;

public class ListeDChainee<T> {
	
	private Element<T> premierElement;
	private Element<T> dernierElement;
	
	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> void add(T valeurElement)  {
		if(premierElement == null) {
			@SuppressWarnings("rawtypes")
			Element elem = new Element(valeurElement);
			setPremierElement(elem);
			setDernierElement(elem);
		} else {
			@SuppressWarnings("rawtypes")
			Element elem = new Element(valeurElement, dernierElement);
			getDernierElement().setSuivElement(elem);
			setDernierElement(elem);
		}
	}
	
	public void remove(int index) {
		if(premierElement == null) {
			System.out.println("la valeur que vous cherchez n'existe pas!!");
		} else {
			remove(index, premierElement);
		}
	}
	
	public void remove(int index, Element<T> elem) {
		if(index == 0) {
			if(elem.getPrecElement() != null) {
				elem.getPrecElement().setSuivElement(elem.getSuivElement());				
			} else {
				setPremierElement(elem.getSuivElement());
			}
			if(elem.getSuivElement() != null) {
				elem.getSuivElement().setPrecElement(elem.getPrecElement());				
			} else {
				setDernierElement(elem.getPrecElement());
			}
		} else {
			remove(index - 1, elem.getSuivElement());
		}
	}
	
	public Element<T> get(int index) {
		if(premierElement == null) {
			System.out.println("la valeur que vous cherchez n'existe pas!!");
			return null;
		} else {
			return get(index, premierElement);
		}
	}
	
	public Element<T> get(int index, Element<T> elem) {
		if(index == 0) {
			System.out.println(elem.getValeurElement());
			return elem;
		} else {
			return get(index - 1, elem.getSuivElement());
		}
	}
	
	/* public void remove(int index, Element elem) {
		if(index == 0) {
			if(elem.getPrecElement() == null) {
				elem.getSuivElement().setPrecElement(elem.getPrecElement());
				setPremierElement(elem.getSuivElement());
				} else if(elem.getSuivElement() == null) {
				elem.getPrecElement().setSuivElement(elem.getSuivElement());				
			} else {
				elem.getSuivElement().setPrecElement(elem.getPrecElement());				
				elem.getPrecElement().setSuivElement(elem.getSuivElement());				
			}
		}
	}*/
	
	public void print() {
		if(premierElement == null) {
			System.out.println("il n'y a aucun élément dans ma liste");
		} else {
			print(premierElement);
		}
	}
	
	public void print(Element<T> elem) {
		System.out.print(elem.getValeurElement());
		if(elem.getSuivElement() == null) {
			System.out.println(" - fin liste");
		} else {
			System.out.print(", ");
			print(elem.getSuivElement());
		}
	}
	
	public Element<T> getPremierElement() {
		return premierElement;
	}

	public void setPremierElement(Element<T> premierElement) {
		this.premierElement = premierElement;
	}

	public Element<T> getDernierElement() {
		return dernierElement;
	}

	public void setDernierElement(Element<T> dernierElement) {
		this.dernierElement = dernierElement;
	}

}
