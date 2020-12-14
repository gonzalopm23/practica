package ejerciciosarrays;

public class Mecanico {
	private String nombre;
	private String dni;
	private boolean disponible;
	private Coche cocheAsignado;
	
	public Mecanico(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public boolean isDisponible() {
		return disponible;
	}
	
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Coche getCocheAsignado() {
		return cocheAsignado;
	}

	public void asignarCoche(Coche cocheAsignado) {
		this.cocheAsignado = cocheAsignado;
	}
	
	public void reparar() {
		disponible = false;
	}
	
	public void terminarReparacion() {
		disponible = true;
		asignarCoche(null);
	}

	public void mostrarInfo() {
		System.out.println("Nombre: "+nombre+"\nDNI: "+dni+"\nDisponible: "+disponible);
		if (cocheAsignado == null) {
			System.out.println("Ningún coche asignado.");
		} else {
			System.out.println("Matrícula de coche asignado: "+cocheAsignado.getMatricula());
		}
	}
	
	
}
