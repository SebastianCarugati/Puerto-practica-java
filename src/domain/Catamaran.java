package domain;

public class Catamaran extends Embarcacion {

	public Catamaran (){
		super("Catamaran", 8599, 42, 2012, 150);
	}

	@Override
	public Integer getPrecio() {
		return super.getPrecioAlquiler();
	}

	@Override
	public String toString() {
		return "Catamaran [toString()=" + super.toString() + "]";
	}
	

}
