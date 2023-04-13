package domain;

import java.util.Objects;

public abstract class Embarcacion {
	private String tipo;
	private Integer matricula;
	private Integer eslora;
	private Integer anio_fab;
	private Integer precioAlquiler;
	private String cantidadRuedas;
	public abstract Integer getPrecio();
	
	
	public Embarcacion(String tipo, Integer matricula, Integer eslora, Integer anio_fab, Integer precioAlquiler) {
		super();
		this.tipo = tipo;
		this.matricula = matricula;
		this.eslora = eslora;
		this.anio_fab = anio_fab;
		this.precioAlquiler = precioAlquiler;
	}
	
	
	public Embarcacion (Integer precioAlquiler, String cantidadRuedas) {
		super();
		this.precioAlquiler = precioAlquiler;
		this.setCantidadRuedas(cantidadRuedas);
	}





	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public Integer getEslora() {
		return eslora;
	}
	public void setEslora(Integer eslora) {
		this.eslora = eslora;
	}
	public Integer getAnio_fab() {
		return anio_fab;
	}
	public void setAnio_fab(Integer anio_fab) {
		this.anio_fab = anio_fab;
	}
	
	public Integer getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(Integer precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	

	



	@Override
	public String toString() {
		return "Embarcacion [tipo=" + tipo + ", matricula=" + matricula + ", eslora=" + eslora + ", anio_fab="
				+ anio_fab + ", precioAlquiler=" + precioAlquiler + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(anio_fab, eslora, matricula, tipo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Embarcacion other = (Embarcacion) obj;
		return Objects.equals(anio_fab, other.anio_fab) && Objects.equals(eslora, other.eslora)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(tipo, other.tipo);
	}


	public String getCantidadRuedas() {
		return cantidadRuedas;
	}


	public void setCantidadRuedas(String cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}
	
	
	
	

}
