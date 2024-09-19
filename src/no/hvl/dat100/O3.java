package no.hvl.dat100;
import javax.swing.JOptionPane;
public class O3 {

	    public static void main(String[] args) {
	        // Les inn et heltall n fra brukeren
	        String nInput = JOptionPane.showInputDialog("Skriv inn et heltall n (n > 0):");

	        try {
	            // Konverter input fra String til int
	            int n = Integer.parseInt(nInput);

	            // Sjekk om n er større enn 0
	            if (n > 0) {
	                // Beregn n! (n fakultet)
	                long fakultet = 1;

	                for (int i = 1; i <= n; i++) {
	                    fakultet *= i;
	                }

	                // Skriv ut resultatet
	                JOptionPane.showMessageDialog(null, "Fakultet av " + n + " er " + fakultet);
	            } else {
	                // Hvis n er mindre enn eller lik 0, vis feilmelding
	                JOptionPane.showMessageDialog(null, "Ugyldig inndata! n må være et heltall større enn 0.");
	            }
	        } catch (NumberFormatException e) {
	            // Håndter tilfeller hvor input ikke er et gyldig tall
	            JOptionPane.showMessageDialog(null, "Ugyldig inndata! Vennligst skriv inn et gyldig heltall.");
	        }
	    }
	}


