package domain;

public class Anfibioneta extends Embarcacion implements Anfibio{
	
	
	public Anfibioneta () {
		super("Anfibio", 0101, 10, 2015, 175);
	}

	
	
	@Override
	public Integer getPrecio() {
		return super.getPrecioAlquiler();
	}

	@Override
	public int getCantRuedas() {
		return 6;
		
	}

	@Override
    public int velocidad() {
		return 350;
		
	}



	@Override
	public String toString() {
		return "Anfibioneta [getCantRuedas()=" + getCantRuedas() + ", velocidad()=" + velocidad() + ", toString()="
				+ super.toString() + "]";
	}

 
	

}
