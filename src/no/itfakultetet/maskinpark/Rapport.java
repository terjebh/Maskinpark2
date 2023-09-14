package no.itfakultetet.maskinpark;

public interface Rapport {
    void visRapport(String maskinType);

    void lagreRapportTilFil(String filtype);

    void lagreRapportiDatabase(String databasesystem);

}
