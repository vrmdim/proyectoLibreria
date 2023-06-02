package es.mde.acing.utils;

import java.util.List;

public interface Articulo {

	public String getDescripcion();

	public String getCodigo();

	public double getPrecio();

	public AlmacenImpl getAlmacen();
	
	public List<Orden> getOrdenes();
	
	public int getCantidad();

	
}
