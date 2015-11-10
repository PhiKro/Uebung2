
public class Winterreifen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean rutschig =true;
		double temp = 9.3;

	boolean pflicht = pflichtRechner(temp,rutschig);
	if (pflicht)
	{
		System.out.println("Bitte Winterreifen verwende");
	}
	else 
	{
		System.out.println("Winterreifen sind nicht erforderlich");
	}
	}

	public static boolean pflichtRechner(double temp,boolean rutschig)
	{
		if (temp <10 && rutschig) // Bedingung 1 
		{
			return true;
		}
		else if (temp < 4)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
}
