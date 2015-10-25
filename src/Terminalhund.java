
public class Terminalhund {
	public static void main(String[] args){
		//Kopf
			print(" ",16);
			print("+",8);
			newLine();
			
			print(" ",16);
			print("+");
			print(" ",3);
			print("*");
			print(" ",2);
			print("+");
			newLine();
			
			print(" ",16);
			print("+");
			print(" ",6);
			print("+");
			newLine();
			
			print(" ",16);
			print("+",8);
			newLine();
			
		//Hals
			for(int n=0 ; n<2 ; n++){
				print(" ",16);
				print("+",4);
				print(" ",4);
				newLine();
			}
		
		//Rumpf
			print("+");
			print(" ",2);
			print("*",17);
			print(" ",4);
			newLine();
			
			print("+",3);
			print("*",17);
			print(" ",4);
			newLine();
			
			for(int n=0 ; n<3 ; n++){
				print(" ",3);
				print("*",17);
				print(" ",4);
				newLine();
			}
			
		//Beine
			for(int n=0 ; n<2 ; n++){
				print(" ",4);
				print("*");
				print(" ",13);
				print("*");
				print(" ",5);
				newLine();
			}
			
			print(" ",4);
			print("*",3);
			print(" ",11);
			print("*",3);
			print(" ",3);
	}
	
	public static void print(String a , int b){
		for (int n = 0 ; n < b ; n++){
			print(a);
		}
	}
	
	public static void print(String a){
		System.out.print(a);
	}
	
	public static void newLine(){ //so ist klarer, was passiert...
		System.out.println("");
	}
}
