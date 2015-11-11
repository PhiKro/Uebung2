
public class Winterreifen2 {
	
public static void main(String Args[])
{	
	int temp =9;
	boolean rutschig = true;
	
	if (isWinterreifenPflicht(temp,rutschig))
	{
		System.out.println("Bitte Winterreifen Verwenden!");
	}
	else
	{
		System.out.println("Keine Winterreifenpflicht");
	}
	
}
public static boolean isWinterreifenPflicht(int temp,boolean rutschig)
{
	return (temp <10 && rutschig) || temp < 4;
}
}
