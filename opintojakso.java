
public class opintojakso {
	
	private String opettajanNimi;
	private String nimi; 
	private int opintoPisteet;   // Laajuus opintopisteinä

	   
	   public opintojakso( String n )
	   {
	      asetaNimi(n);
	   }
	   
	   
	   public opintojakso( String n, int p )
	   {
		  
		  asetaNimi(n);
		  asetaLaajuus(p);
	   }
	  	   
	  
	   public void asetaOpettajanNimi( String o )
	   {
		   asetaOpettajaNimi(o);
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   public void asetaOpettajaNimi( String o )
	   {
		   opettajanNimi = o;
	   }
	   
	   
	   
	   public String haeOpettajanNimi()
	   {
		   return opettajanNimi;
	   }
	   
	   
	   
	   public void asetaNimi( String nimi )
	   {
	      this.nimi = nimi; 
	   }
	   
	   

	   public String haeNimi()
	   {
	      return nimi;
	   }
	   
	   
	   
	   public void asetaLaajuus( int p )
	   {
		   // Onko arvo validi
	       if (p >= 0)
		   {
		      opintoPisteet = p;
		   }
		   else
		   {
			   // Jätä ennalleen
		   }
	   } 
	   
	   

	   public int haeLaajuus()
	   {
	      return opintoPisteet;
	   }
	   
	   
	   
	   public void tulostaTiedot()
	   {
		  System.out.println( "Opettajan nimi:\n" + haeOpettajanNimi() );
		  
 	      System.out.println( "Opintojakson nimi:\n" + haeNimi() );
 	      
	      System.out.println( "Opintojakson laajuus:\n" + haeLaajuus() );
	   }
}
