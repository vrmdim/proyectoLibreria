package es.mde.acing.utils;

import java.time.LocalDate;

public class OrdenRecepcionImpl extends Orden implements OrdenRecepcion{
	
	private LocalDate fRecepcion;
	private Tipo tipo;
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public LocalDate getfRecepcion() {
		return fRecepcion;
	}
	public void setfRecepcion(LocalDate fRecepcion) {
		this.fRecepcion = fRecepcion;
	}
	@Override
	public String toString() {
		return "OrdenRecepcion [fRecepcion=" + fRecepcion + ", tipo=" + tipo + "]";
	}

	
}
