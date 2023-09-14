package no.itfakultetet.maskinpark;

public class Desktop extends Datamaskin {

private String kabinettType;
private static int antallDesktopper;

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
