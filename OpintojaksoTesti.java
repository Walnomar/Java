
public class OpintojaksoTesti {
	

	public static void main(String args[]) 
	{
		
		opintojakso opintojakso1 = new opintojakso (
				"Java-ohjelmointi", 5 ); 
		opintojakso1.asetaOpettajaNimi("Veikko");
		
		
		opintojakso opintojakso2 = new opintojakso (
				"Tietorakenteet ja algoritmit", 3 );
		opintojakso2.asetaOpettajaNimi("Minna");
		
		
		opintojakso opintojakso3 = new opintojakso (
				"Matematiikka", 3 );
		opintojakso3.asetaOpettajaNimi("Pekka");
		
		
		

	      opintojakso1.tulostaTiedot();	 
	      opintojakso2.tulostaTiedot();  
	      opintojakso3.tulostaTiedot();

	}
	
}
