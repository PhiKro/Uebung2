
public class Winterreifen {

	public static void main(String[] args) 
	{
		boolean rutschig =true;
		double temp = 9.3;

		boolean pflicht = pflichtRechner(temp,rutschig); // Übergabe an Unterprogramm 
		
			if (pflicht) // Wenn Ergebniss aus dem Unterprogramm True ist 
				{
					System.out.println("Bitte Winterreifen verwende");
				}
			else  // Wenn das Ergebniss aus dem Unterprogramm False ist
				{
					System.out.println("Winterreifen sind nicht erforderlich");
				}
	}

	public static boolean pflichtRechner(double temp,boolean rutschig)
		{
		if (temp <10 && rutschig) // Bedingung 1 ( Weniger als 10 Grad und rutschig ist True) 
			{
				return true; // Winterreifenpflicht 
			}
		else if (temp < 4) // Bedingung 2 ( Weniger als 4 Grad) 
			{
				return true; // Winterreifenpflicht
			}
		else //Bedingung 3 ( Keine der Pflicht bedingungen trifft zu) 
			{
				return false; // Keine Winterreifenpflicht
			}
		}
	
}
