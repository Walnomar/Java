import java.util.Scanner;

public class kertoTaulu {
	
	public static final int MAX = 1;
	private Scanner input = new Scanner(System.in);
	
	private int lukema1;
	private int lukema2;
	private int vastaus;
	private int tulos;
	private int arvottu = 0;
	boolean vaarin;
	
	
	public kertoTaulu()
	{	
				
		while (arvottu < MAX)
		{
			lukema1 = (int) (Math.random() * 10) + 1;
			//System.out.println(lukema1 + "\n");
			
			lukema2 = (int) (Math.random() * 10) + 1;
			//System.out.println(lukema2 + "\n");
		

			if(lukema1 >= 1 && lukema1 <=10 || lukema2 >= 1 && lukema2 <=10)
			{
					System.out.println("Paljonko on " + lukema1 + " kertaa " + lukema2 + "?\n");
					vastaus = input.nextInt();
			}
			
				suoritaLasku();

				Vaarin();

				Oikein();

		}
	
	}
	
	public int suoritaLasku()
	{
		if(lukema1 >= 1 && lukema1 <=10 && lukema2 >= 1 && lukema2 <=10)
		{
			tulos = lukema1 * lukema2;
		} 
		return tulos;
	}
	
	
	public void Oikein()
	{
		if(tulos == vastaus)
		{
			System.out.println("Oikein \n");
		}
		
	}
	
	public boolean Vaarin() 
	{	
			if(tulos != vastaus)
			{
				System.out.println("Väärin");
			}
			return vaarin;
	}
	
	
	public static void main(String[] args) {
		kertoTaulu s = new kertoTaulu();
		//s.suoritaLasku();

	}

}
