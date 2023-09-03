package proyectopractica;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numA = 3;
		int numB = 4;
		
		if(numA > 0 && numB > 0) {
			System.out.print(true);
		}else if (numA > 0 && numB < 0) {
			System.out.print(false);
		}else if (numA < 0 && numB < 0) {
			System.out.print(true);
		}else if(numA < 0 && numB > 0){
			System.out.print(false);
		}
		
	}
	
	
}
