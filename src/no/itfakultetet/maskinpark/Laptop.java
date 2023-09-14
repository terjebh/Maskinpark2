package no.itfakultetet.maskinpark;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laptop extends Datamaskin {

    protected int skjermstørrelse;
    protected String batteriType;
    private static int antallLaptopper;

    static List<Laptop> laptopper = new ArrayList<>();

    public Laptop() {
        super();
        antallLaptopper++;
    }

    public Laptop(String merke, int årsmodell, int pris) {
        this();
        this.årsmodell = årsmodell;
        this.pris = pris;
        this.merke = merke;
    }

    public static int getAntallLaptopper() {
        return antallLaptopper;
    }

    public static void lagNyLaptop() {
        System.out.println("Ny Laptop");
        Laptop l = new Laptop();
        Scanner leggInn = new Scanner(System.in);
        System.out.print("Tast inn merke: ");
        String merke = leggInn.nextLine();
        l.setMerke(merke);
        System.out.print("Tast inn årsmodell: ");
        int modell = leggInn.nextInt();
        l.setÅrsmodell(modell);
        System.out.print("Tast inn pris: ");
        int pris = leggInn.nextInt();
        l.setPris(pris);
        laptopper.add(l);
    }

    public static void visLaptopper() {
        System.out.println(antallLaptopper + (antallLaptopper == 1 ? " Laptop" : " Laptoper"));
        System.out.println("-".repeat(30));
        System.out.printf("%-15s %-6s %-6s\n", "Merke", "Modell", "Pris");
        for (Laptop laptop : laptopper) {
            System.out.printf("%-15s %-6d %-6d\n", laptop.getMerke(),laptop.getÅrsmodell(),laptop.getPris());
        }
        System.out.println("-".repeat(30));
        int sum = laptopper.stream().mapToInt(Datamaskin::getPris).sum();
        System.out.printf("%-22s %-6d\n", "SUM",sum);
        System.out.println("-".repeat(30));
    }

    public int getSkjermstørrelse() {
        return skjermstørrelse;
    }

    public void setSkjermstørrelse(int skjermstørrelse) {
        this.skjermstørrelse = skjermstørrelse;
    }

    public String getBatteriType() {
        return batteriType;
    }

    public void setBatteriType(String batteriType) {
        this.batteriType = batteriType;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "merke='" + merke + '\'' +
                ", skjermstørrelse=" + skjermstørrelse +
                ", årsmodell=" + årsmodell +
                ", pris=" + pris +
                ", vekt=" + vekt +
                ", ram=" + ram +
                ", batteriType='" + batteriType + '\'' +
                ", prosessor='" + prosessor + '\'' +
                '}';
    }


}
