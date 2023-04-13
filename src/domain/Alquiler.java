package domain;

import java.util.Objects;

public class Alquiler {
	
	private Cliente cliente;
	private Embarcacion embarcacion;
	private Integer dia_inicial;
	private Integer dia_final;
	private Integer numAmarre;
	private Integer precioFinal;
	private boolean finalizado;
	
	public Alquiler(Cliente cliente, Embarcacion embarcacion) {
		this.cliente = cliente;
		this.embarcacion = embarcacion;
		this.finalizado = false;
	}
	
	public Alquiler (Cliente cliente, Embarcacion embarcacion, Integer numAmarre) {
		this.cliente = cliente;
		this.embarcacion = embarcacion;
		this.numAmarre = numAmarre;
	
	}
	


	public Alquiler(Cliente cliente, Embarcacion embarcacion, Integer dia_inicial, Integer dia_final,
			Integer numAmarre) {
		this.cliente = cliente;
		this.embarcacion = embarcacion;
		this.dia_inicial = dia_inicial;
		this.dia_final = dia_final;
		this.numAmarre = numAmarre;
		this.finalizado = false;
		this.precioFinal = (dia_final - dia_inicial + 1)*embarcacion.getPrecioAlquiler();
	}
	
	

	public Integer getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(Integer precioFinal) {
		this.precioFinal = precioFinal;
	}
	

	public Integer getNumAmarre() {
		return numAmarre;
	}

	public void setNumAmarre(Integer numAmarre) {
		this.numAmarre = numAmarre;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Embarcacion getEmbarcacion() {
		return embarcacion;
	}

	public void setEmbarcacion(Embarcacion embarcacion) {
		this.embarcacion = embarcacion;
	}

	public Integer getDia_inicial() {
		return dia_inicial;
	}

	public void setDia_inicial(Integer dia_inicial) {
		this.dia_inicial = dia_inicial;
	}

	public Integer getDia_final() {
		return dia_final;
	}

	public void setDia_final(Integer dia_final) {
		this.dia_final = dia_final;
	}
	

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}





	



	@Override
	public String toString() {
		return "Alquiler [cliente=" + cliente + ", embarcacion=" + embarcacion + ", dia_inicial=" + dia_inicial
				+ ", dia_final=" + dia_final + ", numAmarre=" + numAmarre + ", finalizado=" + finalizado + "Precio final =" + precioFinal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, embarcacion, numAmarre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(embarcacion, other.embarcacion)
				&& Objects.equals(numAmarre, other.numAmarre);
	}


	
	



	
	


}
