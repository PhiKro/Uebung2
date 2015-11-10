
public class TurmRechner {

	public static void main(String[] args) 
	{
	// Variable Definieren
	int i = 2;
	int zahl = 12;
	int zahl2 = zahl; // Zahl für die Textausgabe
		
	while (i <=9) // x2 - x9 Rechnen.
	{
		zahl= zahl * i; // Das ergebniss der Berechnung neu in die Variable einlesen 
		System.out.println(zahl2+" * "+i+"= "+zahl); // Text ausgeben
		zahl2 = zahl; // Variable für die Ausgabe der Rechnung nach dem Print für die nächste Ausgabe Updaten
		i++;
	}
}
}