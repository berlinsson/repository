
public class passwort {

	public static void main(String[] args)
	{
	 zuCharArray("Mathis007!");

	}
	static boolean gro�buchstabe = false;
	static boolean zahl = false;
	static boolean kleinbuchstabe = false;
	static boolean sonderzeichen = false;
	static boolean lang = false;
	
 public static void zuCharArray(String p)
 {
	 System.out.println(p);
	 char[] charArray = p.toCharArray();
	 
	 for (int i = 0; i < charArray.length; i++) 
	 {
		if (Character.isUpperCase(charArray[i]))
		{
			System.out.println(charArray[i] + " ist ein Gro�buchstabe(true)");
			gro�buchstabe=true;
			}
		else
		{
			System.out.println(charArray[i] + " ist kein Gro�buchstabe(false)");
		}
	 }
		
		for (int j = 0; j < charArray.length; j++) 
		 {
			if (Character.isDigit(charArray[j]))
			{
				System.out.println(charArray[j] + " ist ein Zahl(true)");
				zahl=true;
				}
			else
			{
				System.out.println(charArray[j] + " ist kein Zahl(false)");
			}
		
	}
		for (int k = 0; k < charArray.length; k++) 
		 {
			if (Character.isLowerCase(charArray[k]))
			{
				System.out.println(charArray[k] + " ist ein Kleinbuchstabe(true)");
				kleinbuchstabe=true;
				}
			else
			{
				System.out.println(charArray[k] + " ist kein Kleinbuchstabe(false)");
			}
		
	}
		for (int l = 0; l < charArray.length; l++) 
		 {
			if (!Character.isLetterOrDigit(charArray[l]))
			{
				System.out.println(charArray[l] + " ist ein Sonderzeichen(true)");
				sonderzeichen=true;
				}
			else
			{
				System.out.println(charArray[l] + " ist kein Sonderzeichen(false)");
			}
		
	}
		if (charArray.length >= 8)
		{
			System.out.println("Passwort lang genug");
			lang=true;
		}
			else
			{
				System.out.println("Passwort zu Kurz");
		}
		
		if( gro�buchstabe==true && zahl==true && kleinbuchstabe==true && sonderzeichen==true && lang == true )
		{
			System.out.println("Passwort ist Sicher");
		}
		else
		{
			System.out.println("Passwort ist nicht Sicher");
		}
		if(!gro�buchstabe==true)
		{
			System.out.println("gro�buchstabe fehlt");
		}
		if(!zahl==true)
		{
			System.out.println("Zahl fehlt");
		}
		if(!kleinbuchstabe==true)
		{
			System.out.println("Kleinbuchstabe fehlt");
		}
		if(!lang==true)
		{
			System.out.println("Passwort zu kurz");
		}
		if(!sonderzeichen==true)
		{
			System.out.println("Sondezeichen fehlt");
		}
 }
}

