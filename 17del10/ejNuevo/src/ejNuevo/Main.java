package ejNuevo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//Pasajero pasajero = new Pasasjero();
		Motor motor = new Motor(777,"XLR8","arrancable");
		Colectivo autobus = new Colectivo (123,29.50,0);
		int a = Integer.parseInt(JOptionPane.showInputDialog("Opociones\n1-Arrancar\n2-Ingresar pasajero\n3-Ver cantidad de pasajeros"));
		switch (a) {
		case 1:
			
			break;

		case 2:
			break;
		case 3:
			break;
		}

	}

}
