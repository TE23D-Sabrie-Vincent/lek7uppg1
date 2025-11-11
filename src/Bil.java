public class Bil extends Vagfordon {

    private int sittplatser;

    public Bil(String registreringsnummer, String färg, String ägare, double vikt, int sittplatser){
        super(registreringsnummer, färg, ägare, vikt);
        this.sittplatser = sittplatser;

    }

    public int getSittplatser(){
        return sittplatser;
    }
    
@Override
public String toString(){
return super.toString() + ", Sittplatser:" + sittplatser;
}

}
