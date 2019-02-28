import java.util.ArrayList;
import java.util.List;
public class ArrayUebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wochentage();
		monate();
		//array();
		ausgabe();
		
	}

	static List<String> dieWochentage = new ArrayList<String>();
	static List<String> dieMonate = new ArrayList<String>();
	static List<Integer> monatsTage = new ArrayList<Integer>();
	public static void wochentage()
	{
		dieWochentage.add("Montag");
		dieWochentage.add("Dienstag");
		dieWochentage.add("Mittwoch");
		dieWochentage.add("Donnerstag");
		dieWochentage.add("Freitag");
		dieWochentage.add("Samstag");
		dieWochentage.add("Sonntag");
		
		/*einArray.set(4, "noch nicht Freitag");
		System.out.println(einArray.get(4));*/
	}
	public static void array()
	{
		System.out.println(monatsTage);
	}
	public static void monate()
	{
		dieMonate.add("Januar");
		dieMonate.add("Februar");
		dieMonate.add("Maerz");
		dieMonate.add("April");
		dieMonate.add("Mai");
		dieMonate.add("Juni");
		dieMonate.add("Juli");
		dieMonate.add("August");
		dieMonate.add("September");
		dieMonate.add("Oktober");
		dieMonate.add("November");
		dieMonate.add("Dezember");
		
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(28);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
	}
	public static void ausgabe()
	{
		for(int i = 0; i< dieMonate.size();i++)
		{
			System.out.println("Der Monat " + dieMonate.get(i) + " hat genau " + monatsTage.get(i) + " Tage!");
		}
	}
}
	
