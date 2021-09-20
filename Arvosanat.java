
import java.util.Arrays;
import java.util.Scanner;

public class Arvosanat {
	
	public static final int KOKO = 10;
	public static final int MAX = 10;
	
	private int [] arvosanat  = new int[MAX+1];
	
	private Scanner input = new Scanner(System.in);
	
	public Arvosanat() {
		int luettu = 0;
		int arvosana;

		
		while(luettu < KOKO) 
		{ 
			System.out.println("Syötä arvosana: \n");
			arvosana = input.nextInt();

		
			if (arvosana >= 4 && arvosana <= 10) 
			{
				arvosanat[luettu]=arvosana;
				luettu++;
			}
			else
			{
				System.out.println("Anna lukuja vain välilät 4-10");
			}
		}
	}
	
	public void tulostaLuvut() 
	{
		//Arrays.sort(arvosanat);

		for (int i: arvosanat)
		{
				System.out.println(i+" ");
		}
	}
	
	public void Summa() 
	{
	int sum = 0; 
    	for (int value: arvosanat) 
    	{
    		sum += value;
    		System.out.println("Arvojen summa on: " + sum);
    	}
	}
	
	public static void main(String[] args) {
		 Arvosanat s = new Arvosanat();
		 s.tulostaLuvut();
		 s.Summa();	
	}

}
