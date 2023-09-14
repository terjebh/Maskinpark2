package no.itfakultetet.maskinpark;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("1 = Legg til ny Laptop");
            System.out.println("2 = Legg til ny Desktop");
            System.out.println("3 = Legg til ny Server");
            System.out.println("4 = Vis oversikt over maskiner");
            System.out.println("q = Avslutt");
            System.out.println("-".repeat(30));
            String menyvalg = in.next();

            if(menyvalg.equals("q")) {
                System.out.println("Farvel...");
                System.exit(0);
            } else if (menyvalg.equals("1")) {
                Laptop.lagNyLaptop();
            } else if (menyvalg.equals("2")) {
                Desktop.lagNyDesktop();
            } else if (menyvalg.equals("3")) {

            } else if (menyvalg.equals("4")) {
                RapportImpl rapport = new RapportImpl();
                  if(Laptop.getAntallLaptopper() > 0) rapport.visRapport("Laptop");
                  if(Desktop.getAntallDesktopper() > 0) rapport.visRapport("Desktop");
            } else {
                System.out.println("Ukjent menyvalg");
            }

        }



    }

}
