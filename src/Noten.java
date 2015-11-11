
public class Noten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		if (punkte >= 90) // Mehr als oder genau 90 Punkte?
			{	
				return "Sehr Gut";
			}
		else if (punkte >= 78) // 90 Punkte nicht überschtritten 2. Bedingung wird geprüft (Mehr als 77 Punkte?) 
			{
				return "Gut";
			}
		else if (punkte >=65) // 78 Punkte nicht erreicht 3. Bedingung wird geprüft (Mehr als 64 Punkte?) 
			{
				return "Befriedigend";
			}
		else if (punkte >=51)// 65 Punkte nicht erreicht 4. Bedingung wird geprüft (Mehr als 50 Punkte?) 
			{
				return "Genuegend";
			}
		else // Keine der If bedingungen hat gegriffen. Die Note sagt NEIN!
			{
				return "Nicht Genuegend";
			}
	}
}