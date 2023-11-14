package org.lessons.java.shop;

public class Smartphone extends Prodotto{
	
	private int memory;
	private String imei;
	
	public Smartphone(String nome, String descrizione, double prezzo, int memory, String imei) {
		super(nome, descrizione, prezzo);
		
		setMemory(memory);
		setImei(imei);
		
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	@Override
	public String toString() {
		
		return super.toString() + "\n"
				+ "codice IMEI: " + getImei() + "\n"
				+ "memoria: " + getMemory() + "GB\n"
				+ "---------------------------\n";
	}
	
}