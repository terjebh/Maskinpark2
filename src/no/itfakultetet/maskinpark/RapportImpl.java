package no.itfakultetet.maskinpark;

public class RapportImpl implements Rapport {


    @Override
    public void visRapport(String maskinType) {

        if (maskinType.equals("Desktop")) {
            System.out.println("-".repeat(30));
            int antallMaskiner = Desktop.getAntallDesktopper();
            System.out.println(antallMaskiner + (antallMaskiner == 1 ? " Desktop" : " Desktoper"));
            System.out.printf("%-15s %-6s %-6s\n", "Merke", "Modell", "Pris");
            for (Desktop desktop : Desktop.desktopper) {
                System.out.printf("%-15s %-6d %-6d\n", desktop.getMerke(), desktop.getÅrsmodell(), desktop.getPris());
            }
            System.out.println("-".repeat(30));
            int sum = Desktop.desktopper.stream().mapToInt(Datamaskin::getPris).sum();
            System.out.printf("%-22s %-6d\n", "SUM", sum);
            System.out.println("-".repeat(30));

        } else if (maskinType.equals("Laptop")) {
            int antallMaskiner = Laptop.getAntallLaptopper();
            System.out.println(antallMaskiner + (antallMaskiner == 1 ? " Laptop" : " Laptoper"));
            System.out.println("-".repeat(30));
            System.out.printf("%-15s %-6s %-6s\n", "Merke", "Modell", "Pris");
            for (Laptop laptop : Laptop.laptopper) {
                System.out.printf("%-15s %-6d %-6d\n", laptop.getMerke(), laptop.getÅrsmodell(), laptop.getPris());
            }
            System.out.println("-".repeat(30));
            int sum = Laptop.laptopper.stream().mapToInt(Datamaskin::getPris).sum();
            System.out.printf("%-22s %-6d\n", "SUM", sum);
            System.out.println("-".repeat(30));
        } else if (maskinType.equals("Server")) {
            //TODO
        }

        System.out.println("-".repeat(30));
        // Datamaskin.sumPrisDatamaskiner+=sum;



    }

    @Override
    public void lagreRapportTilFil(String filtype) {
        // TODO
    }

    @Override
    public void lagreRapportiDatabase(String databasesystem) {
        // TODO
    }
}
