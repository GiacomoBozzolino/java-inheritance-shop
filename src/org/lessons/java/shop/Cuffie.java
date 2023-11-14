package org.lessons.java.shop;


public class Cuffie extends Prodotto{
	private boolean cable;
	private String color;



	public Cuffie(String nome, String descrizione, float prezzo, boolean cable, String color) {
		super(nome, descrizione, prezzo);
		
		setCable(cable);
		setColor(color);
	}

	public boolean isCable() {
		return cable;
	}

	public void setCable(boolean cable) {
		this.cable = cable;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\n"
				+ "colore: " + getColor() + "\n"
				+ "wireless: " + (isCable() ? "si" : "no")+ "\n"
				+ "---------------------------\n";
	}
}