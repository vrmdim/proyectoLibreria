package es.mde.acing.utils;

import java.time.LocalDate;

public class OrdenPedidoImpl extends Orden implements OrdenPedido{
	
	private LocalDate fPedido;

	public LocalDate getfPedido() {
		return fPedido;
	}

	public void setfPedido(LocalDate fPedido) {
		this.fPedido = fPedido;
	}

	@Override
	public String toString() {
		return "OrdenPedido [fPedido=" + fPedido + "]";
	}
	
	
}
