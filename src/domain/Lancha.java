package domain;

public class Lancha extends Embarcacion {


	public Lancha (){
		super("Lancha", 3312, 8, 2017, 50);
	}

	@Override
	public Integer getPrecio() {
		return super.getPrecioAlquiler();
	}

	@Override
	public String toString() {
		return "Lancha [toString()=" + super.toString() + "]";
	}
	}


