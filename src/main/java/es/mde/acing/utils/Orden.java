package es.mde.acing.utils;

import java.util.ArrayList;
import java.util.List;

public abstract class Orden {

	private int numeroOrden;
	private String proveedor;
	private double costeTotal;
	private List<Articulo> articulos = new ArrayList<>();
	
	
	public int getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public double getCosteTotal() {
		return costeTotal;
	}
	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}
	public List<Articulo> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	@Override
	public String toString() {
		return "Orden [numeroOrden=" + numeroOrden + ", proveedor=" + proveedor + ", costeTotal="
				+ costeTotal + ", articulos=" + articulos + "]";
	}
	
	
	
}
