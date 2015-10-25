
public class HSeiteneffekte {
	public static int 	x=0, 
						y=0, 
						z=0;
	
	public static void main(String[] args){
		//a)
			resetVars();
			System.out.println("a)");
			System.out.println("  (x--)*(++y)- z-- liefert: " + Integer.toString((x--)*(++y)- z--) );
			System.out.println("  Die Werte der Variablen nach dem Ausführen sind:");
			System.out.println("  x = " + x + "  ;  y = " + y + "  ;  z = " + z);
			System.out.println("");
			
		//b
			resetVars();
			System.out.println("b)");
			System.out.println("  (x = --z) + (z = 2*y) - y-- + y++ liefert: " + Integer.toString((x = --z) + (z = 2*y) - y-- + y++) );
			System.out.println("  Die Werte der Variablen nach dem Ausführen sind:");
			System.out.println("  x = " + x + "  ;  y = " + y + "  ;  z = " + z);
			System.out.println("");
			
		//c)
			resetVars();
			System.out.println("c)");
			System.out.println("  z = (x = (y + (x=++y)- --z*x++)+42) liefert: " + Integer.toString(z = (x = (y + (x=++y)- --z*x++)+42) ));
			System.out.println("  Die Werte der Variablen nach dem Ausführen sind:");
			System.out.println("  x = " + x + "  ;  y = " + y + "  ;  z = " + z);
			System.out.println("");
	}
	
	public static void resetVars(){
		x=1;
		y=42;
		z=99;
	}
}
