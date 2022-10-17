package ejNuevo;

import javax.swing.JOptionPane;

public class Colectivo {
	private int patente;
	private double tarifa;
	private int cant_per;
	
	public Colectivo(int patente, double tarifa, int cant_per) {
		super();
		this.patente = patente;
		this.tarifa = tarifa;
		this.cant_per = cant_per;
	}
	public int getPatente() {
		return patente;
	}
	public void setPatente(int patente) {
		this.patente = patente;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	public int getCant_per() {
		return cant_per;
	}
	public void setCant_per(int cant_per) {
		this.cant_per = cant_per;
	}
	@Override
	public String toString() {
		return "Colectivo [patente=" + patente + ", tarifa=" + tarifa + "]";
	}
	
	public String arrancar(Motor motor) {
		if (motor.getEstado().equalsIgnoreCase("arrancable")) {
			return "el colectivo arranca con "+this.cant_per+" pasajeros";
		} else {
			return "el colectivo no puede arrancar, revisar motor";
		}
	}
	
	public void agregarPasajeros(int cantidad) {
		this.cant_per = getCant_per() + cantidad;
		JOptionPane.showMessageDialog(null, "ahora hay "+this.cant_per+" pasajeros en el colectivo");
	}
		
}