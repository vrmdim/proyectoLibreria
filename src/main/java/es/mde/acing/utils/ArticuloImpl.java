package es.mde.acing.utils;

import java.util.List;

public class ArticuloImpl implements Articulo {
	
	private String codigo;
	private String descripcion;
	private double precio;
	private int cantidad;
	private AlmacenImpl almacen;
	private List<Orden> ordenes;

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public AlmacenImpl getAlmacen() {
		return almacen;
	}
	public void setAlmacen(AlmacenImpl almacen) {
		this.almacen = almacen;
	}
	public List<Orden> getOrdenes() {
		return ordenes;
	}
	public void setOrdenes(List<Orden> ordenes) {
		this.ordenes = ordenes;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "ArticuloImpl [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad="
				+ cantidad + ", almacen=" + almacen + ", ordenes=" + ordenes + "]";
	}

	
	
	
	
	
}
