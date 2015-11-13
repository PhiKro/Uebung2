public class Teiler2 {

	public static void main(String[] args) {
		
		int Start = 11;
		int i = 2;
		int teiler = 0;
		String ausgabe = "teiler von "+ Start+": ";
		
		while (i <= (Start/2)){
			if (Start%i == 0){
				teiler = i;
				//System.out.print(teiler+",");
				ausgabe += teiler+", " // hier wird ein String durch += verkettet
;			}
			 i++;		
		}
		System.out.print(ausgabe);
		
		
	}

}