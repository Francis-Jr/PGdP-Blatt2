import java.util.Scanner;


public class BartSimpson {
	
	private static String text = "Ich darf während der Vorlesung nicht Computer spielen!";
	private static int amount = 100;
	
	public static void main(String[] args){
		//kleiner Dialog am Anfang
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hallo Bart! Wie oft musst du den text abschreiben?   ");
		amount = keyboard.nextInt();
		System.out.println("Alles klar, hier kommen " + amount + " Zeilen:");
		System.out.println("");
		
		//Zeilen
		for(int n = 0 ; n<amount ; n++){
			System.out.println("[" + (n+1) + "] " + ((n+1)/10 != 0 ? ((n+1)/100 != 0 ? "" : " ") : "  ") + text);
		}
	}
}
