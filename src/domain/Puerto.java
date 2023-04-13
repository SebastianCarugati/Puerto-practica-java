package domain;

import java.util.ArrayList;
import java.util.List;


public class Puerto {

	private static final int CANTIDAD_PUESTOS = 5;
	private List<Amarre> amarres;
	private List<Alquiler> alquileres;

	public Puerto() {
		amarres = new ArrayList<>();
		inicializarAmarre();
		alquileres = new ArrayList<>();
	}

	public List<Amarre> getAmarre() {
		return amarres;
	}

	public void setAmarre(List<Amarre> amarres) {
		this.amarres = amarres;
	}

	public void addAmarre(Amarre amarre) {
		if (amarres.size() < CANTIDAD_PUESTOS) {
			amarres.add(amarre);
		} else {
			System.out.println("No hay mas amarres disponbiles");
		}
	}

	public List<Alquiler> getAlquiler() {
		return alquileres;
	}

	public void setAlquiler(List<Alquiler> alquiler) {
		this.alquileres = alquiler;
	}

	public void addAlquiler(Alquiler alquiler) {
		alquileres.add(alquiler);
	}

	public void mostrarAmarre() {
		System.out.println("Lista de amarres");
		for (Amarre amarre : amarres) {
			System.out.println(amarre.toString());
		}
	}

	public void mostrarAlquiler() {
		System.out.println("Lista de alquileres");
		for (Alquiler alquiler : alquileres) {
			System.out.println(alquiler.toString());
		}
	}
	
	
	@SuppressWarnings("unused")
	private void mostrarAnfibio(Embarcacion embarcacion) {
		if (embarcacion instanceof Anfibio) {
			((Anfibio) embarcacion).getCantRuedas();
			((Anfibio) embarcacion).velocidad();}
		}
		

	private void inicializarAmarre() {
		for (int i = 0; i < CANTIDAD_PUESTOS; i++) {
			amarres.add(new Amarre(i + 1));
		}
	}

	public void asignarAlquiler(Cliente cliente, Embarcacion embarcacion, Integer dia_inicial, Integer dia_final, Integer numAmarre) {
		System.out.println("Asignacion de alquiler");

		
		Amarre amarre = buscarAmarre();
		if (amarre != null) {
			amarre.setOcupado(true);
			amarre.setEmbarcacion(embarcacion);
			Alquiler alquiler = new Alquiler(cliente, embarcacion, dia_inicial, dia_final, numAmarre);
			alquileres.add(alquiler);
		} else {
			System.out.println("No hay amarres disponibles");
		}
	}
	
	

	private Amarre buscarAmarre() {
		for (Amarre amarre : amarres)
			if (!amarre.isOcupado()) {
				System.out.println("Amarre numero: " + amarre.getIdentificador());
				return amarre;
			}
		System.out.println("No hay amarres disponibles");
		return null;
	}

	
	
	public void liberarAlquiler(Cliente cliente, Embarcacion embarcacion, Integer numAmarre) {
		System.out.println("Liberar Alquiler");

		
		Amarre amarre = buscarAmarrePorNumero(numAmarre);
		if (amarre != null) {
			if (amarre.isOcupado()) {
				amarre.setOcupado(false);
				amarre.setEmbarcacion(null);
				
				
				
				// 	FINALIZAR SERVICIO
				Alquiler alquiler = buscarServicioAFinalizar(cliente, embarcacion, numAmarre);
				if (alquiler != null) {
					(alquiler).setFinalizado(true);
				}
			} else {
				System.out.println("ERROR: El puesto nro: " + numAmarre + " no estaba ocupado");
			}
		} else {
			System.out.println("ERROR: No se encontro puesto para nro: " + numAmarre);
		}
	}

	
	private Alquiler buscarServicioAFinalizar(Cliente cliente, Embarcacion embarcacion, Integer numAmarre) {
		Alquiler alquilerABuscar = new Alquiler(cliente, embarcacion, numAmarre);
		for (Alquiler alquiler : alquileres) {
			if (alquiler.equals(alquilerABuscar)) {
				System.out.println("Alquiler : " + alquiler.toString());
				if (!alquiler.isFinalizado()) {
					return alquiler;
				}
			} else {
				System.out.println("El alquiler: " + alquilerABuscar);
			}
		}
		System.out.println("El alquiler: " + alquilerABuscar + " no existe");
		return null;
	}

	private Amarre buscarAmarrePorNumero(Integer numAmarre) {
		Amarre amarreABuscar = new Amarre(numAmarre);
		for (Amarre amarre : amarres) {
			if (amarre.equals(amarreABuscar)) {
				System.out.println("Amarre encontrado" + numAmarre);
				return amarre;
			}
		}
		System.out.println("El amarre : " + numAmarre + "no existe");
		return null;
	}

}
