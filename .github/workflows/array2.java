
public class array2 {
public static void main(String[]args){
	
	boolean [] ampoules = new boolean[100];
	
	for ( int i = 1; i<=100; i++) {
		
		System.out.print("toggle multiple de " + i +"-->\t");
	
	for(int j = 1; j< ampoules.length-1; j++) {
		
		if ((j) % i == 0) {
			ampoules[j+1] =! (ampoules[j+1]);
		}
		if((ampoules[j+1])==true)
		System.out.print("1");
		else System.out.print("0");
	
		}
	System.out.println();

       }
	}
}
