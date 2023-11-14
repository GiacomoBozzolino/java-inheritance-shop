package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {
        // Dichiarazione delle costanti e delle variabili
        final int PRODUCT_COUNT = 5;
        boolean smartTV = false;
        boolean wireless = false;
        String strImei = null;
        int intMemory = 0;
        int intTvInch = 0;
        String strColor = null;
        int i = 0;
        Prodotto[] products = new Prodotto[PRODUCT_COUNT];

        // Ciclo principale
        while (true) {
            // Creazione di uno Scanner per l'input dell'utente
        
            Scanner in = new Scanner(System.in);

            // Richiesta se l'utente vuole aggiungere un prodotto
            System.out.print("\nVuoi aggiungere un prodotto? ");
            String strAddProduct = in.nextLine();

            // Se l'utente risponde "no", chiudi lo Scanner e esci dal ciclo
            if (strAddProduct.equals("no")) {
                in.close();
                break;
            }

            // Altrimenti, continua con l'acquisizione delle informazioni del prodotto
            System.out.print("Che tipologia di prodotto? (smartphone/televisore/cuffie): ");
            String strType = in.nextLine();

            System.out.print("Quale è il nome del prodotto? ");
            String strNameProduct = in.nextLine();

            System.out.print("Descrizione prodotto: ");
            String strDescriptionProduct = in.nextLine();

            System.out.print("Prezzo del prodotto? ");
            double doublePriceProduct = Double.parseDouble(in.nextLine());

            // Acquisizione di informazioni specifiche per ciascun tipo di prodotto
            if (strType.equals("smartphone")) {
                System.out.print("Inserisci codice IMEI: ");
                strImei = in.nextLine();

                System.out.print("Grandezza memoria smartphone: ");
                intMemory = Integer.parseInt(in.nextLine());

            } else if (strType.equals("televisore")) {
                System.out.print("E' una smart TV? si/no: ");
                smartTV = in.nextLine().equalsIgnoreCase("si");

                System.out.print("Dimensioni in pollici dello schermo: ");
                intTvInch = Integer.parseInt(in.nextLine());

            } else if (strType.equals("cuffie")) {
                System.out.print("Colore: ");
                strColor = in.nextLine();

                System.out.print("Sono wireless? si/no: ");
                wireless = in.nextLine().equalsIgnoreCase("si");
            }

            // Capitalizzazione della tipologia di prodotto per uniformità
            String capitalizedProductType = strType.substring(0, 1).toUpperCase() + strType.substring(1).toLowerCase();

            // Creazione dell'oggetto Prodotto in base alla tipologia
            switch (capitalizedProductType) {
                case "Smartphone":
                    products[i] = new Smartphone(strNameProduct, strDescriptionProduct, doublePriceProduct, intMemory, strImei);
                    break;
                case "Televisore":
                    products[i] = new Televisori(strNameProduct, strDescriptionProduct, doublePriceProduct, smartTV, intTvInch);
                    break;
                case "Cuffie":
                    products[i] = new Cuffie(strNameProduct, strDescriptionProduct, doublePriceProduct, wireless, strColor);
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected value: " + capitalizedProductType);
            }

            i++;  // Incremento l'indice del carrello
        }

        // Stampa del carrello
        for (int x = 0; x < i; x++) {
            System.out.println(products[x] + "\n");
        }
    }

}
