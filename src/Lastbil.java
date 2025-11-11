public class Lastbil extends Vagfordon {

    private double lastkapacitet;

    public Lastbil(String registreringsnummer, String färg, String ägare, double vikt, double lastkapacitet){
        super(registreringsnummer, färg, ägare, vikt);
        if (lastkapacitet <= 0){
            throw new IllegalArgumentException("Lastkapacitet kan inte vara mindre än haha");
        }
        this.lastkapacitet = lastkapacitet;
    }

    public double getLastkapacitet() {
        return lastkapacitet;
    }

    @Override
    public String toString(){
        return super.toString() + "Lastkapacitet: " + lastkapacitet + "Kg";
    }

}
