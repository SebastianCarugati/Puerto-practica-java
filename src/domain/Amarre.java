package domain;

import java.util.Objects;

public class Amarre {
	private Integer identificador;
	private boolean ocupado;
	private Embarcacion embarcacion;
	
	
	public Amarre(Integer identificador) {
		this.identificador = identificador;
		ocupado = false;
	}


	public Integer getIdentificador() {
		return identificador;
	}


	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}


	public boolean isOcupado() {
		return ocupado;
	}


	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}


	public Embarcacion getEmbarcacion() {
		return embarcacion;
	}


	public void setEmbarcacion(Embarcacion embarcacion) {
		this.embarcacion = embarcacion;
	}


	@Override
	public String toString() {
		return "Amarre [identificador=" + identificador + ", ocupado=" + ocupado + ", embarcacion=" + embarcacion + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Amarre other = (Amarre) obj;
		return Objects.equals(identificador, other.identificador);
	}



	

	
	

	
	
	

}
