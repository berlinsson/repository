
public class Uebung {

	static String beliebigerstring1 = "MOIN MOIN!!!";
	static int eineZahl = 5;
	static int nochEineZahl = 6;
	static int ergebnis = eineZahl * nochEineZahl ;
	static float eineZahlMitKomma = (float) 10.5;
	static float differenz;	
	static int  ende = 50;   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	fibonacci_folge();
	}

	public static void rechenspiele()
	{
	System.out.println( "Ergebnis: " +  ergebnis );
	if (ergebnis > eineZahlMitKomma )
	{
		differenz = (ergebnis - eineZahlMitKomma); 
	System.out.println ("Differenz: " + differenz);
	}
	else
	{
		System.out.println ("Das Ergebnis ist zu klein" ); 
	}
	}
	public static void ungerade()
	{
		for (int i = 1; i <= ende ; i += 2) 
		{
			System.out.println (i);
		}
	}
	
	
	public static void fibonacci_folge()
	{
		int ersteZahl = 1;
		int ergebnis2;	
		int letzteZahl = 1;
		
		while(ersteZahl < 600)
		{
			ergebnis2 = ersteZahl + letzteZahl;
			System.out.println (ergebnis2);
			ersteZahl = letzteZahl;
			letzteZahl = ergebnis2;
			
			
					
		}
		
			
			
			
	}
}
