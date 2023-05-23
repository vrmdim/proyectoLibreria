package es.mde.acing.utils;


import java.util.List;

public class AlmacenImpl {
	
	private String nombre;
	private List<Articulo> articulos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Articulo> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + ", articulos=" + articulos + "]";
	}	
	
}
