package no.hvl.dat100;
import javax.swing.JOptionPane;

public class O1 {
    public static void main(String[] args) {
        // Løkke for å lese inn poengsummer fra 10 studenter
        for (int i = 1; i <= 10; i++) {
            int poengsum = -1; // Setter poengsum til en ugyldig verdi for å starte kontrollen

            // Gjenta innlesing til en gyldig poengsum (0-100) er oppgitt
            while (poengsum < 0 || poengsum > 100) {
                String poengInput = JOptionPane.showInputDialog("Skriv inn poengsummen til student " + i + " (0-100):");
                
                try {
                    // Konverter poengsummen fra String til int
                    poengsum = Integer.parseInt(poengInput);

                    // Sjekk om poengsummen er ugyldig
                    if (poengsum < 0 || poengsum > 100) {
                        JOptionPane.showMessageDialog(null, "Ugyldig poengsum! Poengsummen må være mellom 0 og 100. Prøv igjen.");
                    }
                } catch (NumberFormatException e) {
                    // Håndter tilfelle hvor input ikke kan konverteres til et heltall
                    JOptionPane.showMessageDialog(null, "Ugyldig inndata! Vennligst skriv inn et gyldig heltall.");
                }
            }

            // Bestem karakter basert på poengsum
            String karakter;
            if (poengsum >= 90) {
                karakter = "A";
            } else if (poengsum >= 80) {
                karakter = "B";
            } else if (poengsum >= 60) {
                karakter = "C";
            } else if (poengsum >= 50) {
                karakter = "D";
            } else if (poengsum >= 40) {
                karakter = "E";
            } else {
                karakter = "F";
            }

            // Skriv ut karakteren for studenten
            JOptionPane.showMessageDialog(null, "Karakteren til student " + i + " er: " + karakter);
        }
    }
}
