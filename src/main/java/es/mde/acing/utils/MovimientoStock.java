package es.mde.acing.utils;

public interface MovimientoStock {

	public String getCodigoArticulo();
	
	public int getVariacionStock();
	
	public int getCantidadMin();
	
	public AlmacenImpl getAlmacen();
}
