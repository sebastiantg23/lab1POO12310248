package proyectopractica;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int dia;

	        System.out.println("Ingrese un numero de la semana (1-7) :");
	        dia = scanner.nextInt();
	        
		
		switch(dia) {

        case 1:
            System.out.println(" El dia es Lunes");
            break;
        case 2:
            System.out.println(" El dia Martes");
            break;
        case 3:
            System.out.println("Miercoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sabado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Incorrecto");
            break;
    }

	}

}
