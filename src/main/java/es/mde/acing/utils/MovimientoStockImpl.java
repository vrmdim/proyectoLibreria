package es.mde.acing.utils;

public class MovimientoStockImpl implements MovimientoStock {

	private String codigoArticulo;
	private int variacionStock;
	private int cantidadMin;
	private AlmacenImpl almacen;
	
	
	public String getCodigoArticulo() {
		return codigoArticulo;
	}
	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}
	public int getVariacionStock() {
		return variacionStock;
	}
	public void setVariacionStock(int variacionStock) {
		this.variacionStock = variacionStock;
	}
	public int getCantidadMin() {
		return cantidadMin;
	}
	public void setCantidadMin(int cantidadMin) {
		this.cantidadMin = cantidadMin;
	}
	public AlmacenImpl getAlmacen() {
		return almacen;
	}
	public void setAlmacen(AlmacenImpl almacen) {
		this.almacen = almacen;
	}
	@Override
	public String toString() {
		return "MovimientoStockImpl [codigoArticulo=" + codigoArticulo + ", variacionStock=" + variacionStock
				+ ", cantidadMin=" + cantidadMin + ", almacen=" + almacen + "]";
	}
	
}
