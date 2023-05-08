package org.lessons.java.shop;

public class Prodotto {
	
	private int id;
	public String name;
	public String description;
	public float price;
	public int iva;
	
	public Prodotto(int id, String name, String description, float price, int iva) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.iva = iva;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getFullId() {
		int idLgn = (int)(Math.log10(id)+1);
		String newId = "" + id;
		if (idLgn == 8) {
			newId = "" + id;
			return newId;
		} else {
			int difference = 8 - idLgn;
			
			for (int i = 0; i < difference; i++) {
				newId = "0" + newId;
			}
			
			return newId;
		}
	}
	
	public float getPrice() {
		return price;
	}
	
	public float getPriceAfterIva() {
		float priceAfterIva = this.price + (this.price / 100 * this.iva);
		return priceAfterIva;
	}
	
	public String getFullName() {
		return "" + id + name;
	}
	
}
