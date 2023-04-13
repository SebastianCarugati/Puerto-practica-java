package domain;

public class Velero extends Embarcacion {
	
	public Velero (){
		super("Velero", 3335, 50, 1995, 150);
	}

	@Override
	public Integer getPrecio() {
		return super.getPrecioAlquiler();
	}

	@Override
	public String toString() {
		return "Velero [toString()=" + super.toString() + "]";
	}
	
	
	

}
