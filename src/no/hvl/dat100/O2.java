package no.hvl.dat100;
import javax.swing.JOptionPane;
public class O2 {
	    public static void main(String[] args) {
	        // Les inn bruttoinntekt fra brukeren
	        String inntektInput = JOptionPane.showInputDialog("Skriv inn bruttoinntekten din:");
	        
	        try {
	            // Konverter bruttoinntekt fra String til double
	            double inntekt = Double.parseDouble(inntektInput);

	            // Variabel for å holde på trinnskatten
	            double trinnskatt = 0.0;

	            // Beregn trinnskatten basert på inntektsnivå
	            if (inntekt >= 1350001) {
	                trinnskatt += (inntekt - 1350000) * 0.176;  // Trinn 5
	                inntekt = 1350000;
	            }
	            if (inntekt >= 937901) {
	                trinnskatt += (inntekt - 937900) * 0.166;  // Trinn 4
	                inntekt = 937900;
	            }
	            if (inntekt >= 670001) {
	                trinnskatt += (inntekt - 670000) * 0.136;  // Trinn 3
	                inntekt = 670000;
	            }
	            if (inntekt >= 292851) {
	                trinnskatt += (inntekt - 292850) * 0.04;   // Trinn 2
	                inntekt = 292850;
	            }
	            if (inntekt >= 208051) {
	                trinnskatt += (inntekt - 208050) * 0.017;  // Trinn 1
	            }

	            // Vis resultatet
	            JOptionPane.showMessageDialog(null, "Trinnskatten din er: " + trinnskatt + " kr");
	        } catch (NumberFormatException e) {
	            // Håndter tilfeller hvor input ikke er et gyldig tall
	            JOptionPane.showMessageDialog(null, "Ugyldig inndata! Vennligst skriv inn et gyldig tall for bruttoinntekten.");
	        }
	    }
	}


