
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
	if (punkte >= 90)
	{	
		return "Sehr Gut";
	}
	else if (punkte >78)
	{
		return "Gut";
	}
	else if (punkte >65)
	{
		return "Befriedigend";
	}
	else if (punkte >51)
	{
		return "Genuegend";
	}
	else
	{
		return "Nicht Genuegend";
	}
	}
	


}