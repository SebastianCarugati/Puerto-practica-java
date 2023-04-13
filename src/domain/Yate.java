package domain;

public class Yate extends Embarcacion {
	
	public Yate (){
		super("Yate", 0000, 20, 2022, 200);
	}

	@Override
	public Integer getPrecio() {
		return super.getPrecioAlquiler();
	}

	@Override
	public String toString() {
		return "Yate [toString()=" + super.toString() + "]";
	}
	
	

}
