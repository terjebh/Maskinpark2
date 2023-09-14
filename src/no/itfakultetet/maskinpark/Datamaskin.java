package no.itfakultetet.maskinpark;

public class Datamaskin {
    public static int sumPrisDatamaskiner;
    protected int årsmodell;
    protected int pris;
    protected int vekt;
    protected int ram;
    protected String merke;
    protected String prosessor;

    private static int antallDatamaskiner;

    public Datamaskin() {
        antallDatamaskiner++;
    }

    public static int getAntallDatamaskiner() {
        return antallDatamaskiner;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public void setÅrsmodell(int årsmodell) {
        this.årsmodell = årsmodell;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getVekt() {
        return vekt;
    }

    public void setVekt(int vekt) {
        this.vekt = vekt;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getProsessor() {
        return prosessor;
    }

    public void setProsessor(String prosessor) {
        this.prosessor = prosessor;
    }
}
