import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Lottery {
	
	public static final int MAX = 6;
	
	private int[] lotteryTable  = new int[MAX];
	
	//private Scanner input = new Scanner(System.in);
	
	public Lottery() {
	
		int arvottu = 0;
		int sum;

		while (arvottu < MAX) 
		{
			int s = (int) (Math.random() * 40) + 1;
			System.out.println(s + "\n");
			
				if(s >= 1 && s <= 40)
				{
					lotteryTable[arvottu] = s;
					arvottu++;
				}
		}

	}

	public void tulostaLuvut() 
	{
	Arrays.sort(lotteryTable);
		System.out.println("Arvotut numerot: \n");
		
		for (int i: lotteryTable)
		{
			System.out.println(i);
		}
	}
	
	public void Summa() 
	{
	int sum = 0; 
	
	int KA;
    	for (int value: lotteryTable) 
    	{
    		sum += value;
    		System.out.println("Lukujen summa on: " + sum);
    	}
    	for (int value: lotteryTable) 
    	{
    		KA += value/MAX;
    		System.out.println("Lukujen KA on: " + KA);
    	}
	}
	
		
		
	public static void main(String[] args) {
		Lottery s = new Lottery();
		s.tulostaLuvut();
		s.Summa();

	}

}
