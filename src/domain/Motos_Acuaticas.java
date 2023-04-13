package domain;

public class Motos_Acuaticas extends Embarcacion {

	public Motos_Acuaticas (){
		super("Moto Acuatica", 9999, 5, 2020, 25);
	}

	@Override
	public Integer getPrecio() {
		return super.getPrecioAlquiler();
	}

	@Override
	public String toString() {
		return "Moto Acuatica [toString()=" + super.toString() + "]";
	}

}
