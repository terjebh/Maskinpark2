package no.itfakultetet.maskinpark;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desktop extends Datamaskin {

    private String kabinettType;
    private static int antallDesktopper;

    static List<Desktop> desktopper = new ArrayList<>();

    public Desktop() {
        super();
        antallDesktopper++;
    }

    public Desktop(String merke, int årsmodell, int pris) {
        this();
        this.årsmodell = årsmodell;
        this.pris = pris;
        this.merke = merke;
    }

    public static void visDesktopper() {
        System.out.println(antallDesktopper + (antallDesktopper == 1 ? " Desktop" : " Desktoper"));
        System.out.println("-".repeat(30));
        System.out.printf("%-15s %-6s %-6s\n", "Merke", "Modell", "Pris");
        for (Desktop desktop : desktopper) {
            System.out.printf("%-15s %-6d %-6d\n", desktop.getMerke(), desktop.getÅrsmodell(), desktop.getPris());
        }
        System.out.println("-".repeat(30));
        int sum = desktopper.stream().mapToInt(Datamaskin::getPris).sum();
        System.out.printf("%-22s %-6d\n", "SUM", sum);
        System.out.println("-".repeat(30));
    }

    public static void lagNyDesktop() {
        System.out.println("Ny Desktop");
        Desktop d = new Desktop();
        Scanner leggInn = new Scanner(System.in);
        System.out.print("Tast inn merke: ");
        String merke = leggInn.nextLine();
        d.setMerke(merke);
        System.out.print("Tast inn årsmodell: ");
        int modell = leggInn.nextInt();
        d.setÅrsmodell(modell);
        System.out.print("Tast inn pris: ");
        int pris = leggInn.nextInt();
        d.setPris(pris);
        desktopper.add(d);

    }

    public String getKabinettType() {
        return kabinettType;
    }

    public void setKabinettType(String kabinettType) {
        this.kabinettType = kabinettType;
    }

    public static int getAntallDesktopper() {
        return antallDesktopper;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "kabinettType='" + kabinettType + '\'' +
                ", årsmodell=" + årsmodell +
                ", pris=" + pris +
                ", vekt=" + vekt +
                ", ram=" + ram +
                ", merke='" + merke + '\'' +
                ", prosessor='" + prosessor + '\'' +
                ", antallDatamaskiner=" + Datamaskin.getAntallDatamaskiner() +
                '}';
    }
}
