package RelogioEmSegundo;
  
import java.util.Scanner;

import Relogio.Horario;

public class Principal {
	public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	Horario h = new Horario();
	
	System.out.println("Informe a quantidade de segs que ser� trasnformada: ");
	int valor = sc.nextInt();
	h.setSegundo(valor);
	
	System.out.println("\nS�o " + h.getHora()+" horas, "  + h.getMinuto()+ " minutos e " + h.getSegundo()+ " segundos.");
		
	}

}

/**
 * @author eloya
 *
 */
