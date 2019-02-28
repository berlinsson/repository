
public class passwort {

	public static void main(String[] args)
	{
	 zuCharArray("Mathis007!");

	}
	static boolean groﬂbuchstabe = false;
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
			System.out.println(charArray[i] + " ist ein Groﬂbuchstabe(true)");
			groﬂbuchstabe=true;
			}
		else
		{
			System.out.println(charArray[i] + " ist kein Groﬂbuchstabe(false)");
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
		
		if( groﬂbuchstabe==true && zahl==true && kleinbuchstabe==true && sonderzeichen==true && lang == true )
		{
			System.out.println("Passwort ist Sicher");
		}
		else
		{
			System.out.println("Passwort ist nicht Sicher");
		}
		if(!groﬂbuchstabe==true)
		{
			System.out.println("groﬂbuchstabe fehlt");
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

