import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Vagfordon> fordon = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean kör = true;

        while (kör) {
            System.out.println("\n--- Trafikverkets Fordonsregister ---");
            System.out.println("1. Skapa Bil");
            System.out.println("2. Skapa Lastbil");
            System.out.println("3. Lista alla fordon");
            System.out.println("4. Avsluta");
            System.out.print("Välj ett alternativ: ");
            int val = scan.nextInt();
            scan.nextLine();

            try {
                if (val == 1) {
                    System.out.println("Registreringsnummer: ");
                    String reg1 = scan.nextLine();
                    System.out.println("Ägare: ");
                    String ägare1 = scan.nextLine();
                    System.out.println("Färg: ");
                    String färg1 = scan.nextLine();
                    System.out.println("Vikt: ");
                    int vikt1 = scan.nextInt();
                    System.out.println("Antal sittplatser: ");
                    int sittplats = scan.nextInt();
                    fordon.add(new Bil(reg1, ägare1, färg1, vikt1, sittplats));
                    System.out.println("Bil skapad!");
                } else if (val == 2) {
                    System.out.println("Registreringsnummer: ");
                    String reg2 = scan.nextLine();
                    System.out.println("Ägare: ");
                    String ägare2 = scan.nextLine();
                    System.out.println("Färg: ");
                    String färg2 = scan.nextLine();
                    System.out.println("Vikt: ");
                    int vikt2 = scan.nextInt();
                    System.out.println("Antal sittplatser: ");
                    double lastkapacitet = scan.nextInt();
                    fordon.add(new Lastbil(reg2, ägare2, färg2, vikt2, lastkapacitet));
                    System.out.println("Lastbil skapad!");
                } else if (val == 3) {
                    if (fordon.isEmpty()) {
                        System.out.println("Inga fordon registrerade ännu.");
                    } 
                    else {
                        for (Vagfordon f : fordon) {
                            System.out.println(f);
                        }
                    }
                } 
                else if (val == 4) {
                    kör = false;
                    System.out.println("Programmet stängs ned");
                } 
                else {
                    System.out.println("Gör ett val då! (Välj 1-4)");
                }
            }

            catch (Exception e) {
                System.out.println("Fel: " + e.getMessage());
                scan.nextLine();
            }

        }
        scan.close();
    }
}
