
public class Teiler {

	public static void main(String[] args) {
		int T = 25875;
		int i = 2;
		int Teiler = 0;
		
		System.out.print("Die Teiler von "+T + " sind ");
	while (i< (T-1))
	{
		if ((T%i) == 0)
			{
				Teiler = i;
				System.out.print(Teiler+",");	
			}
	i++;
	}
	}

}
