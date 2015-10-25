
public class Symbolhaeuschen {
	
	private static int	housewidth = 14, //muss gerade sein, muss größergleich als innerwidth+2 sein
						househeight = 6, //muss größergleich als innerheight+2 sein
						innerwidth = 10, //muss gerade sein
						innerheight = 1; 

	public static void main(String[] args) {
		//Dach
		for(int z = 0 ; z<housewidth/2 ; z++){ //z iteriert durch Zeilennummer
			for(int s = 0 ; s < housewidth/2-(z+1) ; s++){ // s iteriert durch Spaltennummer im jeweiligen Abschnitt
				System.out.print(" ");
			}
			for(int s = 0 ; s < 2*(z+1) ; s++){
				System.out.print("*");
			}
			for(int s = 0 ; s < housewidth/2-(z+1) ; s++){
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		//Haus
		//-->Decke
		for(int z=0 ; z<(househeight-innerheight)/2 ; z++ ){
			for(int s=0 ; s<housewidth ; s++){
				System.out.print("+");
			}
			System.out.println("");
		}
		//-->Wände
		for(int z=0 ; z<innerheight ; z++ ){
			for(int s=0 ; s<(housewidth-innerwidth)/2 ; s++){
				System.out.print("+");
			}
			for(int s=0 ; s<innerwidth; s++){
				System.out.print(" ");
			}
			for(int s=0 ; s<(housewidth-innerwidth)/2 ; s++){
				System.out.print("+");
			}
			System.out.println("");
		}
		//-->Boden
		for(int z=0 ; z<(househeight-innerheight)/2 ; z++ ){
			for(int s=0 ; s<housewidth ; s++){
				System.out.print("+");
			}
			System.out.println("");
		}
		//Korrekturboden für ungerade innerheight
		if(innerheight%2==1){
			for(int s=0 ; s<housewidth ; s++){
				System.out.print("+");
			}
			System.out.println("");
		}
	}

}
