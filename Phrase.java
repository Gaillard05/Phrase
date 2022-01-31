		public class Phrase{
			public static void main(String [] args){
			String p;
			int resultM;
			int nbL;
			int i;
			int lM;
	
		System.out.println("Votre phrase devra etre en majuscule non accentuees, sans caractere special et contenir des espaces puis finir par un point .");

		System.out.print("Donnez une phrase :");
		p = Lire.S();
		
		String [] tab = {};
	
		tab = p.split(" ");

		resultM = ComptMot(p);
		
		System.out.println("Votre phrase contient "+resultM+" mots");

		nbL = 7;

		for(i = 0; i < tab.length; i++){
			lM = tab[i].length();
			if(lM >= nbL){
			System.out.println(tab[i]);
			}
		    }

		System.out.println("Fin du programme.");
		
	}

		public static int ComptMot(String ph){

		int compt;
		int i;

		compt = 1;
		

		for(i = 0; i <= ph.length() -1; i++){
			if((ph.charAt(i) == ' ') && (ph.charAt(i+1) != ' ')){
			compt++;
			}
		}
		
		return compt;

		}


		
}