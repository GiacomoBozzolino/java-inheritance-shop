package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	//dichiaro le variabili
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	
	//creo il costruttore
	public Prodotto( String nome, String descrizione, float prezzo, int iva) { 
		
		 setNome(nome);
		 setDescrizione(descrizione);
		 setPrezzo(prezzo);
		 setIva(iva);
	}
	
	//metodo get e set
	
	public int getCodice() {
		return generaCodice();
	}
	
	private void setCodice(int codice) {
		this.codice = codice;
	}
	   // Metodo getter e setter per il nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodo getter e setter per la descrizione
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    // Metodo getter e setter per il prezzo
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    // Metodo getter e setter per l'IVA
    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
	
	//metodo per la generazione di codice casuale
    public int generaCodice() {
        Random random = new Random();
        return random.nextInt(100); 
    }
	
    //metodo per generare il prezzo con iva
    public double getPrezzoIva() {
        return prezzo + (prezzo * iva / 100);
    }
	
    // Metodo per ottenere il nome esteso
    public String getNomeEsteso() {
        return getCodice() + "-" + nome;
    }
    
    public String getCodicePadding() {
        return String.format("%08d",getCodice());
    }
    
	
	public String toString() {
		return "Prodotto:\n"
				+ "codice:" + " " + getCodice() + "\n"
				+ "nome:" + " " + getNome() + "\n"
				+ "nome esteso:" + " " + getNomeEsteso() + "\n"
				+ "descrizione:" + " " + getDescrizione() + "\n"
				+ "prezzo:" + " " + String.format("%.2f", getPrezzo()) + " " + "€" + "\n"
				+ "prezzo con iva:" + " " + String.format("%.2f", getPrezzoIva())+ " " + "€" + "\n"
				+ "iva:" + " " + getIva() + "%\n"
				+ "codice:" + " " + getCodicePadding() + "\n";
		
				
	}
	

}
