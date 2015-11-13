
public class Noten2 {

	public static void main(String[] args) 
	{

		int punkte = 95;
		String note = getNotentext(punkte);
		System.out.println(note);
		
		punkte = 79;
		note = getNotentext(punkte);
		System.out.println(note);
		
		punkte = 68;
		note = getNotentext(punkte);
		System.out.println(note);
		
		punkte = 52;
		note = getNotentext(punkte);
		System.out.println(note);
		
		punkte = 12;
		note = getNotentext(punkte);
		System.out.println(note);
	
	}
	
	public static String getNotentext(int punkte)
	{
		if (punkte < 51) // Weniger als 51 Punkte ?
			{	
				return "Nicht Genügend";
			}
		else if (punkte < 65) // 51 Punkte nicht unterschtritten 2. Bedingung wird geprüft (Weniger als 65 Punkte?) 
			{
				return "Genügend";
			}
		else if (punkte < 76) // 65 Punkte nicht unterschtritten3. Bedingung wird geprüft (weniger als 76 Punkte?) 
			{
				return "Befriedigend";
			}
		else if (punkte < 90)// 76 Punkte nicht unterschtritten 4. Bedingung wird geprüft (weniger als 90 Punkte?) 
			{
				return "Gut";
			}
		else // Keine der If Bedingungen hat gegriffen. Die Note sagt Gratulation!
			{
				return "Sehr Gut";
			}
	}
}