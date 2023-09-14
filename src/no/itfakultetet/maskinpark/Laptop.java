package no.itfakultetet.maskinpark;

public class Laptop extends Datamaskin {

    protected int skjermstørrelse;
    protected String batteriType;
    private static int antallLaptopper;

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
