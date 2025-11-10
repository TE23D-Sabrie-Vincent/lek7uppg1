public class Vagfordon {
    private String registreringsnummer;
    private String färg;
    private String ägare;
    private double vikt;

    public Vagfordon(String registreringsnummer, String färg, String ägare, double vikt) {
        this.registreringsnummer = registreringsnummer;
        this.färg = färg;
        this.ägare = ägare;
        this.vikt = vikt;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        if (!registreringsnummer.matches("[A-Za-z{3}[0-9]{3}]")) {
            throw new IllegalArgumentException("Fel registreringsnummer: " + registreringsnummer);

        }
        this.registreringsnummer = registreringsnummer;
    }

    public String getFärg() {
        return färg;
    }

    public String getÄgare() {
        return ägare;
    }

    public double getVikt() {
        return vikt;
    }

    @Override
    public String toString() {
        return "Reg.nr: " + registreringsnummer +
                ", Ägare: " + ägare +
                ", Färg: " + färg +
                ", Vikt: " + vikt + " kg";
    }

}
