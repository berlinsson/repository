
public class Harshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		harshad();
	}

	static public void harshad()
	{
		 for (int i = 1; i <= 100; i++)
	            if((i % Quersumme(i) == 0))
	                System.out.println(i);
	    }
	 
	    public static int Quersumme(int zahl)
	    {
	        if (zahl <= 9) return zahl;
	        return zahl%10 + Quersumme(zahl/10);
	    }
	}

